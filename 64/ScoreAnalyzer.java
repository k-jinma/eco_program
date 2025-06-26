import java.util.Scanner;
import java.io.File;
class ScoreAnalyzer {
    public static void main(String[] args) throws Exception{
        
        File file = new File("scoresa.csv");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(",|\\R"); // カンマと改行で区切る

        // データ行を読み込む
        while (scanner.hasNext()) {
            int sum = 0;
            String name = scanner.next();
            sum += scanner.nextInt(); // 1つ目のスコアを読み込む
            sum += scanner.nextInt(); // 2つ目のスコアを読み込む
            sum += scanner.nextInt(); // 3つ目のスコアを読み込む
            // 平均を計算
            double average = sum / 3.0;
            // 結果を出力
            System.out.print(name + "さんのスコアは");
            System.out.printf("%.2fです%n", average);
        }
        
        scanner.close(); // Scannerを閉じる

    }
}
