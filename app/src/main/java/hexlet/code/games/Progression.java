package hexlet.code.games;


import hexlet.code.Engine;

import java.util.StringJoiner;

import static hexlet.code.util.Random.generateNumber;

public class Progression {

    public static String progressionString(int start, int step) {

        var result = new StringJoiner(" ");

        for (var j = 0; j < 10; j++) {
            var currentNum = start + j * step;
            result.add(Integer.toString(currentNum));
        }

        return result.toString();
    }

    private static String[] generateRoundData() {
        var min = 1;
        var max = 100;

        var start = generateNumber(min, max);
        var step = generateNumber(3, 40);
        var deleteNumber = generateNumber(0, 9);

        var progressionQuestion = progressionString(start, step);
        var replaceChar = progressionQuestion.split(" ")[deleteNumber];

        var question = progressionQuestion.replace(replaceChar, "..");
        var answer = replaceChar;


        return new String[] {question, answer};
    }

    public static void runGame() {
        final var description = "What number is missing in the progression?";
        String[][] roundsData = new String[3][2];

        for (int i = 0; i < 3; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }
}
