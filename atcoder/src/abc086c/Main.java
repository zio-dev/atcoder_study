package abc086c;

import java.util.*;

public class Main {

    private static class ValueObject {

        ValueObject(int inputT, int inputX, int inputY) {
            this.inputT = inputT;
            this.inputX = inputX;
            this.inputY = inputY;
        }

        public int inputT;
        public int inputX;
        public int inputY;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力値の取得
        int inputN = sc.nextInt();

        // 入力値保持用の配列を宣言
        ValueObject[] arrayVo = new ValueObject[inputN + 1];
        arrayVo[0] = new ValueObject(0, 0, 0);
        for (int i = 1; i <= inputN; i++) {
            ValueObject vo = new ValueObject(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arrayVo[i] = vo;
        }

        boolean process = true;

        int i = 0;
        while (true) {

            if (i == arrayVo.length - 1) {
                break;
            }

            ValueObject currentPosition = arrayVo[i];
            ValueObject nextPosition = arrayVo[i + 1];

            int diffT = nextPosition.inputT - currentPosition.inputT;
            int diffX = nextPosition.inputX - currentPosition.inputX;
            int diffY = nextPosition.inputY - currentPosition.inputY;

            diffX = diffX < 0 ? diffX * -1 : diffX;
            diffY = diffY < 0 ? diffY * -1 : diffY;

            int diff = diffT - (diffX + diffY);

            if (diff < 0) {
                process = false;
                break;
            }

            if (diff % 2 == 1) {
                process = false;
                break;
            }

            i = i + 1;
        }

        String result = String.valueOf(process ? "Yes" : "No");
        // 出力
        System.out.println(result);
    }
}