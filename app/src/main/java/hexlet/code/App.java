package hexlet.code;

import hexlet.code.games.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print(
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Cals\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit\n");
        System.out.print("Your choice: ");
        Cli userInput = new Cli();
        int choiceSelect = Integer.parseInt(userInput.readInput());

        switch (choiceSelect) {
            case 0:
                System.exit(0);
                return;
            case 1:
                greeting(userInput);
                return;
            case 2:
                greeting(userInput);
                var questionsEven = new String[3];
                var answersEven = new String[3];
                var evenGame = new Even();
                for (var i = 0; i < 3; i++) {
                    var game = new Even();
                    questionsEven[i] = game.question();
                    answersEven[i] = game.answer();
                }
                Engine engineEven = new Engine(userInput, evenGame.description(), questionsEven, answersEven);
                engineEven.start();
                return;
            case 3:
                greeting(userInput);
                var questionsCalc = new String[3];
                var answersCalc = new String[3];
                var calcGame = new Calc();
                for (var i = 0; i < 3; i++) {
                    var game = new Calc();
                    questionsCalc[i] = game.question();
                    answersCalc[i] = game.answer();
                }
                Engine engineCalc = new Engine(userInput, calcGame.description(), questionsCalc, answersCalc);
                engineCalc.start();
                return;
            case 4:
                greeting(userInput);
                var questionsGcd = new String[3];
                var answersGcd = new String[3];
                var gcdGame = new Gcd();
                for (var i = 0; i < 3; i++) {
                    var game = new Gcd();
                    questionsGcd[i] = game.question();
                    answersGcd[i] = game.answer();
                }
                Engine engineGcd = new Engine(userInput, gcdGame.description(), questionsGcd, answersGcd);
                engineGcd.start();
                return;
            case 5:
                greeting(userInput);
                var questionsProgression = new String[3];
                var answersProgression = new String[3];
                var progressionGame = new Progression();
                for (var i = 0; i < 3; i++) {
                    var game = new Progression();
                    questionsProgression[i] = game.question();
                    answersProgression[i] = game.answer();
                }
                Engine engineProgression = new Engine(userInput, progressionGame.description(), questionsProgression, answersProgression);
                engineProgression.start();
                return;
            case 6:
                greeting(userInput);
                var questionsPrime = new String[3];
                var answersPrime = new String[3];
                var primeGame = new Prime();
                for (var i = 0; i < 3; i++) {
                    var game = new Prime();
                    questionsPrime[i] = game.question();
                    answersPrime[i] = game.answer();
                }
                Engine enginePrime = new Engine(userInput, primeGame.description(), questionsPrime, answersPrime);
                enginePrime.start();
                return;
            default:
                System.exit(0);
        }

        userInput.close();
    }

    public  static void greeting(Cli userInput) {
        System.out.print(
                "\nWelcome to the Brain Games!\n" +
                "May I have your name? "
        );
        String name = Cli.readInput();
        userInput.setUserName(name);
        System.out.println("Hello, " + name + "!");

    }
}
