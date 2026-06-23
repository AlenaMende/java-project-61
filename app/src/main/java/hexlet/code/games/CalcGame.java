package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class CalcGame {
    public static void play() {
        String description = "What is the result of the expression?";
        String[][] rounds = getRounds();

        Engine.run(rounds, description);
    }

    public static String[][] getRounds() {
        Random random = new Random(); // NOSONAR

        String[][] rounds = new String[3][2];

        char[] oper = {'+', '-', '*'};

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int a = random.nextInt(99);
            int b = random.nextInt(99);
            char op = oper[random.nextInt(oper.length)];

            String question = a + " " + op + " " + b;
            String answer = String.valueOf(calculate(a, b, op));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }
    public static int calculate(int a, int b, char op) {
        int result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new RuntimeException("Unknown operator " + op);
        };
        return result;
    }
}
