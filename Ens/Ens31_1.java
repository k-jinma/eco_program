class Ens31_1{
	public static void main(String[] args){
		double husbandTemp = 37.5;	// 夫の体温
		double wifeTemp = 36.0;		// 妻の体温
		
		if(husbandTemp >= 37.2 || wifeTemp >= 37.2){
			System.out.println("感冒の可能性があります");
			
		}else if(husbandTemp < 36.5 && wifeTemp < 36.5){
			System.out.println("体温は安定しています");
			
		}else{
			System.out.println("様子を見ましょう");
		}
		
	}
}