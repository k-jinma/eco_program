class NumberedCounter {
    static void main(String[] args) {
        // 引数の数が2つであることを確認
        if (____.____ != 2) {
            System.out.println("エラー: 引数の数が不正です。");
            System.out.println("使用法: java NumberedCounter <開始値> <終了値>");
            System.out.println("例: java NumberedCounter 1 5");
        } else {
            int start = 0;
            int end = 0;

            // 引数を数値に変換
            // ここにInteger.parseInt()による数値変換処理を記述
            // 例： start = Integer.parseInt(args[0]);
            // もし数値に変換できない文字列が渡された場合、
            // プログラムはエラーで停止する可能性があることに注意してください。
            start = ____.____(args[0]);
            end = ____.____(args[1]);


            // 開始値が終了値より大きい場合は処理をスキップ
            if (____ > ____) {
                System.out.println("開始値が終了値よりも大きいため、処理をスキップします。");
            } else {
                // 開始値から終了値までをカウントアップして表示
                for (int i = start; i ____ end; ____) {
                    System.out.println(i);
                }
            }
        }
    }
}
