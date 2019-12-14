package listener.main;

import static listener.main.BytecodeGenListenerHelper.*;

import java.util.HashMap;
import java.util.Map;

import generated.MiniJavaParser;
import generated.MiniJavaParser.MethodContext;
import generated.MiniJavaParser.LocalVariableDeclarationStatementContext;
import generated.MiniJavaParser.MainMethodContext;
import generated.MiniJavaParser.FieldContext;
import listener.main.SymbolTable.FInfo;
import listener.main.SymbolTable.Type;
import listener.main.SymbolTable.VarInfo;

public class SymbolTable {
   enum Type {
      INT, INTARRAY, VOID, ERROR, BOOLEAN
   }
   
   static public class VarInfo {
      Type type; 
      int id;
      int initVal;
      boolean initbool;
      
      public VarInfo(Type type,  int id, int initVal) {
         this.type = type;
         this.id = id;
         this.initVal = initVal;
      }
      public VarInfo(Type type,  int id, boolean initbool) {
         this.type = type;
         this.id = id;
         this.initbool = initbool;
      }
      public VarInfo(Type type,  int id) {
         this.type = type;
         this.id = id;
         this.initVal = 0;
      }
   }
   
   static public class FInfo {
      public String sigStr;
   }
   
   private Map<String, VarInfo> _lsymtable = new HashMap<>();   // local v.
   private Map<String, VarInfo> _gsymtable = new HashMap<>();   // global v.
   private Map<String, FInfo> _fsymtable = new HashMap<>();   // function 
   private String classname;   
      
   private int _globalVarID = 0;
   private int _localVarID = 0;
   private int _labelID = 0;
   private int _tempVarID = 0;
   
   SymbolTable(){
      initFunDecl();
      initFunTable();
   }
   
   void initFunDecl(){      // at each func decl
      _localVarID = 0;
      _labelID = 0;
      _tempVarID = 32;
      //_lsymtable = new HashMap<>();
   }
   
   void putclassname(String classname) {
      this.classname = classname;
   }
   
   String getclassname() {
      return classname;
   }
   // 지역 변수 이름을 키 값으로 하고 
   // 타입과 스택에 저장할 장소를 나타내는 _localVarID를 묶어서  _lsymtable에 넣는 메소드.
   void putLocalVar(String varname, Type type){
      VarInfo localvarinfo = new VarInfo(type, _localVarID);
      _localVarID++;
      _lsymtable.put(varname, localvarinfo);
      //<Fill here>
   }
   
   // 전역 변수 이름을 키 값으로 하고 
   // 타입과 스택에 저장할 장소를 나타내는 _globalVarID를 묶어서  _gsymtable에 넣는 메소드.
   void putGlobalVar(String varname, Type type){
      VarInfo globalvarinfo = new VarInfo(type, _globalVarID);
      _globalVarID++;
      _gsymtable.put(varname, globalvarinfo);
      //<Fill here>
   }
   
   void putLocalVarWithInitVal(String varname, Type type, boolean initVar){
      VarInfo localvarinfo = new VarInfo(type, _localVarID, initVar);
      _localVarID++;
      _lsymtable.put(varname, localvarinfo);
      //<Fill here>
   }
   
   // 지역 변수 선언할 때 초기화까지 같이 했을 때 수행되는 메소드.
   // 마찬가지로 지역 변수 이름을 키 값으로 하고
   // 타입과 스택에 저장할 장소를 나타내는 _localVarID를 묶어서  _lsymtable에 넣는 메소드.
   void putLocalVarWithInitVal(String varname, Type type, int initVar){
      
      VarInfo localvarinfo = new VarInfo(type, _localVarID, initVar);
      _localVarID++;
      _lsymtable.put(varname, localvarinfo);
      //<Fill here>
   }
   
   // 전역 변수 선언할 때 초기화까지 같이 했을 때 수행되는 메소드.
   // 마찬가지로 전역 변수 이름을 키 값으로 하고 
   // 타입과 스택에 저장할 장소를 나타내는 _globalVarID를 묶어서  _gsymtable에 넣는 메소드.
   void putGlobalVarWithInitVal(String varname, Type type, int initVar){
      VarInfo globalvarinfo = new VarInfo(type, _globalVarID, initVar);
      _globalVarID++;
      _gsymtable.put(varname, globalvarinfo);
      //<Fill here>
   
   }
   
   // 인자를 처리하는 함수.
   void putParams(MiniJavaParser.ParametersContext params) {
      // 만약 ,면 건너 뛴다.
      for(int i = 0; i <= params.parameter().size(); i++) {
         if(params.getChild(i).getText().equals(",")) {
            continue;
         }
         // 가져온 인수들의 타입이 int면,
         // 지역 변수 이름을 키 값으로 하고 
         // 타입과 스택에 저장할 장소를 나타내는 _localVarID를 묶어서  _lsymtable에 넣어준다.
         if(params.getChild(i).getChild(0).getText().equals("int")) {
            VarInfo localvarinfo = new VarInfo(Type.INT, _localVarID);
            _localVarID++;
            _lsymtable.put(params.getChild(i).getChild(1).getText(), localvarinfo);
         } else if(params.getChild(i).getChild(0).getText().equals("boolean")) {
            VarInfo localvarinfo = new VarInfo(Type.BOOLEAN, _localVarID);
            _localVarID++;
            _lsymtable.put(params.getChild(i).getChild(1).getText(), localvarinfo);
         }
      //<Fill here>
      }
   }
   
