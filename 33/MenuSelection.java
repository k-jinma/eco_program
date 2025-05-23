import java.util.Scanner; // Scannerクラスを利用するため

class MenuSelection {
    public static void main(String[] args) {
        // Scannerの宣言
        ＿＿＿＿＿＿＿＿（   a   ）＿＿＿＿＿＿＿＿;
        int choice; // ユーザーの選択を格納する変数

        do {
            // メニューを表示
            System.out.println("\n=== メニュー ===");
            System.out.println("1. 新規作成");
            System.out.println("2. ファイルを開く");
            System.out.println("3. 保存");
            System.out.println("4. 終了");
            System.out.print("番号を選択してください (1-4): ");

            // ユーザーからの入力を受け取る (数字以外の入力はエラー)
            choice = scanner.nextInt(); // 整数として入力を読み込む

            // 選択された番号に応じて処理を実行
            switch (＿＿(  b  )＿＿) {
                case 1 -> System.out.println("「新規作成」が選択");
                case 2 -> System.out.println("「ファイルを開く」が選択");
                case 3 -> System.out.println("「保存」が選択");
                case 4 -> System.out.println("プログラムを終了します。");
                ＿＿(  c  )＿＿-> System.out.println("無効な選択です");
            }
        // 「4. 終了」が選択されるまでループを繰り返す
        } while (＿＿(  c  )＿＿);

        scanner.close(); // Scannerの使用を終了
        System.out.println("ご利用ありがとうございました。");
    }
}
