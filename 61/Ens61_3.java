class Ens61_3{
	public static void main(String[] args){
		int[] prices = {100000, 3000, 8000, 35000};
		
		int i = 0;
		for( int price : prices ){
			price = (int)(price * 0.9);
			prices[i] = price;
			i++;
		}
		
		for( int price : prices ){
			System.out.println("割引後の価格:" + price + "円");
		}
	}
}