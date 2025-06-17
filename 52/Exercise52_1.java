class Exercise52_1 {
    public static void main(String[] args) {
        int[] numbers = {15, 8, 20, 3, 12};

        // 小さい順にソートする(昇順ソート)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = ___A___; j < numbers.length; j++) {

                if (________B________) {
                    int temp = numbers[j];
                    _______C_______;
                    numbers[i] = temp;
                }
            }
        }
        
        System.out.println("--- ソート後（小さい順）---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
