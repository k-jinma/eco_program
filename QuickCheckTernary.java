class QuickCheckTernary{
	public static void main(String[] args){
		int age = 22;
		
		String adultStatus = age >= 20 ? "成人" : "未成年";
		System.out.println(adultStatus);
		
		int itemPrice = 1500;
		int shippingCost =  itemPrice >= 1000 ?  200 : 500 ;
		
	}
}