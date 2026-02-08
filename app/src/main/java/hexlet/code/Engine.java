package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;

    public static void run(String desriptionGame, String[][] quiz) {
        int countCorrectAnswer = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(desriptionGame);

        for (var round = 0; round < ROUNDS; round++) {
            var question = quiz[round][0];
            var correctAnswer = quiz[round][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userResponse = scanner.next();

            if (userResponse.equals(correctAnswer)) {
                countCorrectAnswer++;
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + userResponse
                        + "'"
                        + " is wrong answer ;(. "
                        + "Correct answer was "
                        + "'"
                        + correctAnswer
                        + "'."
                );
                System.out.println("Let's try again, " + userName + "!");
            }
        }

        if (countCorrectAnswer == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
        System.exit(0);
    }

}
