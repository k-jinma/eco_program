class AdventureRideChecker {
    public static void main(String[] args) {
        /* 搭乗者の情報（これらの値を変えて、結果がどう変わるか試してみましょう！） */
        int userHeightCm = 140; // 身長 (cm単位)
        int userAge = 12; // 年齢 (歳)
        boolean hasMotionSicknessMedicine = false; // 乗り物酔いの薬を飲んだか (true: 飲んだ, false: 飲んでいない)
        boolean hasSpecialPass = false; // 特別な許可証を持っているか (true: 持っている, false: 持っていない)
		boolean condition1 = userHeightCm >= 130 && userAge >= 10 && !hasMotionSicknessMedicine;
		boolean condition2 = hasSpecialPass;

        System.out.println("--- ミステリー・アドベンチャーライド 搭乗可否判定 ---");
        System.out.println("あなたの身長: " + userHeightCm + "cm");
        System.out.println("あなたの年齢: " + userAge + "歳");
        System.out.println("乗り物酔いの薬を飲みましたか？: " + (hasMotionSicknessMedicine ? "はい" : "いいえ"));
        System.out.println("特別な許可証を持っていますか？: " + (hasSpecialPass ? "はい" : "いいえ"));
        System.out.println("--------------------------------------------------");

        // ここから下に、搭乗可否を判定するif文を記述していきます
		if(condition1){
			System.out.println("条件クリア");
		}else{
			System.out.println("条件NG");
		}
		

        

    }
}
