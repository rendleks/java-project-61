package hexlet.code.games;


public class Even {

    private static String[] questions = new String[3];
    private static String[] answers = new String[3];

    public static String description() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void start() {
        for (var i = 0; i < 3; i++) {
            int randomNumber = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
            questions[i] = Integer.toString(randomNumber);
            answers[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
    }
    public static String[] getQuestions() {
        return questions;
    }

    public static String[] getAnswers() {
        return answers;
    }

}
