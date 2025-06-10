class SimpleLogin {
    static void main(String[] args) {
        // 許可されたユーザー名とパスワードのリスト
        String[] userNames = {"admin", "user1", "guest"};
        String[] passWords = {"pass123", "abcde", "password"};

        // 引数の数チェックが抜けている

// ここでArrayIndexOutOfBoundsExceptionの可能性あり
        String inputUsername = args[0]; 
        String inputPassword = args[1]; 

        boolean loggedIn = false; // ログイン成功フラグ

        // ユーザー名とパスワードを照合
        for (int i = 0; i < userNames.length; i++) {
            // 文字列の比較方法が間違っている && パスワードの比較が抜けている

            if (inputUsername == userNames[i]) { // この比較では正しく動作しない
                // パスワードも一致するかチェックし、一致すればログイン成功
                // ここにパスワードのチェックが不足
                loggedIn = true; // 仮にここで成功とマーク
                // ここでループを抜ける処理がないため、他のユーザー名も見てしまう可能性がある
            }
        }

        if (loggedIn) {
            System.out.println("ログイン成功！ようこそ、" + inputUsername + "さん！");
        } else {
            System.out.println("ログイン失敗。ユーザー名またはパスワードが正しくありません。");
        }
    }
}
