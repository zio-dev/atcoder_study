package abc087b;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力値の取得
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        int inputC = sc.nextInt();
        int inputX = sc.nextInt();

        int maxCountA = getMaxUseCount(inputX, inputA, 500);
        int maxCountB = getMaxUseCount(inputX, inputB, 100);
        int maxCountC = getMaxUseCount(inputX, inputC, 50);

        int resultCounter = 0;

        int tmpValueA = 0;
        for (int coinA = 0; coinA < maxCountA + 1; coinA++) {
            tmpValueA = 500 * coinA;
            if (tmpValueA == inputX) {
                resultCounter = resultCounter + 1;
                continue;
            }

            if (tmpValueA > inputX) {
                break;
            }

            int tmpValueB = 0;
            for (int coinB = 0; coinB < maxCountB + 1; coinB++) {
                tmpValueB = tmpValueA + 100 * coinB;
                if (tmpValueB == inputX) {
                    resultCounter = resultCounter + 1;
                    break;
                }

                if (tmpValueB > inputX) {
                    break;
                }

                int tmpValueC = 0;
                for (int coinC = 0; coinC < maxCountC + 1; coinC++) {
                    tmpValueC = tmpValueB + 50 * coinC;
                    if (tmpValueC == inputX) {
                        resultCounter = resultCounter + 1;
                        break;
                    }

                    if (tmpValueC > inputX) {
                        break;
                    }
                }
            }
        }
        // 出力
        System.out.println(resultCounter);
    }

    private static int getMaxUseCount(int target, int maxCount, int value) {
        int tmpTarget = target;
        int count = 0;
        while (true) {
            if (count >= maxCount) {
                break;
            }
            if (tmpTarget < value) {
                break;
            }
            count = count + 1;
            tmpTarget = tmpTarget - value;
        }
        return count;
    }
}