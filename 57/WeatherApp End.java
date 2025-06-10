import java.util.Random; // 乱数生成のためにインポート

class WeatherAppAdvanced {
    public static void main(String[] args) {
        Random random = new Random(); // 乱数生成器の変数を作成します
        
        // 1週間（7日間）分の気温を格納する配列
        int[] temperatures = new int[7]; 

        // 曜日表示のための配列
        String[] daysOfWeek = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};

        System.out.println("--- 1週間分の天気予報 ---");

        // --- 1. ランダムな気温データの生成と配列への格納 ---
        for (int i = 0; i < daysOfWeek.length; i++) {
            int temp = random.nextInt(16) + 20; // 20～35の範囲でランダムな気温を生成します

            // 第56回で実装したcontinue文の使用例（異常な低気温のスキップ）
            // 気温が15℃未満の場合、その日の予報はスキップし、次の日の処理に進みます。
            if (temp < 15) { 
                System.out.println(daysOfWeek[i] + ": 気温が異常なため、予報をスキップします。");
                continue; // この日の処理をスキップし、次の日へ
            }

            temperatures[i] = temp; // 生成された気温を配列の適切な添字（インデックス）に格納
            System.out.println(daysOfWeek[i] + ": " + temperatures[i] + "℃");
        }

        System.out.println("\n--- 気温データの並び替え ---");

        // --- 2. ソート方法の決定（プログラム実行時引数） ---
        String sortOrder = "asc"; // デフォルトは昇順
        String sortOrderDisplay = "昇順"; // 表示用の文字列

        if (args.length > 0) { // 引数が1つ以上あるかチェック
            if (args[0].equals("desc")) { // 最初の引数が "desc" と等しいかチェック
                sortOrder = "desc";
                sortOrderDisplay = "降順";
            } else if (args[0].equals("asc")) { // 最初の引数が "asc" と等しいかチェック
                sortOrder = "asc";
                sortOrderDisplay = "昇順";
            } else { // "asc" "desc" 以外の場合
                System.out.println("ソート順が指定されなかったか、無効な値のため、昇順でソートします。");
            }
        } else { // 引数がない場合
            System.out.println("ソート順が指定されなかったか、無効な値のため、昇順でソートします。");
        }
        System.out.println(sortOrderDisplay + "でソートします。");


        // --- 3. 気温のバブルソート（昇順または降順、最適化含む） ---
        boolean swapped; // 各パスで交換が行われたかを示すフラグ

        for (int i = 0; i < temperatures.length - 1; i++) {
            swapped = false; // 各パスの開始時に、交換はまだ行われていないと仮定してfalseにリセット

            for (int j = i + 1; j < temperatures.length; j++) {
                // ソート順に応じて比較条件を切り替える
                if (sortOrder.equals("asc")) { // 昇順ソートの場合
                    if (temperatures[i] > temperatures[j]) { // 左が右より大きければ交換
                        int temp = temperatures[i];
                        temperatures[i] = temperatures[j];
                        temperatures[j] = temp;
                        swapped = true; // 交換が発生したことを記録
                    }
                } else { // 降順ソートの場合 (sortOrder が "desc" の場合)
                    if (temperatures[i] < temperatures[j]) { // 左が右より小さければ交換
                        int temp = temperatures[i];
                        temperatures[i] = temperatures[j];
                        temperatures[j] = temp;
                        swapped = true; // 交換が発生したことを記録
                    }
                }
            }

            // 最適化：もしこのパスで一度も交換が発生しなかったら、配列は完全にソート済み
            if (!swapped) { 
                break; // 外側のループを終了
            }
        }
        
        // --- 4. ソート後の気温の表示 ---
        System.out.print("気温（" + sortOrderDisplay + "）：[");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i]);
            if (i < temperatures.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}