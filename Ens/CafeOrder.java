class CafeOrder{
	public static void main(String[] args){
		int drink = 3; // 1～3のいずれか
		int hour = 18; // 0～23の整数
		
		String drinkName = "";
		int price = 0;
		
		if(drink == 1){
			drinkName = "コーヒー";
			price = 300;
		}else if(drink == 2){
			drinkName = "ティー";
			price = 250;
		}else if(drink == 3){
			drinkName = "ジュース";
			price = 200;
		}
		
		// 割引
		int discountRate = 0;
		if( hour < 9 ){
			discountRate = 20;
		}
		
	}
}
