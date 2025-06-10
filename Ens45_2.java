class Ens45_2{
	public static void main(String[] args){
		int[] calories = {500, 620, 700};
		int standardCalorie = 600;
		
		if(calories[0] > standardCalorie){
			System.out.println("朝:カロリー高めです");
		else{
			System.out.println("朝:適切なカロリーです");
		}
		
		if(calories[1] > standardCalorie){
			System.out.println("昼:カロリー高めです");
		else{
			System.out.println("昼:適切なカロリーです");
		}

		if(calories[2] > standardCalorie){
			System.out.println("夜:カロリー高めです");
		else{
			System.out.println("夜:適切なカロリーです");
		}
	}
}
