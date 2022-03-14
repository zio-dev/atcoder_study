package abc049c;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 入力値の取得
        String input = null;
        try (Scanner sc = new Scanner(System.in)) {
            input = sc.next();
        }

        // 文字列逆転
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        boolean result = false;
        while (true) {

            if (sb.length() == 0) {
                result = true;
                break;
            }

            if (sb.length() > 4
                    && sb.charAt(0) == 'm'
                    && sb.charAt(1) == 'a'
                    && sb.charAt(2) == 'e'
                    && sb.charAt(3) == 'r'
                    && sb.charAt(4) == 'd') {
                sb.delete(0, 5);
                continue;
            }

            if (sb.length() > 4
                    && sb.charAt(0) == 'e'
                    && sb.charAt(1) == 's'
                    && sb.charAt(2) == 'a'
                    && sb.charAt(3) == 'r'
                    && sb.charAt(4) == 'e') {
                sb.delete(0, 5);
                continue;
            }

            if (sb.length() > 5
                    && sb.charAt(0) == 'r'
                    && sb.charAt(1) == 'e'
                    && sb.charAt(2) == 's'
                    && sb.charAt(3) == 'a'
                    && sb.charAt(4) == 'r'
                    && sb.charAt(5) == 'e') {
                sb.delete(0, 6);
                continue;
            }

            if (sb.length() > 6
                    && sb.charAt(0) == 'r'
                    && sb.charAt(1) == 'e'
                    && sb.charAt(2) == 'm'
                    && sb.charAt(3) == 'a'
                    && sb.charAt(4) == 'e'
                    && sb.charAt(5) == 'r'
                    && sb.charAt(6) == 'd') {
                sb.delete(0, 7);
                continue;
            }
            break;
        }

        // 出力
        System.out.println(result ? "YES" : "NO");
    }
}