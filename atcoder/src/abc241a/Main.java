package abc241a;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 入力値の取得
        int inputN = 10;

        // 入力値保持用の配列を宣言
        int[] arrayInput = new int[inputN];
        int counter = 0;
        while (sc.hasNextInt()) {
            arrayInput[counter] = sc.nextInt();
            counter = counter + 1;
            if (counter == inputN) {
                break;
            }
        }

        int result = 0;

        // 1回目
        result = arrayInput[result];
        // 2回目
        result = arrayInput[result];
        // 3回目
        result = arrayInput[result];

        // 出力
        System.out.println(result);
    }
}