class InfiniteLoop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("無限ループを開始します。停止するには Ctrl+C を押してください。");
        while (i <= 3) { // 条件は i <= 3 ですが…
            System.out.println("iは現在 " + i + " です。ループは止まりません！");
            // i の値を更新する処理 (i = i + 1; など) がここにありません！
        }
        // この行は実行されません
        System.out.println("プログラム終了（このメッセージは表示されません）");
    }
}
