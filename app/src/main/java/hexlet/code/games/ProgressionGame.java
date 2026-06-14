package hexlet.code.games;

import java.util.Random;

public class ProgressionGame {
    public static String[][] getRounds() {
        Random random = new Random(); // NOSONAR

        String[][] rounds = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int start = random.nextInt(40);
            int step = random.nextInt(15) + 1;
            int length = 10;

            int[] progression = getProgression(start, step, length);
            int hiddenIndex = random.nextInt(progression.length);

            StringBuilder question = new StringBuilder();
            for (int k = 0; k < progression.length; k++) {
                if (k == hiddenIndex) {
                    question.append(".. ");
                } else {
                    question.append(progression[k]).append(" ");
                }
            }

            String answer = String.valueOf(progression[hiddenIndex]);

            rounds[i][0] = question.toString();
            rounds[i][1] = answer;
        }
        return rounds;
    }

    public static int[] getProgression(int start, int step, int length) {
        int[] progression = new int[length];

        for (int j = 0; j < length; j++) {
            progression[j] = start + j * step;
        }

        return progression;
    }
}
