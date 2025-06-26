import java.io.File;
import java.util.Scanner;

public class Sample64_2 {
    public static void main(String[] args) throws Exception{
        File file = new File("employees.csv");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter(",");
        String s = scanner.next();
        System.out.println(s);
        s = scanner.next();
        System.out.println(s);

        scanner.close(); // Scannerを閉じる
    }
}
