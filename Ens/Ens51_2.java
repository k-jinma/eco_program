class Ens51_2{
	public static void main(String[] args){
		int sum = 0;
		
		for(int i = 0; i < args.length; i++){
			int num = Integer.parseInt( args[i] );
			System.out.println("入力された値：" + num);
			sum += num;
		}
		
		System.out.println("合計：" + sum);
		
		double average = (double)sum / (double)args.length;
		System.out.println("平均:" + average);
		
	}
}