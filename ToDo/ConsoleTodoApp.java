import java.util.Scanner;

class ConsoleTodoApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in,"Shift_JIS");
		int choice;
		String currentTodo = "";
		boolean isTodoCompleted = false;
		
		System.out.println("ToDo アプリへようこそ！");
		
		do{
			System.out.println("\n=== メニュー ===");
			System.out.println("1. ToDo を登録 "); 
			System.out.println("2. ToDo を完了 "); 
			System.out.println("3. ToDo を確認 ");
			System.out.println("6. 終了"); 
			System.out.print("番号を選択してください (1-3, 6): "); 
			
			if(scanner.hasNextInt()){
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch(choice){
					case 1 -> {
						System.out.print("登録するToDoを入力してください:");
						currentTodo = scanner.nextLine();
						isTodoCompleted = false;
						System.out.print("ToDo「" + currentTodo + "」を登録しました");
					}
					case 2 -> { // ToDoを完了
						if (!currentTodo.isEmpty()) { // ToDoが登録されているかチェック
							isTodoCompleted = true; // 完了状態にする
							System.out.println("ToDo「" + currentTodo + "」を完了にしました！");
						} else {
							System.out.println("ToDoが登録されていません。完了にするToDoがありません。");
						}
					}
					
					case 3 -> {
						if(!currentTodo.isEmpty()){
							String status = isTodoCompleted ? "完了" : "未完了";
							System.out.println("今日のTodo：" + currentTodo + "(" + status +")");
						}else{
							System.out.println("今日のToDoは登録されていません。");
						}
					}
					case 6 -> {
						System.out.println("終了処理中...");
					}
					default -> {
						System.out.println("無効な選択です。メニューの番号を入力してください。");
					}
				}
			}else{
				System.out.println("数字で入力せよ");
				scanner.nextLine(); //改行をすてる
				choice = 0;
			}
		
			
		}while(choice!=6);
			
		scanner.close();
		System.out.println("プログラムを終了しました");
		
		System.out.println("アプリを終了します。ご利用ありがとうございました。"); 
	}
}