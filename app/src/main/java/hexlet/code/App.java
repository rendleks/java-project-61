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
                return;
			case "1":
				Cli.greet();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
				break;
            case "6":
                break;
            default:
				throw new RuntimeException("Unknown input: " + selectedGame);
		}

		scanner.close();
    }
}
