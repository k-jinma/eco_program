import java.util.Random;

public class SimpleSlotMachineKaitou { // クラス名を変更しました

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("スロットマシーンへようこそ！");
        System.out.print("スピン！"); // 「スピン！」の表示。この後にリールが続く

        // リールの数値を格納する変数 (初期値は未確定を示す-1など)
        int reel1 = -1;
        int reel2 = -1;
        int reel3 = -1;

        // --- 改造点1 & 2 の設定 ---
        // アニメーションの速さ調整用 (値を小さくすると速く、大きくすると遅くなる)
        long delayCount = 100000000L; // 標準的な速さの例 (環境に応じて調整)
        // アニメーションの回転数 (／ー＼ の1セットを何回繰り返すか)
        int animationRotations = 10;

        // --- リール1の回転と決定 ---
        System.out.print("[?]"); // リール1の初期表示 (3文字)
        for (int i = 0; i < animationRotations; i++) { // 改造点2: 10回転
            for (int j = 0; j < 3; j++) { // 記号 ／ ー ＼ を順番に表示
                char symbol;
                if (j == 0) symbol = '／';
                else if (j == 1) symbol = 'ー';
                else symbol = '＼';

                // 改造点3: \bを3回で3文字分戻り、[symbol]を上書き
                System.out.print("\b\b\b\b[" + symbol + "]");
                // 改造点1: 擬似的な遅延
                for (long k = 0; k < delayCount; k++) {
                    // 何もしない (時間を消費)
                }
            }
        }
        reel1 = random.nextInt(3); // リール1の数値を決定 (0, 1, or 2)
        System.out.print("\b\b\b\b[" + reel1 + "]"); // リール1の結果を上書き表示 (改行なし)

        // --- リール2の回転と決定 ---
        System.out.print(" [?]"); // リール2の初期表示 (スペース含め4文字追加、リール部分は3文字)
        for (int i = 0; i < animationRotations; i++) { // 改造点2: 10回転
            for (int j = 0; j < 3; j++) {
                char symbol;
                if (j == 0) symbol = '／';
                else if (j == 1) symbol = 'ー';
                else symbol = '＼';
                // 改造点3: \bを3回でリール2の3文字分戻り、[symbol]を上書き
                System.out.print("\b\b\b\b[" + symbol + "]");
                // 改造点1: 擬似的な遅延
                for (long k = 0; k < delayCount; k++) {
                    // 何もしない
                }
            }
        }
        reel2 = random.nextInt(3); // リール2の数値を決定
        System.out.print("\b\b\b\b[" + reel2 + "]"); // リール2の結果を上書き表示 (改行なし)

        // --- リール3の回転と決定 ---
        System.out.print(" [?]"); // リール3の初期表示 (スペース含め4文字追加、リール部分は3文字)
        for (int i = 0; i < animationRotations; i++) { // 改造点2: 10回転
            for (int j = 0; j < 3; j++) {
                char symbol;
                if (j == 0) symbol = '／';
                else if (j == 1) symbol = 'ー';
                else symbol = '＼';
                // 改造点3: \bを3回でリール3の3文字分戻り、[symbol]を上書き
                System.out.print("\b\b\b\b[" + symbol + "]");
                // 改造点1: 擬似的な遅延
                for (long k = 0; k < delayCount; k++) {
                    // 何もしない
                }
            }
        }
        reel3 = random.nextInt(3); // リール3の数値を決定
        // 最終結果を上書き表示して改行
        System.out.println("\b\b\b[" + reel3 + "]");

        // 当たり判定
        System.out.println("======== 結果 ========");
        if (reel1 == reel2 && reel2 == reel3) {
            System.out.println("大当たり！");
        } else if (reel1 == reel2 || reel2 == reel3 || reel1 == reel3) {
            System.out.println("おしい！2つ揃いました！");
        } else {
            System.out.println("ハズレ… 残念");
        }
    }
}