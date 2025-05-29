package ToDo46;
import java.util.Scanner;


class ConsoleTodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Shift_JIS");
        int choice;
    
        int maxTodos = 5;

        String[] todos = new String[maxTodos];
        boolean[] todoStatuses = new boolean[maxTodos];

        int nextTodoIndex = 0;

        System.out.println("ToDoアプリへようこそ!");
        do{
            System.out.println("\n=== メニュー ===");
            System.out.println("1. ToDoを登録");
            System.out.println("2. ToDoを完了");
            System.out.println("3. ToDoを確認");
            System.out.println("4. 今日の目標を設定");
            System.out.println("5. 今日の目標を確認する");
            System.out.println("6. 終了");
            System.out.print("番号を選択してください (1-6)");

            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine(); // おまじない
                
                
                switch(choice){
                    case 1 -> {
                        if(nextTodoIndex < maxTodos){
                            System.out.print("登録するToDoを入力してください:");
                            String newTodo = scanner.nextLine();

                            todos[nextTodoIndex] = newTodo; // ToDoを登録
                            todoStatuses[nextTodoIndex] = false; // 初期状態は未完了
                            System.out.println("ToDo「" + newTodo + "」を登録しました。");
                            nextTodoIndex++;
                        }else{
                            System.out.println("ToDoリストがいっぱいです。これ以上登録できません。");
                        }

                    }
                    case 2 -> { // ToDoを完了
                        if(nextTodoIndex < maxTodos){
                            System.out.print("登録するToDoを入力してください:");
                            
                        }
                    }
                    case 3 -> {
                        System.out.println("\n=== 今日のToDo一覧 ===");
                        if(nextTodoIndex > 0){
                            System.out.println("今日のToDoは登録されていません。");
                        }else{
                            for(int i = 0; i < nextTodoIndex; i++){
                                String status = todoStatuses[i] ? "完了" : "未完了";
                                System.out.println((i+1) + ". " + todos[i] + " (" + status + ")");
                            }
                        }
                        System.out.println("---------------------");
                    }
                    case 4 -> {
                        System.out.print("設定する目標を入力してください: ");
                        String newGoal = scanner.nextLine();
                        if(!currentGoal.isEmpty()){
                            System.out.print("既に目標「" + currentGoal + "」が設定されています。上書きしますか? (yes/no): ");
                            String confirm = scanner.nextLine();
                            if(confirm.equalsIgnoreCase("yes")){
                                currentGoal = newGoal;
                                System.out.println("目標を「" + currentGoal + "」に更新しました。");
                            } else {
                                System.out.println("目標の設定をキャンセルしました。");
                            }
                        } else {
                            currentGoal = newGoal;
                            System.out.println("目標を「" + currentGoal + "」に設定しました。");
                        }
                    }
                    case 5 -> {
                        if(!currentGoal.isEmpty()) {
                            System.out.println("今日の目標: " + currentGoal);
                        } else {
                            System.out.println("今日の目標は設定されていません。");
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
