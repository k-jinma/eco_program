import java.util.Scanner;

class ConsoleTodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Shift_JIS");
        int choice;
    
        String currentTodo = "";  // 現在のToDo内容 (最初は空文字列)
        boolean isTodoCompleted = false; // ToDoの完了状態 (最初は未完了なのでfalse)


        System.out.println("ToDoアプリへようこそ!");
        do{
            System.out.println("\n=== メニュー ===");
            System.out.println("1. ToDoを登録");
            System.out.println("2. ToDoを完了");
            System.out.println("3. ToDoを確認");
            System.out.println("6. 終了");
            System.out.print("番号を選択してください (1-3, 6)");

            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine(); // おまじない
                
                
                switch(choice){
                    case 1 -> {
                        System.out.print("登録するToDoを入力してください:");
                        currentTodo = scanner.nextLine();
                        isTodoCompleted = false;
                        System.out.println("ToDo「" + currentTodo + "」を登録しました。");
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
                        // currentTodo変数が空かどうかチェック (isEmpty()機能を使用)
                        if (!currentTodo.isEmpty()) { 
                            String status = isTodoCompleted ? "完了" : "未完了";
                            System.out.println("今日のToDo: " + currentTodo + " (" + status + ")");
                        } else {
                            System.out.println("今日のToDoは登録されていません。");
                        }
                    }
                    case 6 -> { // 終了
                        System.out.println("終了処理中...");
                    }
                    default -> { // 1-3, 6以外の番号が入力された場合
                        System.out.println("無効な選択です。メニューの番号を入力してください。");
                    }
                }
                
            }else { // 数字以外の入力があった場合
                System.out.println("数字でメニュー番号を入力してください。");
                scanner.nextLine(); // 不正な入力（数字でないトークンとその行の残り）を読み飛ばす
                choice = 0; // ループを継続させるためのダミー値 (6以外なら何でもよい)
            }

        } while (choice != 6);

        System.out.println("アプリを終了します。ご利用ありがとうございました。");

        scanner.close();
        System.out.println("プログラムを終了しました。");
    }
}
