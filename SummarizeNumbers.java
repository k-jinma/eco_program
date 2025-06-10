class SummarizeNumbers{
	public static void main(String[] args){
		double sum = 0.0;
		if( args.length == 0 ){
			// エラーをだして終了する
		}
		
		// 合計と平均を計算する
		for( int i = 0; i < args.length; i++ ){
			double data = Double.parseDouble(args[i]);
			sum = sum + data;
		}
	}
}