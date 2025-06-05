class BasicArrayExample{
	public static void main(String[] args){
		int[] scores;
		scores = new int[3];
		
		// int[] scores = new int[3];
		
		scores[0] = 80;
		scores[1] = 95;
		scores[2] = 72;
		
		System.out.println("1人目の点数:" + scores[0]);
		System.out.println("2人目の点数:" + scores[1]);
		System.out.println("3人目の点数:" + scores[2]);
		System.out.println("配列の要素数:" + scores.length);
		
		for(int i = 0; i < scores.length; i++){
			System.out.println( (i+1) + "人目の点数" + scores[i] );
		}
		
		System.out.println("4人目の点数にアクセス試行中...");
		System.out.println(scores[3]);
		System.out.println("この行はエラーのため実行されません。");

		
	}
}