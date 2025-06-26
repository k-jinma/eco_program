import java.io.File;
import java.util.Scanner;

class Sample64_1 {
    public static void main(String[] args) throws Exception {
        File file = new File("employees.csv");
        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine(); // ヘッダー行を読み飛ばす
        System.out.println(s);
        s = scanner.nextLine(); // ヘッダー行を読み飛ばす
        System.out.println(s);

        scanner.close(); // Scannerを閉じる
    }
}
