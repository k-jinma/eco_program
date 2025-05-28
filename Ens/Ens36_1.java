import java.util.Scanner;

class Ens36_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int seikai = 1122;
		int input;
		do{
			System.out.print("数字4桁の暗証番号を半角で入力して下さい：");
			input = scanner.nextInt();
		
		}while(seikai != input);
		System.out.println("ログインしました");
		
	}
}