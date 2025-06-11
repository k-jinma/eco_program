package ToDo46; // ユーザー提供のファイルに合わせたパッケージ宣言

import java.util.Scanner;

class ConsoleTodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Shift_JIS"); // 文字コードは環境に合わせてください
        int choice;
    
        int maxTodos = 5; // ToDoの最大数を格納する変数
        String[] todos = new String[maxTodos];
        boolean[] todoStatuses = new boolean[maxTodos];
        int nextTodoIndex = 0;

        int maxGoals = 3; // 目標の最大数を格納する変数
        String[] goals = new String[maxGoals];
        int nextGoalIndex = 0;

        System.out.println("ToDoアプリへようこそ!");
        do{
            System.out.println("\n=== メニュー ===");
            System.out.println("1. ToDoを登録");
            System.out.println("2. ToDoを完了");
            System.out.println("3. ToDoを確認");
            System.out.println("4. 今日の目標を設定");
            System.out.println("5. 今日の目標を確認する");
            System.out.println("6. ToDoを削除"); // 新機能
            System.out.println("7. 終了");     // 番号変更
            System.out.print("番号を選択してください (1-7): "); // プロンプト更新

            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine(); // nextInt()の後の改行文字を消費
                
                // 伝統的な switch-case 文を使用します。各caseの終わりにはbreakが必要です。
                switch(choice){
                    case 1: // ToDoを登録
                        if(nextTodoIndex < maxTodos){
                            System.out.print("登録するToDoを入力してください:");
                            String newTodo = scanner.nextLine();
                            todos[nextTodoIndex] = newTodo; 
                            todoStatuses[nextTodoIndex] = false; 
                            System.out.println("ToDo「" + newTodo + "」を登録しました。");
                            nextTodoIndex++;
                        }else{
                            System.out.println("ToDoリストがいっぱいです。これ以上登録できません。");
                        }
                        break; 
                    case 2: // ToDoを完了
                        if (nextTodoIndex == 0) {
                            System.out.println("ToDoが登録されていません。\n完了にするToDoがありません。");
                        } else {
                            System.out.println("\n--- 完了するToDoを選択してください ---");
                            for (int i = 0; i < nextTodoIndex; i++) {
                                System.out.println((i + 1) + ". " + todos[i] + (todoStatuses[i] ? " (完了済み)" : " (未完了)"));
                            }
                            System.out.print("完了にするToDoの番号を入力してください (1-" + nextTodoIndex + "): ");
                            if (scanner.hasNextInt()) {
                                int inputNum = scanner.nextInt();
                                scanner.nextLine(); 
                                if (inputNum > 0 && inputNum <= nextTodoIndex) {
                                    int targetIndex = inputNum - 1;
                                    if (!todoStatuses[targetIndex]) { 
                                        todoStatuses[targetIndex] = true; 
                                        System.out.println("ToDo「" + todos[targetIndex] + "」を完了にしました！");
                                    } else {
                                        System.out.println("ToDo「" + todos[targetIndex] + "」は既に完了済みです。");
                                    }
                                } else {
                                    System.out.println("無効な番号です。1から" + nextTodoIndex + "の間で入力してください。");
                                }
                            } else {
                                System.out.println("番号を数字で入力してください。");
                                scanner.nextLine(); 
                            }
                        }
                        break;
                    case 3: // ToDoを確認
                        System.out.println("\n=== 今日のToDo一覧 ===");
                        if(nextTodoIndex == 0){
                            System.out.println("今日のToDoは登録されていません。");
                        }else{
                            for(int i = 0; i < nextTodoIndex; i++){
                                String status = todoStatuses[i] ? "完了" : "未完了";
                                System.out.println((i+1) + ". " + todos[i] + " (" + status + ")");
                            }
                        }
                        System.out.println("---------------------");
                        break;
                    case 4: // 今日の目標を設定
                        if (nextGoalIndex < maxGoals) {
                            System.out.print("設定する目標を入力してください: ");
                            String newGoal = scanner.nextLine();
                            goals[nextGoalIndex] = newGoal;
                            System.out.println("目標「" + goals[nextGoalIndex] + "」を設定しました。");
                            nextGoalIndex++;
                        } else {
                            System.out.println("目標リストがいっぱいです。これ以上設定できません。(" + maxGoals + "個まで)");
                        }
                        break;
                    case 5: // 今日の目標を確認する
                        System.out.println("\n--- 今日の目標一覧 ---");
                        if (nextGoalIndex == 0) {
                            System.out.println("今日の目標は設定されていません。");
                        } else {
                            for (int i = 0; i < nextGoalIndex; i++) {
                                System.out.println((i + 1) + ". " + goals[i]);
                            }
                        }
                        System.out.println("--------------------");
                        break;
                    case 6: // ★★★ ToDoを削除 (新機能) ★★★
                        if (nextTodoIndex == 0) {
                            System.out.println("削除するToDoがありません。");
                        } else {
                            System.out.println("\n--- 削除するToDoを選択してください ---");
                            for (int i = 0; i < nextTodoIndex; i++) {
                                String status = todoStatuses[i] ? "完了" : "未完了";
                                System.out.println((i + 1) + ". " + todos[i] + " (" + status + ")");
                            }
                            System.out.print("削除するToDoの番号を入力してください (1-" + nextTodoIndex + "): ");
                            if (scanner.hasNextInt()) {
                                int deleteNum = scanner.nextInt();
                                scanner.nextLine(); // nextInt()の後の改行文字を消費

                                // 入力された番号が有効範囲内かチェック
                                if (deleteNum > 0 && deleteNum <= nextTodoIndex) {
                                    int deleteIndex = deleteNum - 1; // 配列のインデックスに変換
                                    String deletedTodoName = todos[deleteIndex]; // 削除するToDo名をメッセージ用に保存

                                    // 配列の要素をシフト（前に詰める）
                                    for (int i = deleteIndex; i < nextTodoIndex - 1; i++) {
                                        todos[i] = todos[i + 1];
                                        todoStatuses[i] = todoStatuses[i + 1];
                                    }
                                    
                                    // ToDoの総数を1減らす
                                    nextTodoIndex--;
                                    
                                    // 最後の要素だった場所をクリア（任意だが推奨）
                                    // これにより、以前のデータが不要に残ることを防ぐ
                                    todos[nextTodoIndex] = null;
                                    
                                    System.out.println("ToDo「" + deletedTodoName + "」を削除しました。");
                                } else {
                                    System.out.println("無効な番号です。1から" + nextTodoIndex + "の間で入力してください。");
                                }
                            } else {
                                System.out.println("番号を数字で入力してください。");
                                scanner.nextLine(); // 不正な入力を消費
                            }
                        }
                        break;
                    case 7: // 終了 (番号変更)
                        System.out.println("終了処理中...");
                        break;
                    default: 
                        System.out.println("無効な選択です。メニューの番号を入力してください。");
                }
            } else { 
                System.out.println("数字でメニュー番号を入力してください。");
                scanner.nextLine(); 
                choice = 0; 
            }
        } while (choice != 7); // ループ条件も7に変更

        System.out.println("アプリを終了します。ご利用ありがとうございました。");
        scanner.close();
    }
}