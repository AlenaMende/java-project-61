package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCD;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter."
                + "\n 1 - Greet \n 2 - Even \n 3 - Calc \n 4 - GCD \n 5 - Progression \n 6 - Prime \n 0 - Exit");
        String userChoice = scanner.next();
        System.out.println("Your choice: " + userChoice);

        switch (userChoice) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.run();
                break;
            case "2":
                Engine.run(EvenGame.getRounds(), "Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case "3":
                Engine.run(CalcGame.getRounds(), "What is the result of the expression?");
                break;
            case "4":
                Engine.run(GCD.getRounds(), "Find the greatest common divisor of given numbers.");
                break;
            case "5":
                Engine.run(ProgressionGame.getRounds(), "What number is missing in the progression?");
                break;
            case "6":
                Engine.run(PrimeGame.getRounds(), "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            case "0":
                return;
            default:
                System.out.println("Unknown choice");
        }
    }
}
