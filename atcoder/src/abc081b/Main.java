package abc081b;

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

        boolean breakflg = false;
        int resultCount = 0;

        while (true) {
            // 配列をループしチェック
            for (int i = 0; i < arrayInput.length; i++) {
                if (!checkEven(arrayInput[i])) {
                    breakflg = true;
                    break;
                }
                arrayInput[i] = arrayInput[i] / 2;
            }
            if (breakflg) {
                break;
            }
            resultCount = resultCount + 1;
        }

        // 出力
        System.out.println(resultCount);
    }

    private static boolean checkEven(int value) {
        return value % 2 == 0;
    }
}