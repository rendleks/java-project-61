package hexlet.code.games;

import hexlet.code.Cli;

public class Even {

    public static void rules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static void startGame(Cli userAnswer) {
        int countCorrectAnswer = 0;
        int numberOfAttempts = 0;

        while (numberOfAttempts < 3) {
            int randomNumber = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userResponse = userAnswer.readInput();

            if (userResponse.equals(correctAnswer)) {
                countCorrectAnswer++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
            numberOfAttempts++;
        }

        if (countCorrectAnswer == 3) {
            System.out.println("Congratulations, " + userAnswer.getUserName() + "!");
        }
    }
}
