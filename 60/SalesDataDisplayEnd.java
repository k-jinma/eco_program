import java.io.File;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class SalesDataDisplayEnd {

    // mainメソッドがFileNotFoundExceptionをスローする可能性を宣言
    // これにより、メソッド内でtryブロックを記述する必要がなくなります
    public static void main(String[] args) throws Exception {

        int rowCount = 0;    // ヘッダー行を除くデータ行の数
        int maxColCount = 0; // 最大列数

        // --- 最初のパス: 行数と最大列数をカウント ---
        // Scannerは自動で閉じられないため、明示的にclose()を呼び出します
        // ファイルパスと文字コードを直接記述
        File fileForCount = new File("./data.csv");
        Scanner scannerForCount = new Scanner(fileForCount, StandardCharsets.UTF_8.name());

        // ヘッダー行を読み飛ばします (カウントに含めない)
        if (scannerForCount.hasNextLine()) {
            scannerForCount.nextLine(); // 1行読み込んでヘッダー行をスキップ
        }

        while (scannerForCount.hasNextLine()) { // 次の行が存在する限りループ
            rowCount++;
            String line = scannerForCount.nextLine(); // 行を読み込みます
            // CSVの区切り文字を直接記述
            String[] values = line.split(","); // カンマで分割して配列に格納
            if (values.length > maxColCount) { // 現在の行の列数が最大列数より大きい場合
                maxColCount = values.length; // 最大列数を更新
            }
        }
        scannerForCount.close(); // Scannerを閉じます（重要！）

        // 2次元配列を宣言 (ヘッダー行を除くデータ行のみを格納します)
        String[][] salesData = new String[rowCount][maxColCount];
        int currentRow = 0; // データを格納する現在の行インデックス

        // --- 2番目のパス: データを2次元配列に格納 ---
        // ファイルパスと文字コードを再度直接記述
        File fileForData = new File("./data.csv");
        Scanner scannerForData = new Scanner(fileForData, StandardCharsets.UTF_8.name());

        // ヘッダー行を読み飛ばします
        if (scannerForData.hasNextLine()) {
            scannerForData.nextLine();
        }

        while (scannerForData.hasNextLine()) { // 次の行が存在する限りループ
            String line = scannerForData.nextLine(); // 行を読み込みます
            // CSVの区切り文字を再度直接記述
            String[] values = line.split(","); // カンマで分割

            // 各行のデータを配列にコピー (インデックスベースのループを使用)
            for (int j = 0; j < values.length; j++) {
                if (j < maxColCount) { // 配列の範囲を超えないようにチェック
                    salesData[currentRow][j] = values[j];
                }
            }
            currentRow++; // 行を進めます
        }
        scannerForData.close(); // Scannerを閉じます（重要！）

        // --- 読み込んだ2次元配列の内容を全件表示 ---
        System.out.println("--- 架空の商品の売り上げデータ 全件表示 ---");

        // ヘッダーを直接記述し、表示します
        // 各ヘッダー文字列も直接記述
        System.out.printf("%-15s", "ProductID");
        System.out.printf("%-15s", "ProductName");
        System.out.printf("%-15s", "Category");
        System.out.printf("%-15s", "Price");
        System.out.printf("%-15s", "Quantity");
        System.out.printf("%-15s", "SaleDate");
        System.out.printf("%-15s", "Salesperson");
        System.out.println("\n--------------------------------------------------------------------------------------------------");

        // データ行を表示 (インデックスベースのループを使用)
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < maxColCount; j++) {
                // nullのセルは空文字列として表示します
                System.out.printf("%-15s", (salesData[i][j] != null ? salesData[i][j] : ""));
            }
            System.out.println();
        }

        System.out.println("\n"); // 区切りのための改行

        // --- 商品IDごとの売上金額合計の計算と表示 ---
        System.out.println("--- 商品ID別売上合計 ---");

        // 商品IDと合計金額を格納するための2次元配列
        // 仮に最大100種類のユニークな商品IDを想定します。このサイズは必要に応じて調整してください。
        // productSalesSummary[i][0] に商品ID, productSalesSummary[i][1] に合計金額（文字列）を格納します
        String[][] productSalesSummary = new String[100][2];
        int uniqueProductCount = 0; // 現在登録されているユニークな商品IDの数

        // salesDataを走査し、商品IDごとの合計金額を計算します
        for (int i = 0; i < rowCount; i++) {
            // CSVの列インデックスを直接使用 (ProductID=0, Price=3, Quantity=4)
            String currentProductId = salesData[i][0];
            // 文字列をdouble型に変換する際にエラーが発生する可能性も、ここではthrowsで委譲します
            double price = Double.parseDouble(salesData[i][3]);
            int quantity = Integer.parseInt(salesData[i][4]);
            double salesAmount = price * quantity; // 今回の売上金額を計算

            // 現在の商品IDが既に集計済みかどうかをチェックします
            boolean found = false;
            for (int k = 0; k < uniqueProductCount; k++) {
                // 既に商品IDが存在するかを比較
                if (productSalesSummary[k][0] != null && productSalesSummary[k][0].equals(currentProductId)) {
                    // 既に存在する場合、既存の合計金額に加算します
                    double currentTotal = Double.parseDouble(productSalesSummary[k][1]);
                    productSalesSummary[k][1] = String.valueOf(currentTotal + salesAmount);
                    found = true;
                    break; // 見つかったら内部ループを終了
                }
            }

            // 新しい商品IDの場合、productSalesSummary配列に追加します
            if (!found) {
                if (uniqueProductCount < productSalesSummary.length) { // 配列の範囲を超えないようにチェック
                    productSalesSummary[uniqueProductCount][0] = currentProductId;
                    productSalesSummary[uniqueProductCount][1] = String.valueOf(salesAmount);
                    uniqueProductCount++;
                } else {
                    // ハードコーディングされた配列サイズを超えた場合の警告メッセージ
                    System.err.println("警告: 商品IDの種類が多すぎます。集計配列のサイズを増やしてください。");
                    break; // これ以上処理できないため、ループを中断
                }
            }
        }

        // 商品IDごとの合計金額を表示します
        for (int i = 0; i < uniqueProductCount; i++) {
            String productId = productSalesSummary[i][0];
            double totalAmount = Double.parseDouble(productSalesSummary[i][1]);
            System.out.printf("商品ID: %-8s 合計金額: %.2f円%n", productId, totalAmount);
        }
    }
}