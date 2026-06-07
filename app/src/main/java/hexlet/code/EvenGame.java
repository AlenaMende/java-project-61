package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class EvenGame {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void toStartEvenGame() {
        Cli.run();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            String answer = scanner.next();

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + (isEven(number) ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + Cli.userName);
                return;
            }
            String correctAnswer = isEven(number) ? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.userName);
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }
}


