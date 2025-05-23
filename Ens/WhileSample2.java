class WhileSample2{
	public static void main(String[] args){
		int max = 10;
		int num = 1;
		int sum = 0;
		
		while(num <= max ){
			sum = sum + num;
			num = num + 1;
		}
		System.out.print(sum);
	}
}
