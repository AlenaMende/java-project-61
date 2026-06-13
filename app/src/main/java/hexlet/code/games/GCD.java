package hexlet.code.games;

import java.util.Random;

public class GCD {
    public static String[][] getRounds() {

        Random random = new Random();
        String[][] rounds = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int a = random.nextInt(99);
            int b = random.nextInt(99);

            String question = a + " " + b;

            while (b != 0) {
                var temp = b;
                b = a % b;
                a = temp;
            }

            String answer = String.valueOf(Math.abs(a));
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }
}
