package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.Random.generateNumber;

public class Even {
    private static final int MAX_NUMBER = 20;
    private static final int COUNT_ROUNDS = 3;

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static String[] generateRoundData() {

        var number = generateNumber(MAX_NUMBER);

        var question = Integer.toString(number);
        var answer = isEven(number) ? "yes" : "no";

        return new String[]{question, answer};
    }

    public static void runGame() {
        final var description = "\"Answer 'yes' if the number is even, otherwise answer 'no'.\"";
        String[][] roundsData = new String[COUNT_ROUNDS][2];

        for (int i = 0; i < COUNT_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

}
