package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String descriptionGame;
    private static String[] questions;
    private static String[] answers;

    Engine(String descriptionGame, String[] questions, String[] answers) {
        this.descriptionGame = descriptionGame;
        this.questions = questions;
        this.answers = answers;
    }

    public static void start() {
        int countCorrectAnswer = 0;
        int numberOfAttempts = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nWelcome to the Brain Games!");
		System.out.print("May I have your name? ");
		String userName = scanner.next();
		System.out.println("Hello, " + userName + "!");

        System.out.println(descriptionGame);

        while (numberOfAttempts < 3) {
            var question = questions[numberOfAttempts];
            var correctAnswer = answers[numberOfAttempts];
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
                        + "\nLet's try again, "
                        + userName
                        + "!"
                );
            }
            numberOfAttempts++;
        }

        if (countCorrectAnswer == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
