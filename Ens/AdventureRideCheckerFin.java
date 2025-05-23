class AdventureRideChecker {
    public static void main(String[] args) {
        /* 搭乗者の情報（これらの値を変えて、結果がどう変わるか試してみましょう！） */
        int userHeightCm = 140; // 身長 (cm単位)
        int userAge = 12; // 年齢 (歳)
        boolean hasMotionSicknessMedicine = false; // 乗り物酔いの薬を飲んだか (true: 飲んだ, false: 飲んでいない)
        boolean hasSpecialPass = false; // 特別な許可証を持っているか (true: 持っている, false: 持っていない)

        System.out.println("--- ミステリー・アドベンチャーライド 搭乗可否判定 ---");
        System.out.println("あなたの身長: " + userHeightCm + "cm");
        System.out.println("あなたの年齢: " + userAge + "歳");
        System.out.println("乗り物酔いの薬を飲みましたか？: " + (hasMotionSicknessMedicine ? "はい" : "いいえ"));
        System.out.println("特別な許可証を持っていますか？: " + (hasSpecialPass ? "はい" : "いいえ"));
        System.out.println("--------------------------------------------------");

        // ここから下に、搭乗可否を判定するif文を記述していきます

        // ▼▼▼ ステップ３のコード（最終形） ▼▼▼
        // 条件１：身長、年齢の条件を満たし、かつ薬を飲んでいない
        boolean condition1 = userHeightCm >= 130 && userAge >= 10 && !hasMotionSicknessMedicine;
        // 条件２：特別な許可証を持っている
        boolean condition2 = hasSpecialPass;

        if (condition1 || condition2) {
            System.out.println("おめでとうございます！搭乗可能です！ミステリー・アドベンチャーライドへようこそ！");
        } else {
            System.out.println("申し訳ありませんが、ご搭乗いただけません。");
            // なぜ搭乗できないかの詳細な理由を表示 (任意)
            if (userHeightCm < 130) {
                System.out.println("  理由：身長が130cm未満です。");
            }
            if (userAge < 10) {
                System.out.println("  理由：年齢が10歳未満です。");
            }
            if (hasMotionSicknessMedicine && !hasSpecialPass) { // 薬を飲んでいて、かつ特別パスもない場合
                System.out.println("  理由：乗り物酔いの薬を服用されており、特別な許可証をお持ちではありません。");
            }
        }
        // ▲▲▲ ステップ３のコード（最終形） ▲▲▲

    }
}
