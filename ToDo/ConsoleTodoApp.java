import java.util.Scanner;

class ConsoleTodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("ToDoアプリへようこそ!");
        do{
            System.out.println("\n=== メニュー ===");
            System.out.println("1. ToDoを登録（未実装）");
            System.out.println("2. ToDoを完了（未実装）");
            System.out.println("3. ToDoを登録（未実装）");
            System.out.println("6. 終了");
            System.out.print("番号を選択してください (1-3, 6)");

            choice = scanner.nextInt();
            scanner.nextLine(); // おまじない

            switch(choice){
                case 1 -> {
                    System.out.print("登録するToDoを入力してください:");
                }            
            }

            if(choice != 6 ){
                System.out.println("選択された番号:" + choice + "(処理は未実装です)");
            }

        } while (choice != 6);

        System.out.println("アプリを終了します。ご利用ありがとうございました。");

        scanner.close();
        System.out.println("プログラムを終了しました。");
    }
}
