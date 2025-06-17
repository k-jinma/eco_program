import java.io.File;
import java.util.Scanner;
import java.nio.charset.StandardCharsets; // 文字コード指定のため

public class SalesDataDisplay {

    // mainメソッドがFileNotFoundExceptionをスローする可能性を宣言
    public static void main(String[] args) throws Exception {
        String filePath = "./data.csv"; // 読み込むCSVファイル名
        String csvDelimiter = ",";             // CSVの区切り文字

        int rowCount = 0;
        int maxColCount = 0;

        // --- 最初のパス: 行数と最大列数をカウント ---
        // Scannerをクローズするため、ここでもnew Scanner()とnew File()はスコープを分ける
        File fileForCount = new File(filePath);
        Scanner scanner = new Scanner(fileForCount, "UTF-8"); // 文字コードをUTF-8に指定

        // ヘッダー行を読み飛ばす (カウントに含めない)
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // ヘッダー行を読み飛ばす
        }

        while (scanner.hasNextLine()) {
            rowCount++;
            String line = scanner.nextLine();
            String[] values = line.split(csvDelimiter);
            if (values.length > maxColCount) {
                maxColCount = values.length;
            }
        }
        scanner.close(); // Scannerを閉じる

        // 2次元配列を宣言 (ヘッダー行を除くデータ行のみ)
        String[][] salesData = new String[rowCount][maxColCount];
        int currentRow = 0; // データを格納する現在の行インデックス

        // --- 2番目のパス: データを2次元配列に格納 ---
        File fileForData = new File(filePath);
        Scanner scannerForData = new Scanner(fileForData, StandardCharsets.UTF_8.name()); // 文字コードをUTF-8に指定

        // ヘッダー行を読み飛ばす
        if (scannerForData.hasNextLine()) {
            scannerForData.nextLine();
        }

        while (scannerForData.hasNextLine()) {
            String line = scannerForData.nextLine();
            String[] values = line.split(csvDelimiter);

            // 各行のデータを配列にコピー (インデックスベース)
            for (int j = 0; j < values.length; j++) {
                if (j < maxColCount) { // 配列の範囲を超えないようにチェック
                    salesData[currentRow][j] = values[j];
                }
            }
            currentRow++;
        }
        scannerForData.close(); // Scannerを閉じる

        // --- 読み込んだ2次元配列の内容を表示 ---
        System.out.println("--- 架空の商品の売り上げデータ ---");

        // ヘッダーを表示 (手動で定義するか、最初のスキャンで取得することも可能)
        String[] headers = {"ProductID", "ProductName", "Category", "Price", "Quantity", "SaleDate", "Salesperson"};
        for (int i = 0; i < headers.length; i++) {
            System.out.printf("%-15s", headers[i]); // 整形して表示
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------");

        // データ行を表示 (インデックスベース)
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < maxColCount; j++) {
                // nullチェックと整形
                System.out.printf("%-15s", (salesData[i][j] != null ? salesData[i][j] : ""));
            }
            System.out.println();
        }
    }
}