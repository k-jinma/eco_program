import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
	public static void main(String[] args){
		Random random = new Random();
		int correctAnswer = random.nextInt(100)+1;
		
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		if( correctAnswer == userInput ){
			System.out.println("正解！");
		}else{
			System.out.println("不正解！");
			
			if( correctAnswer > userInput ){
				System.out.println("もっと大きいです");
			}else{
				System.out.println("もっと小さいです");
			}
		}
		
	}
}