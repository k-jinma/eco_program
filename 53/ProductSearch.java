class ProductSearch {
    static void main(String[] args) {
        String[] products = {
            "ノートPC", "スマートフォン", "タブレット", "ワイヤレスイヤホン", 
            "スマートウォッチ", "キーボード", "マウス"
        };
        String searchTarget = "タブレット"; // 検索したい商品名

        System.out.println("--- 商品検索を開始します ---");
        // boolean found = false; // breakを使う場合、このフラグはループの終了判定には不要になる

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + "番目の商品をチェック中: " + products[i]);

            // 検索対象の商品と一致したらループをbreakする。
           
        }
        
        System.out.println("--- 検索処理を終了します ---");
    }
}
