package hexlet.code.games;

public class Gcd {

    private static String[] questions = new String[3];
    private static String[] answers = new String[3];

    public static String description() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void start() {
        for (var i = 0; i < 3; i++) {
            int randomNumber1 = (int) Math.floor(Math.random() * (20 - 1 + 1)) + 1;
            int randomNumber2 = (int) Math.floor(Math.random() * (20 - 1 + 1)) + 1;

            StringBuilder questionString = new StringBuilder();
            questionString.append(randomNumber1);
            questionString.append(" ");
            questionString.append(randomNumber2);

            questions[i] = questionString.toString();
            answers[i] = String.valueOf(greatestCommonDivisor(randomNumber1, randomNumber2));
        }
    }

    public static int greatestCommonDivisor(int num1, int num2) {
        while (true) {
            var temp = num1;
            num1 = num2;
            num2 = temp % num1;
            if (num2 == 0) {
                break;
            }
        }

        return num1;
    }

    public static String[] getQuestions() {
        return questions;
    }

    public static String[] getAnswers() {
        return answers;
    }
}
