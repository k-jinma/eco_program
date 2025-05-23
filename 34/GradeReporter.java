class GradeReporter {
    public static void main(String[] args) {
        int passingScore = 70;    // 合格点
        int numberOfStudents = 3; // 処理する学生の人数

        System.out.println("--- 合格者リスト (のはずが...) ---");

        // forループで各学生を順番に処理
        for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++) {
            String studentName = "";
            int studentScore = 0;

            if (studentNumber == 1) {
                studentName = "さくら";
                studentScore = 85;
            } else if (studentNumber == 2) {
                studentName = "たろう";
                studentScore = 60;
            } else if (studentNumber == 3) {
                studentName = "はなこ";
                studentScore = 92;
            }

            System.out.println( studentScore );
            System.out.println( passingScore );
            System.out.println( studentScore < passingScore );

            if (studentScore < passingScore) { 
                System.out.println(studentName + "さん (" + studentScore + "点) - 合格！");
            }
        }

        System.out.println("--- リストの表示完了 ---");
    }
}
