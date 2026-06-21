package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void play() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] rounds = getRounds();

        Engine.run(rounds, description);
    }

    public static String[][] getRounds() {
        Random random = new Random(); // NOSONAR

        String[][] rounds = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int a = random.nextInt(99);
            int b = random.nextInt(99);

            String question = a + " " + b;
            String answer = String.valueOf(getGCD(a, b));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }
    public static int getGCD(int a, int b) {
        while (b != 0) {
            var temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
