class Average{
	public static void main(String[] args){
	
		int math = Integer.parseInt( args[0] );
		int japanese = Integer.parseInt( args[1] );
		int english = Integer.parseInt( args[2] );
		
		double average = (math + japanese + english) / 3.0;
		System.out.println( average );
	}
}