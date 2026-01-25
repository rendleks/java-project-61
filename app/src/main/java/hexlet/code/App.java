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
                questionsEven[0] = evenGame.question();
                answersEven[0] = evenGame.answer();
                questionsEven[1] = evenGame.question();
                answersEven[1] = evenGame.answer();
                questionsEven[2] = evenGame.question();
                answersEven[2] = evenGame.answer();
                Engine engineEven = new Engine(userInput, evenGame.description(), questionsEven, answersEven);
                engineEven.start();
                return;
            case 3:
                greeting(userInput);
                var questionsCalc = new String[3];
                var answersCalc = new String[3];
                var calcGame = new Calc();
                questionsCalc[0] = calcGame.question();
                answersCalc[0] = calcGame.answer();
                questionsCalc[1] = calcGame.question();
                answersCalc[1] = calcGame.answer();
                questionsCalc[2] = calcGame.question();
                answersCalc[2] = calcGame.answer();
                Engine engineCalc = new Engine(userInput, calcGame.description(), questionsCalc, answersCalc);
                engineCalc.start();
                return;
            case 4:
                greeting(userInput);
                var questionsGcd = new String[3];
                var answersGcd = new String[3];
                var gcdGame = new Gcd();
                questionsGcd[0] = gcdGame.question();
                answersGcd[0] = gcdGame.answer();
                questionsGcd[1] = gcdGame.question();
                answersGcd[1] = gcdGame.answer();
                questionsGcd[2] = gcdGame.question();
                answersGcd[2] = gcdGame.answer();
                Engine engineGcd = new Engine(userInput, gcdGame.description(), questionsGcd, answersGcd);
                engineGcd.start();
                return;
            case 5:
                greeting(userInput);
                var questionsProgression = new String[3];
                var answersProgression = new String[3];
                var progressionGame = new Progression();
                questionsProgression[0] = progressionGame.question();
                answersProgression[0] = progressionGame.answer();
                questionsProgression[1] = progressionGame.question();
                answersProgression[1] = progressionGame.answer();
                questionsProgression[2] = progressionGame.question();
                answersProgression[2] = progressionGame.answer();
                Engine engineProgression = new Engine(userInput, progressionGame.description(), questionsProgression, answersProgression);
                engineProgression.start();
                return;
            case 6:
                greeting(userInput);
                var questionsPrime = new String[3];
                var answersPrime = new String[3];
                var primeGame = new Prime();
                questionsPrime[0] = primeGame.question();
                answersPrime[0] = primeGame.answer();
                questionsPrime[1] = primeGame.question();
                answersPrime[1] = primeGame.answer();
                questionsPrime[2] = primeGame.question();
                answersPrime[2] = primeGame.answer();
                Engine enginePrime = new Engine(userInput, primeGame.description(), questionsPrime, answersPrime);
                enginePrime.start();
                return;
            default:
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
