package abc085b;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力値の取得
        int inputN = sc.nextInt();

        // 入力値保持用の配列を宣言
        int[] arrayInput = new int[inputN];
        for (int i = 0; i < inputN; i++) {
            arrayInput[i] = sc.nextInt();
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int i : arrayInput) {
            resultSet.add(i);
        }

        // 出力
        System.out.println(resultSet.size());
    }
}