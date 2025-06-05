package p47;

class DiscountCalculator {
    public static void main(String[] args) {
        // A: 商品の金額(price)として変換
        int price = Integer.parseInt(args[0]);

        // B: 割引率(discountPercent)として変換
        int discountPercent = Integer.parseInt(args[1]);

        // 結果を表示
        System.out.println("元の金額: " + price + "円");
        double discountRate = discountPercent / 100.0;
        double finalPrice = price - (price * discountRate);
        System.out.println("割引後の金額: " + (int) finalPrice + "円");
    }
}
