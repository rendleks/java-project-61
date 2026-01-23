package hexlet.code;

public class Engine {
    private static Cli user;
    private static String descriptionGame;
    private static String[] questionEven;
    private static String[] answerEven;

    Engine(Cli user, String descriptionGame, String[] question, String[] answer ) {
        this.user = user;
        this.descriptionGame = descriptionGame;
        this.questionEven = question;
        this.answerEven = answer;
    }

    public static void start() {
        int countCorrectAnswer = 0;
        int numberOfAttempts = 0;

        System.out.println(descriptionGame);

        while (numberOfAttempts < 3) {
            var question = questionEven[numberOfAttempts];
            var correctAnswer = answerEven[numberOfAttempts];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userResponse = user.readInput();

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
                        + user.getUserName()
                        + "!"
                );
            }
            numberOfAttempts++;
        }

        if (countCorrectAnswer == 3) {
            System.out.println("Congratulations, " + user.getUserName() + "!");
        }
    }
}
