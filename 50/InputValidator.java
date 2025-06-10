class InputValidator {
    public static void main(String[] args) {
        String[] inputs = {
            "",          // 1. 空の文字列
            "java",      // 2. 短い文字列
            "programming", // 3. 長い文字列
            "error_code",// 4. アンダーバーを含む
            "valid",     // 5. 有効な文字列
            "password123", // 6. 数字を含む
            "  ",        // 7. スペースのみ
        };

        System.out.println("--- 入力値チェック結果 ---");

        for (int i = 0; i < inputs.length; i++) {
            String currentInput = inputs[i];
            System.out.println("入力値: \"" + currentInput + "\"");

            // チェック項目１：入力値が空かどうか？
            if (________________________) {  
                System.out.println("  エラー: 入力値が空です。");
            }
            // チェック項目２：入力値の長さが3文字未満か？
            else if (________________________) {
                System.out.println("  エラー: 入力値が短すぎます。（3文字以上必要）");
            }
            // チェック項目３：入力値に「_」（アンダーバー）が含まれているか？
            else if (________________________) { 
                System.out.println("  エラー: 入力値に不正な文字「_」が含まれています。");
            }
            else {
                System.out.println("  OK: 有効な入力値です。");
            }
            System.out.println("--------------------");
        }
    }
}
