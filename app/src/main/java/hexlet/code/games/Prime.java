package hexlet.code.games;


public class Prime {

    private static String[] questions = new String[3];
    private static String[] answers = new String[3];

    public static String description() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void start() {
        for (var i = 0; i < 3; i++) {
            int randomNumber = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
            questions[i] = Integer.toString(randomNumber);
            answers[i] = isSimple(randomNumber) ? "yes" : "no";
        }
    }

    public static boolean isSimple(int number) {
        if (number < 2 || number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        var maxDevisor = (int) Math.sqrt(number);
        var i = 3;

        while (i <= maxDevisor) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static String[] getQuestions() {
        return questions;
    }

    public static String[] getAnswers() {
        return answers;
    }
}
