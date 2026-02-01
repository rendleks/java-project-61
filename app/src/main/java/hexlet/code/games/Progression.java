package hexlet.code.games;


import java.util.StringJoiner;

public class Progression {
    private static String[] questions = new String[3];
    private static String[] answers = new String[3];

    public static String description() {
        return "What number is missing in the progression?";
    }

    public static void start() {
        for (var i = 0; i < 3; i++) {
            int randomNumberDelete = (int) Math.floor(Math.random() * (9 - 0 + 0)) + 0;
            int randomNumberStart = (int) Math.floor(Math.random() * (50 - 10 + 10)) + 10;
            int randomStep = (int) Math.floor(Math.random() * (30 - 1 + 1)) + 1;

            var progressionQuestion = progressionString(randomNumberStart, randomStep);
            var replaceChar = progressionQuestion.split(" ")[randomNumberDelete];

            questions[i] = progressionQuestion.replace(replaceChar, "..");
            answers[i] = replaceChar;
        }
    }

    public static String progressionString(int start, int step) {

        var result = new StringJoiner(" ");

        for (var j = 0; j < 10; j++) {
            var currentNum = start + j * step;
            result.add(Integer.toString(currentNum));
        }

        return result.toString();
    }

    public static String[] getQuestions() {
        return questions;
    }

    public static String[] getAnswers() {
        return answers;
    }
}
