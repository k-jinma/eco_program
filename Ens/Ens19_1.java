class Ens19_1{
	public static void main(String[] args){
		double height = 1.8;
		double weight = 90.0;
		
		double bmi;
		bmi = weight / (height*height);
		
		int bmiValue = (int)bmi;
		System.out.println("あなたのBMIは"+bmiValue+"です");
	}
}