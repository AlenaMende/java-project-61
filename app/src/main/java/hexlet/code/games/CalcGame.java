package hexlet.code.games;

import java.util.Random;

public class CalcGame {
    public static String[][] getRounds() {

        Random random = new Random();
        String[][] rounds = new String[3][2];

        char[] oper = {'+', '-', '*'};

        for (var i = 0; i < 3; i++) {
            int a = random.nextInt(99);
            int b = random.nextInt(99);
            char op = oper[random.nextInt(oper.length)];

            int result = switch (op) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                default -> 0;
            };
            rounds[i][0] = a + " " + op + " " + b;
            rounds[i][1] = String.valueOf(result);
        }
        return rounds;
    }
}
