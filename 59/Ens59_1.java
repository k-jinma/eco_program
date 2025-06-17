class Ens59_1 {
    public static void main(String[] args) {
        int[][] studentGrades = {
            {85, 90},            // 学生1: Java, 経済学
            {70, 60, 95},        // 学生2: Java, 経済学, 英語
            {92},                // 学生3: Java
            {80, 75, 88, 93}     // 学生4: Java, 経済学, 英語, 統計
        };
        System.out.println("--- 学生の科目別成績集計 ---");

        // 各学生についてループ
        for (int i = 0; i < studentGrades.length; i++) {
            int studentNum = i + 1; // 学生番号 (1から始まる)
            int subjectCount = studentGrades[i].length; // 受講科目数
            int totalScore = 0;

            System.out.println("\n学生" + studentNum + ":");
            System.out.println("  受講科目数: " + subjectCount + "科目");

            // 各学生の科目点数を合計
            for (int j = 0; j < studentGrades[i].length; j++) {
                totalScore += studentGrades[i][j];
            }

            System.out.println("  合計点: " + totalScore);

            // 平均点を計算 (double型にキャストして小数点以下も考慮)
            double averageScore = (double) totalScore / subjectCount;
            // 小数点以下2桁まで表示
            System.out.printf("  平均点: %.2f\n", averageScore); 
        }
    }
}
