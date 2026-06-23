package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class ProgressionGame {
    public static void play() {
        String description = "What number is missing in the progression?";
        String[][] rounds = getRounds();

        Engine.run(rounds, description);
    }

    public static String[][] getRounds() {
        Random random = new Random(); // NOSONAR

        String[][] rounds = new String[3][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int start = random.nextInt(40);
            int step = random.nextInt(15) + 1;
            int length = 10;

            String[] progression = getProgression(start, step, length);
            int hiddenIndex = random.nextInt(progression.length);

            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);

            rounds[i][0] = question.toString();
            rounds[i][1] = answer;
        }
        return rounds;
    }

    public static String[] getProgression(int start, int step, int length) {
        String[] progression = new String[length];

        for (int j = 0; j < length; j++) {
            progression[j] = String.valueOf(start + j * step);
        }

        return progression;
    }
}
