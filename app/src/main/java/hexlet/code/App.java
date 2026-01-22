package hexlet.code;

import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n0 - Exit\n");
        System.out.print("Your choice: ");
        Cli userInput = new Cli();
        int choiceSelect = Integer.parseInt(userInput.readInput());

        if (choiceSelect == 1) {
            greeting(userInput);
        }

        if (choiceSelect == 2) {
            greeting(userInput);
            Even game = new Even();
            game.rules();
            game.startGame(userInput);
        }

        if (choiceSelect == 0) {
            System.exit(0);
        }

        userInput.close();
    }

    public  static void greeting(Cli userInput) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have you name? ");
        String name = Cli.readInput();
        userInput.setUserName(name);
        System.out.println("Hello, " + name + "!");

    }
}
