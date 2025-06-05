/*
	No:0000000
	Name:Taro
*/
import java.util.Scanner;

class FindMaxInArray{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print((i+1) + "番目の整数を入力してください:");
			numbers[i] = scanner.nextInt();
		}
		
		int max = numbers[0];
		
		for(int i = 1; i < numbers.length; i++){
			if( max < numbers[i] ){
				max = numbers[i];
			}
		}
		
		System.out.println("入力された数値の最大値は：" + max );

	}
}