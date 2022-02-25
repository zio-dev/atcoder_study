package abc086a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 第一引数
        int input1 = sc.nextInt();
        // 第二引数
        int input2 = sc.nextInt();

        // 積の取得1
        int seki = input1 * input2;
        // 結果取得
        String result = seki % 2 == 0 ? "Even " : "Odd";

        // 出力
        System.out.println(result);
    }
}