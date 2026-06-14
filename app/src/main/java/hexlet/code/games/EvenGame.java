package hexlet.code.games;

import java.util.Random;

public class EvenGame {
    public static String[][] getRounds() {
        Random random = new Random(); // NOSONAR

        String[][] rounds = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number = random.nextInt(99);
            String question = String.valueOf(number);
            String answer = (number % 2 == 0) ? "yes" : "no";
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }
}


