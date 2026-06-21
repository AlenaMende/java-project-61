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
                EvenGame.play();
                break;
            case "3":
                CalcGame.play();
                break;
            case "4":
                GCD.play();
                break;
            case "5":
                ProgressionGame.play();
                break;
            case "6":
                PrimeGame.play();
                break;
            case "0":
                return;
            default:
                System.out.println("Unknown choice " + userChoice);
        }
    }
}
