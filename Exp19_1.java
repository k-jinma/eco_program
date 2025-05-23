class Exp19_1{
	public static void main(String[] args){
		int price = 2389;
		double taxRate = 0.08;
		int totalPrice = (int)(price + (price * taxRate));
		System.out.println("合計金額:" + totalPrice + "円"); 
	}
}