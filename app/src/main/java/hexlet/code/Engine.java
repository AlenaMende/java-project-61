package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static int roundsCount = 3;

    public static void run(String[][] roundsData, String description) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        for (var i = 0; i < roundsCount; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];

            System.out.println("Question: " + question);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);

            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;

            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
