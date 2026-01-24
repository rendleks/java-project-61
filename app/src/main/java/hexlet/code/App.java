package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Cals\n4 - GCD\n0 - Exit\n");
        System.out.print("Your choice: ");
        Cli userInput = new Cli();
        int choiceSelect = Integer.parseInt(userInput.readInput());

        if (choiceSelect == 1) {
            greeting(userInput);
        }

        if (choiceSelect == 2) {
            greeting(userInput);
            Even game = new Even();
            var questions = new String[3];
            var answers = new String[3];
            for (var i = 0; i < 3; i++) {
                var newGame = new Even();
                questions[i] = newGame.question();
                answers[i] = newGame.answer();
            }
            Engine engine = new Engine(userInput, game.description(), questions, answers);
            engine.start();
        }

        if (choiceSelect == 3) {
            greeting(userInput);
            Calc game = new Calc();
            var questions = new String[3];
            var answers = new String[3];
            for (var i = 0; i < 3; i++) {
                var newGame = new Calc();
                questions[i] = newGame.question();
                answers[i] = newGame.answer();
            }
            Engine engine = new Engine(userInput, game.description(), questions, answers);
            engine.start();
        }

        if (choiceSelect == 4) {
            greeting(userInput);
            Gcd game = new Gcd();
            var questions = new String[3];
            var answers = new String[3];
            for (var i = 0; i < 3; i++) {
                var newGame = new Gcd();
                questions[i] = newGame.question();
                answers[i] = newGame.answer();
            }
            Engine engine = new Engine(userInput, game.description(), questions, answers);
            engine.start();
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
