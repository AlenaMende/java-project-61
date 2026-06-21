package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = getRounds();

        Engine.run(rounds, description);
    }

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


