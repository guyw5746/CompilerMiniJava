class Test {
	public int temp (int x, int y){
		if (x <= y) {
			x = 4;
		}
		
		return x;
	}	
	
	public static void main(String[] args){
		int t = 3;
		System.out.println(temp(1, t));
	}
}
