import java.util.Scanner;

public class MyCalculator77 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("☆☆ My 電卓 ☆☆");
		System.out.println("ようこそ！");
		
		boolean continueCalculation = true;
		
		while (continueCalculation) {
			try {
				// メニュー表示
				System.out.println("\n計算対象となる演算番号を選択してください：");
				System.out.println("1: 加算 (+)");
				System.out.println("2: 減算 (-)");
				System.out.println("3: 乗算 (×)");
				System.out.println("4: 除算 (÷)");
				System.out.print("選択してください (1-4): ");
				
				// 演算番号の取得と検証
				int operation;
				while (true) {
					if (scanner.hasNextInt()) {
						operation = scanner.nextInt();
						if (operation >= 1 && operation <= 4) {
							break;
						} else {
							System.out.println("エラー: 1から4の間の数字を入力してください。");
							System.out.print("選択してください (1-4): ");
						}
					} else {
						System.out.println("エラー: 正しい整数を入力してください。");
						scanner.next(); // 不正な入力をクリア
						System.out.print("選択してください (1-4): ");
					}
				}
				
				// 1つ目の数値の取得
				int num1;
				while (true) {
					System.out.print("1つ目の数値を入力してください: ");
					if (scanner.hasNextInt()) {
						num1 = scanner.nextInt();
						break;
					} else {
						System.out.println("エラー: 正しい整数を入力してください。");
						scanner.next(); // 不正な入力をクリア
					}
				}
				
				// 2つ目の数値の取得
				int num2;
				while (true) {
					System.out.print("2つ目の数値を入力してください: ");
					if (scanner.hasNextInt()) {
						num2 = scanner.nextInt();
						break;
					} else {
						System.out.println("エラー: 正しい整数を入力してください。");
						scanner.next(); // 不正な入力をクリア
					}
				}
				
				// 計算実行と結果表示
				double result;
				String symbol;
				
				switch (operation) {
					case 1: // 加算
						result = num1 + num2;
						symbol = "+";
						break;
					case 2: // 減算
						result = num1 - num2;
						symbol = "-";
						break;
					case 3: // 乗算
						result = num1 * num2;
						symbol = "×";
						break;
					case 4: // 除算
						if (num2 == 0) {
							System.out.println("エラー: ゼロで割ることはできません。");
							continue;
						}
						result = (double) num1 / num2;
						symbol = "÷";
						break;
					default:
						System.out.println("予期しないエラーが発生しました。");
						continue;
				}
				
				// 結果表示
				System.out.printf("計算結果: %d %s %d = ", num1, symbol, num2);
				if (result == (int) result) {
					System.out.printf("%.0f%n", result);
				} else {
					System.out.printf("%.2f%n", result);
				}
				
			} catch (Exception e) {
				System.out.println("予期しないエラーが発生しました: " + e.getMessage());
			}
			
			// 継続確認
			System.out.print("\n別の計算を行いますか？ (y/n): ");
			String response = scanner.next().toLowerCase();
			continueCalculation = response.equals("y") || response.equals("yes") || response.equals("はい");
		}
		
		System.out.println("電卓を終了します。ご利用ありがとうございました！");
		scanner.close();
	}
}
