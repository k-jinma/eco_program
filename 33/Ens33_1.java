import java.util.Scanner;

class Ens33_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int limit;

        System.out.print("どこまで数えますか？ (正の整数を入力): ");
        limit = scanner.nextInt();

        if (limit <= 0) {
            System.out.println("正の整数を入力してください。");
        } else {
            System.out.println("カウント開始！");
            // (ア) ここからdo-while文を開始
            {
                System.out.println(count);
                count++;
            } // (イ) ここでループの継続条件を指定 (countがlimit以下である間)
            System.out.println("カウント終了！");
        }
        scanner.close();
    }
}
