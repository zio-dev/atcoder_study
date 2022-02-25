package abc088b;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 入力値の取得
        int inputN = sc.nextInt();

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

        // バブルソート(降順)
        for (int i = arrayInput.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayInput[j] < arrayInput[j + 1]) {
                    int tmp = arrayInput[j + 1];
                    arrayInput[j + 1] = arrayInput[j];
                    arrayInput[j] = tmp;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < arrayInput.length; i++) {
            result = result + (i % 2 == 0 ? arrayInput[i] : (arrayInput[i] * -1));
        }

        // 出力
        System.out.println(result);
    }
}