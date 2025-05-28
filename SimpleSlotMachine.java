import java.util.Random;

public class SimpleSlotMachine {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("スロットマシーンへようこそ！");
        System.out.print("スピン！");

        // 回転中アニメーション（擬似的）
        // このループ回数は見た目の調整用です
        for (int i = 0; i < 3; i++) { // 外側のループでアニメーションの繰り返し
            for (int j = 0; j < 3; j++) { // 内側のループで表示文字の変更
                char symbol;
                if (j == 0) symbol = '／';
                else if (j == 1) symbol = 'ー';
                else symbol = '＼';
                System.out.print("\b\b" + symbol); // バックスペースで1文字消して上書き

                // 擬似的な遅延 (非常に単純なもの)
                // Thread.sleep()が未学習のため、単純なループで代用
                for (long k = 0; k < 200000000; k++) { // この回数は環境によって調整
                    // 何もしないで時間を消費
                }
            }
        }
        System.out.print("\b\b"); // アニメーションの最後の文字を消す

        // リールの数字を決定 (0, 1, 2のいずれか)
        int reel1 = random.nextInt(3);
        int reel2 = random.nextInt(3);
        int reel3 = random.nextInt(3);

        // 結果表示
        System.out.println("結果: [" + reel1 + "] [" + reel2 + "] [" + reel3 + "]");

        // 当たり判定
        if (reel1 == reel2 && reel2 == reel3) {
            System.out.println("大当たり！ 🥳");
        } else if (reel1 == reel2 || reel2 == reel3 || reel1 == reel3) {
            System.out.println("おしい！2つ揃いました！ 😊");
        }
        else {
            System.out.println("ハズレ… 残念 😥");
        }
    }
}