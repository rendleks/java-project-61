package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String descriptionGame;
    private static String[] questionEven;
    private static String[] answerEven;

    Engine(String descriptionGame, String[] question, String[] answer) {
        this.descriptionGame = descriptionGame;
        this.questionEven = question;
        this.answerEven = answer;
    }

    public static void start() {
        int countCorrectAnswer = 0;
        int numberOfAttempts = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Brain Games!");
		System.out.print("May I have your name? ");
		String userName = scanner.next();
		System.out.println("Hello, " + userName + "!");

        System.out.println(descriptionGame);

        while (numberOfAttempts < 3) {
            var question = questionEven[numberOfAttempts];
            var correctAnswer = answerEven[numberOfAttempts];
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
