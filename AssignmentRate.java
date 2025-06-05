class AssignmentRate{
	public static void main(String[] args){
		int[] kai = {41, 42};
		int[] count = {10, 7};
		int totalPeople = 33;
		
		for( int i = 0; i < kai.length; i++){
			double rate = count[i] / totalPeople * 100.0;
			System.out.println("第" + kai[i] + "回：" + rate );
		}
	
	}
}