class WhileVsDoWhileCompare {
    public static void main(String[] args) {
        // while文の例
        int countWhile = 5;
        System.out.println("while文の開始前: countWhile = " + countWhile);
        while (countWhile < 5) {
            System.out.println("whileループ内: countWhile = " + countWhile);
            countWhile++;
        }
        System.out.println("while文の終了後: countWhile = " + countWhile);

        System.out.println("--------------------");


        int countDoWhile = 5;
        System.out.println("do-while文の開始前: countDoWhile = " + countDoWhile);

        // ここに do-while ループの開始を示すdoキーワードを記述
        （ア）{
            System.out.println("do-whileループ内: countDoWhile = " + countDoWhile);
            countDoWhile++;
        } (イ)
        //ここにループの継続条件 (countDoWhile が 5 未満) と、
        //セミコロン(;)を記述

        System.out.println("do-while文の終了後: countDoWhile = " + countDoWhile);
    }
}