   private void initFunTable() {
      FInfo printlninfo = new FInfo();
      printlninfo.sigStr = "java/io/PrintStream/println()V";
      
      FInfo classinfo = new FInfo();
      
      
      FInfo maininfo = new FInfo();
      maininfo.sigStr = "main([Ljava/lang/String;)V";
      _fsymtable.put("_print", printlninfo);
      _fsymtable.put("main", maininfo);
   }
   
   // 인자 값의 타입이 String일 때 실행.
   // 함수 이름을 키 값으로 해서 _fsymtable안의 값을 불러오는 함수.
   public String getFunSpecStr(String fname) {
      FInfo value = _fsymtable.get(fname);
      String s = "";
      s = value.sigStr;
      // <Fill here>
      return s;
   }

   // 인자 값의 타입이 Fun_declContext일 때 실행.
   // fname + "(" + param + ")" 형태 이므로 첫번째 것을 가져와서 반환.
   public String getFunSpecStr(MethodContext ctx) {   
      return ctx.getChild(0).getText();
      // <Fill here>
   }
   
   public String putFunSpecStr(MainMethodContext ctx) {
      String fname = getFunName(ctx);
      String argtype = "";   
      String rtype = "";
      String res = "";
      
      argtype += "";
      rtype = "V";

      // 구한 것을 합침.
      res =  fname + "(" + argtype + ")" + rtype;
      
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
      if(ctx.getChildCount() < 6) {
         argtype += "";
      } else {
         for(int i = 0; i < ctx.getChild(4).getChildCount(); i++) {
            if(i%2 != 0) {
               continue;
            } else {
               if(ctx.getChild(4).getChild(i).getText().contains("int")) {
                  argtype += "I";
               }
               if(ctx.getChild(4).getChild(i).getText().contains("void")) {
                  argtype += "V";
               }
               if(ctx.getChild(4).getChild(i).getText().contains("boolean")) {
                  argtype += "Z";
               }
            }
         }
      }
      
      // 함수 반환 값이 int인지 void인지 구분해서 rtype에 저장.
      if(ctx.getChild(1).getText().equals("int")) {
         rtype = "I";
      } else if(ctx.getChild(1).getText().equals("void")) {
         rtype = "V";
      } else if(ctx.getChild(1).getText().equals("boolean")) {
         rtype = "Z";
      }
      // <Fill here>   
      
      // 구한 것을 합침.
      res =  fname + "(" + argtype + ")" + rtype;
      
      // 함수 이름으로 키 값으로 하고 값을 위에서 구한 res로 하여 _fsymtable에 저장.
      FInfo finfo = new FInfo();
      finfo.sigStr = res;
      _fsymtable.put(fname, finfo);
      
      return res;
   }
   
   // 변수 이름을 키 값으로 하여 id를 찾아낸다.
   // 만약 전역 지역 변수이름이 같더라도 지역을 써야 하기에 _lsymtable안을 먼저 검사한다.
   String getVarId(String name){
      // 지역 변수면 _lsymtable 안에서 찾는다.
      VarInfo lvar = (VarInfo) _lsymtable.get(name);
      if(lvar != null) {
         String s = "";
         int ID = lvar.id;
         s += ID;
         return s;
      }
      
      // 전역 변수면 _gsymtable 안에서 찾는다.
      VarInfo gvar = (VarInfo) _gsymtable.get(name);
      if (gvar != null) {
         String s = "";
         int ID = gvar.id;
         s += ID;
         return s;
      }
      
      return "";   
   
      // <Fill here>   
   }
   
   Type getVarType(String name){
      VarInfo lvar = (VarInfo) _lsymtable.get(name);
      if (lvar != null) {
         return lvar.type;
      }
      
      VarInfo gvar = (VarInfo) _gsymtable.get(name);
      if (gvar != null) {
         return gvar.type;
      }
      
      return Type.ERROR;   
   }
   String newLabel() {
      return "label" + _labelID++;
   }
   
   String newTempVar() {
      String id = "";
      return id + _tempVarID--;
   }

   // global
   // 전역 변수 들어오면, 문자열을 인수로 받는 getVarId를 이용해서 id를 구한다.
   public String getVarId(FieldContext ctx) {
      String sname = "";
      sname += getVarId(ctx.IDENTIFIER().getText());
      return sname;
   }

   // local
   // 지역 변수 들어오면, 문자열을 인수로 받는 getVarId를 이용해서 id를 구한다.
   public String getVarId(LocalVariableDeclarationStatementContext ctx) {
      String sname = "";
      sname += getVarId(ctx.IDENTIFIER().getText());
      return sname;
   }
}