package abc085c;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力値の取得
        int inputN = sc.nextInt();

        int inputY = sc.nextInt();

        int typeA = 10000;
        int typeB = 5000;
        int typeC = 1000;

        int maxA = inputY / typeA;
        maxA = maxA > inputN ? inputN : maxA;
        int maxB = inputY / typeB;
        maxB = maxB > inputN ? inputN : maxB;
        int maxC = inputY / typeC;
        maxC = maxC > inputN ? inputN : maxC;

        int k = 0;
        int tmpCountA = 0;
        int tmpCountB = 0;
        int diffCountB = 0;
        for (int i = maxA; i >= 0; i--) {
            tmpCountA = typeA * i;
            if (tmpCountA == inputY && checkCountSum(inputN, i, 0, 0)) {
                System.out.println(i + " 0 0");
                return;
            }
            diffCountB = inputY - tmpCountA;
            for (int j = maxB; j >= 0; j--) {
                k = inputN - i - j;
                if (k < 0) {
                    continue;
                }
                tmpCountB = typeB * j + typeC * k;
                if (diffCountB < tmpCountB) {
                    continue;
                }
                if (diffCountB == tmpCountB) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
                if (diffCountB > tmpCountB) {
                    break;
                }
            }
        }

        // 出力
        System.out.println("-1 -1 -1");
    }

    private static boolean checkCountSum(int inputN, int countA, int countB, int countC) {
        return inputN == countA + countB + countC;
    }
}