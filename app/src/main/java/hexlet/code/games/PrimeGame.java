package hexlet.code.games;

import java.util.Random;

public class PrimeGame {
    public static String[][] getRounds() {
        Random random = new Random(); // NOSONAR

        String[][] rounds = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number = random.nextInt(99);

            String question = String.valueOf(number);
            String answer = isPrime(number) ? "yes" : "no";
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
