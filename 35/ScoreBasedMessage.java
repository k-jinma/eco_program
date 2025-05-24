class ScoreBasedMessage {
    public static void main(String[] args) {
        int studentScore = 85; // ある生徒の点数
        boolean isPassingScore = studentScore >= 60; // 合格点（60点以上）かどうか

        // 合格点以上であれば「奨励賞」、
        // そうでなければ「努力賞」のラベルを付ける
        String awardLabel = ＿＿＿＿＿＿（ア）＿＿＿＿＿＿＿;
        System.out.println("あなたの点数: " + studentScore + "点");
        System.out.println("贈られる賞: " + awardLabel);

        studentScore = 55; // 点数を変更して試す
        isPassingScore = studentScore >= 60;
        awardLabel = ＿＿＿＿＿（イ）＿＿＿＿＿＿;
        System.out.println("\nあなたの点数: " + studentScore + "点");
        System.out.println("贈られる賞: " + awardLabel);
    }
}
