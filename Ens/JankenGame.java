import java.util.Random;

class JankenGame{
	public static void main(String[] args){
		int player = 1;
		
		Random rand = new Random();
		
		int computer = rand.nextInt(3)+1;
		
		System.out.print("あなたの手：");
		switch(player){
			case 1 -> System.out.println("グー");
			case 2 -> System.out.println("チョキ");
			case 3 -> System.out.println("パー");
		}
		
		System.out.print("コンピュータの手：");
		switch(computer){
			case 1 -> System.out.println("グー");
			case 2 -> System.out.println("チョキ");
			case 3 -> System.out.println("パー");
		}
		
	}
}