package listener.main;

import static listener.main.BytecodeGenListenerHelper.getFunName;

import java.util.HashMap;
import java.util.Map;

import generated.MiniJavaParser;
import generated.MiniJavaParser.MainMethodContext;
import generated.MiniJavaParser.MethodContext;
import listener.main.SymbolTable.*;

public class SymbolTable {
	enum Type {
		INT, INTARRAY, VOID, ERROR, BOOLEAN
	}

	static public class VarInfo {
		Type type;
		int id;
		int initVal;
		boolean initbool;

		public VarInfo(Type type, int id, int initVal) {
			this.type = type;
			this.id = id;
			this.initVal = initVal;
		}

		public VarInfo(Type type, int id, boolean initbool) {
			this.type = type;
			this.id = id;
			this.initbool = initbool;
		}

		public VarInfo(Type type, int id) {
			this.type = type;
			this.id = id;
			this.initVal = 0;
		}
	}

	static public class FInfo {
		public String sigStr;
	}

	private Map<String, VarInfo> _lsymtable = new HashMap<>(); // local v.
	private Map<String, VarInfo> _gsymtable = new HashMap<>(); // global v.
	private Map<String, FInfo> _fsymtable = new HashMap<>(); // function

	private int _globalVarID = 0;
	private int _localVarID = 0;
	private int _labelID = 0;
	private int _tempVarID = 0;

	SymbolTable() {
		initFunDecl();
		initFunTable();
	}

	void initFunDecl() { // at each func decl
		_localVarID = 0;
		_labelID = 0;
		_tempVarID = 32;
		// _lsymtable = new HashMap<>();
	}

	private void initFunTable() {
		FInfo printlninfo = new FInfo();
		printlninfo.sigStr = "java/io/PrintStream/println(I)V";

		FInfo maininfo = new FInfo();
		maininfo.sigStr = "main([Ljava/lang/String;)V";
		_fsymtable.put("_print", printlninfo);
		_fsymtable.put("main", maininfo);
	}

	// 지역 변수 이름을 키 값으로 하고
	// 타입과 스택에 저장할 장소를 나타내는 _localVarID를 묶어서 _lsymtable에 넣는 메소드.
	void putLocalVar(String varname, Type type) {
		VarInfo localvarinfo = new VarInfo(type, _localVarID);
		_localVarID++;
		_lsymtable.put(varname, localvarinfo);
		// <Fill here>
	}

	// 전역 변수 이름을 키 값으로 하고
	// 타입과 스택에 저장할 장소를 나타내는 _globalVarID를 묶어서 _gsymtable에 넣는 메소드.
	void putGlobalVar(String varname, Type type) {
		VarInfo globalvarinfo = new VarInfo(type, _globalVarID);
		_globalVarID++;
		_gsymtable.put(varname, globalvarinfo);
		// <Fill here>
	}

	void putParams(MiniJavaParser.ParametersContext params) {
		// 만약 ,면 건너 뛴다.
		for (int i = 0; i <= params.parameter().size(); i++) {
			if (params.getChild(i).getText().equals(",")) {
				continue;
			}
			// 가져온 인수들의 타입이 int면,
			// 지역 변수 이름을 키 값으로 하고
			// 타입과 스택에 저장할 장소를 나타내는 _localVarID를 묶어서 _lsymtable에 넣어준다.
			if (params.getChild(i).getChild(0).getText().equals("int")) {
				VarInfo localvarinfo = new VarInfo(Type.INT, _localVarID);
				_localVarID++;
				_lsymtable.put(params.getChild(i).getChild(1).getText(), localvarinfo);
			} else if (params.getChild(i).getChild(0).getText().equals("boolean")) {
				VarInfo localvarinfo = new VarInfo(Type.BOOLEAN, _localVarID);
				_localVarID++;
				_lsymtable.put(params.getChild(i).getChild(1).getText(), localvarinfo);
			}
			// <Fill here>
		}
	}

	public String putFunSpecStr(MainMethodContext ctx) {
		String fname = getFunName(ctx);
		String argtype = "";
		String rtype = "";
		String res = "";

		argtype += "";
		rtype = "V";

		// 구한 것을 합침.
		res = fname + "(" + argtype + ")" + rtype;

		// 함수 이름으로 키 값으로 하고 값을 위에서 구한 res로 하여 _fsymtable에 저장.
		FInfo finfo = new FInfo();
		finfo.sigStr = res;
		_fsymtable.put(fname, finfo);

		return res;
	}

	// 함수 형태를 가져와서 jvm 함수 형태로 저장하는 함수.
	// ex) add(II)I 형태를 만들고 저장한다.
	public String putFunSpecStr(MethodContext ctx) {
		String fname = getFunName(ctx);
		String argtype = "";
		String rtype = "";
		String res = "";

		// 인수의 값이 int인지 void인지 구분해서 I나 V를 넣어준다.
		// 사실 인수로 void를 줄 경우가 없기에 쓸 필요는 없다.
		// 만약 인수가 없다면 건너 뛴다.
		if (ctx.getChildCount() < 6) {
			argtype += "";
		} else {
			for (int i = 0; i < ctx.getChild(4).getChildCount(); i++) {
				if (i % 2 != 0) {
					continue;
				} else {
					if (ctx.getChild(4).getChild(i).getText().contains("int")) {
						argtype += "I";
					}
					if (ctx.getChild(4).getChild(i).getText().contains("void")) {
						argtype += "V";
					}
					if (ctx.getChild(4).getChild(i).getText().contains("boolean")) {
						argtype += "Z";
					}
				}
			}
		}

		// 함수 반환 값이 int인지 void인지 구분해서 rtype에 저장.
		if (ctx.getChild(1).getText().equals("int")) {
			rtype = "I";
		} else if (ctx.getChild(1).getText().equals("void")) {
			rtype = "V";
		} else if (ctx.getChild(1).getText().equals("boolean")) {
			rtype = "Z";
		}
		// <Fill here>

		// 구한 것을 합침.
		res = fname + "(" + argtype + ")" + rtype;

		// 함수 이름으로 키 값으로 하고 값을 위에서 구한 res로 하여 _fsymtable에 저장.
		FInfo finfo = new FInfo();
		finfo.sigStr = res;
		_fsymtable.put(fname, finfo);

		return res;
	}
}
