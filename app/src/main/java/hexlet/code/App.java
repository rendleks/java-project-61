package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print(
                "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Cals\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();

        switch (selectedGame) {
            case "0":
                System.exit(0);
                break;
            case "1":
                Cli.greet();
                break;
            case "2":
                Even gameEven = new Even();
                gameEven.start();
                Engine engineEven = new Engine(
                        gameEven.description(),
                        gameEven.getQuestions(),
                        gameEven.getAnswers()
                );
                engineEven.start();
                break;
            case "3":
                Calc gameCalc = new Calc();
                gameCalc.start();
                Engine engineCalc = new Engine(
                        gameCalc.description(),
                        gameCalc.getQuestions(),
                        gameCalc.getAnswers()
                );
                engineCalc.start();
                break;
            case "4":
                Gcd gameGcd = new Gcd();
                gameGcd.start();
                Engine engineGcd = new Engine(
                        gameGcd.description(),
                        gameGcd.getQuestions(),
                        gameGcd.getAnswers()
                );
                engineGcd.start();
                break;
            case "5":
                Progression gameProgression = new Progression();
                gameProgression.start();
                Engine engineProgression = new Engine(
                        gameProgression.description(),
                        gameProgression.getQuestions(),
                        gameProgression.getAnswers()
                );
                engineProgression.start();
                break;
            case "6":
                Prime gamePrime = new Prime();
                gamePrime.start();
                Engine enginePrime = new Engine(
                        gamePrime.description(),
                        gamePrime.getQuestions(),
                        gamePrime.getAnswers()
                );
                enginePrime.start();
                break;
            default:
                throw new RuntimeException("Unknown input: " + selectedGame);
        }

        scanner.close();
        System.exit(0);
    }
}
