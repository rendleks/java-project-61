package hexlet.code.games;

public class Calc {
    private static String[] questions = new String[3];
    private static String[] answers = new String[3];

    public static String description() {
        return "What is the result of the expression?";
    }

    public static void start() {

        for (var i = 0; i < 3; i++) {
            int randomNumber1 = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
            int randomNumber2 = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
            int randomOperation = (int) Math.floor(Math.random() * (3 - 0 + 0)) + 0;
            String[] operation = {" * ", " + ", " - "};
            int result = 0;

            switch (randomOperation) {
                case 0:
                    result = randomNumber1 * randomNumber2;
                    break;
                case 1:
                    result = randomNumber1 + randomNumber2;
                    break;
                case 2:
                    result = randomNumber1 - randomNumber2;
                    break;
                default:
                    break;
            }

            questions[i] = randomNumber1 + operation[randomOperation] + randomNumber2;
            answers[i] = Integer.toString(result);
        }
    }

    public static String[] getQuestions() {
        return questions;
    }

    public static String[] getAnswers() {
        return answers;
    }
}
