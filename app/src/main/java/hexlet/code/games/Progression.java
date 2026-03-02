package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.util.Random.generateNumber;

public class Progression {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_NUMBER_IN_PROGRESSION = 10;
    private static final int MIN_NUMBER_FOR_STEP = 3;
    private static final int MAX_NUMBER_FOR_STEP = 40;
    private static final int MAX_NUMBER_FOR_DELETE = 9;
    private static final int COUNT_ROUNDS = 3;

    public static String[] progressionString(int start, int step) {

        var result = new String[MAX_NUMBER_IN_PROGRESSION];

        for (var j = 0; j < MAX_NUMBER_IN_PROGRESSION; j++) {
            var currentNum = start + j * step;
            result[j] = Integer.toString(currentNum);
        }

        return result;
    }

    private static String[] generateRoundData() {

        var start = generateNumber(MIN_NUMBER, MAX_NUMBER);
        var step = generateNumber(MIN_NUMBER_FOR_STEP, MAX_NUMBER_FOR_STEP);
        var deleteNumber = generateNumber(0, MAX_NUMBER_FOR_DELETE);

        var progression = progressionString(start, step);
        var answer = progression[deleteNumber];

        progression[deleteNumber] = "..";
        var question = String.join(" ", progression);

        return new String[] {question, answer};
    }

    public static void runGame() {
        final var description = "What number is missing in the progression?";
        String[][] roundsData = new String[COUNT_ROUNDS][2];

        for (int i = 0; i < COUNT_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }
}
