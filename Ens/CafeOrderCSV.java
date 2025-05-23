import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.nio.charset.StandardCharsets;

public class CafeOrderCSV {
    public static void main(String[] args) throws Exception {
        // 入力値（テスト用に直接代入）
        int drink = 1;  // 1: コーヒー, 2: ティー, 3: ジュース
		LocalDateTime now = LocalDateTime.now();
		int hour = now.getHour();
		System.out.println(hour);
        //int hour = 8;   // 0〜23の整数（時刻）

        // ドリンクの名前と価格を設定
        String drinkName = "";
        int price = 0;

        if (drink == 1) {
            drinkName = "コーヒー";
            price = 300;
        } else if (drink == 2) {
            drinkName = "ティー";
            price = 250;
        } else if (drink == 3) {
            drinkName = "ジュース";
            price = 200;
        } else {
            System.out.println("無効なドリンク番号です。");
            return;
        }

        // 時間帯による割引率（％）
        int discountRate = 0;

        if (hour < 9) {
            discountRate = 20;
        } else if (hour >= 17) {
            discountRate = 10;
        } else {
            discountRate = 0;
        }

        // 割引額を四捨五入で計算
        double rawDiscount = price * discountRate / 100.0;
        int discountAmount = (int)(rawDiscount + 0.5);

        // 支払金額
        int total = price - discountAmount;

        // 出力（画面）
        System.out.println("注文：" + drinkName);
        System.out.println("金額：" + price + "円");
        System.out.println("割引率：" + discountRate + "%");
        System.out.println("割引額：" + discountAmount + "円");
        System.out.println("支払金額：" + total + "円");

        // ファイル保存（日時は簡略化：yyyy/MM/dd-HH:mm）
        
        String simpleTime = now.getYear() + "/" + now.getMonthValue() + "/" + now.getDayOfMonth();

        String csvLine = simpleTime + "," + drinkName + "," + price + "," + discountRate + "," + discountAmount + "," + total + "\n";

        Files.writeString(
            Path.of("sales_log.csv"),
            csvLine,
			StandardCharsets.UTF_8,
            StandardOpenOption.CREATE,
            StandardOpenOption.APPEND
        );
    }
}
