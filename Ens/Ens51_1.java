class Ens51_1{
	public static void main(String[] args){
		
		if(args.length != 2){
			System.out.println("引数は年齢と飲酒の有無（yes/no）を入力して下さい。");
			System.out.println("例： Ens51_1 20 yes");
			System.exit(1);
		}
		
		int age = Integer.parseInt(args[0]); // 年齢
		String alcExperience = args[1]; // yes / no
		
		if(age < 20){
			System.out.println("未成年の飲酒は禁止されています");
			
		}else{

			if(alcExperience.equals("no")){
				System.out.println("初めての飲酒は量に気を付けましょう");
			}
			
			if(alcExperience.equals("yes")){
				System.out.println("適量を守って楽しみましょう");
			}
		}
		
	}
}