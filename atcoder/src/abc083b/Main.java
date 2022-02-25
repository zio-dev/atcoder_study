package abc083b;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力値の取得
        int inputN = sc.nextInt();
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();

        int resultSum = 0;
        for (int i = 1; i < inputN + 1; i++) {
            int index5 = i / 10000;
            int index4 = (i - index5 * 10000) / 1000;
            int index3 = (i - index5 * 10000 - index4 * 1000) / 100;
            int index2 = (i - index5 * 10000 - index4 * 1000 - index3 * 100) / 10;
            int index1 = i % 10;
            int divSum = index5 + index4 + index3 + index2 + index1;
            if (inputA <= divSum && divSum <= inputB) {
                resultSum = resultSum + i;
            }
        }

        String result = String.valueOf(resultSum);
        // 出力
        System.out.println(result);
    }
}