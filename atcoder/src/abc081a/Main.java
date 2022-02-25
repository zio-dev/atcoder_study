package abc081a;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 入力値の取得
        String input = null;
        try (Scanner sc = new Scanner(System.in)) {
            input = sc.next();
        }

        // カウンタの初期化
        int cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '1') {
                continue;
            }
            cnt++;
        }

        // 結果の取得
        String result = String.valueOf(cnt);

        // 出力
        System.out.println(result);
    }
}