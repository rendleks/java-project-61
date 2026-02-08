package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.Random.generateNumber;

public class Even {
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static String[] generateRoundData() {
        var min = 1;
        var max = 20;

        var number = generateNumber(min, max);

        var question = Integer.toString(number);
        var answer = isEven(number) ? "yes" : "no";

        return new String[] {question, answer};
    }

    public static void runGame() {
        final var description = "\"Answer 'yes' if the number is even, otherwise answer 'no'.\"";
        String[][] roundsData = new String[3][2];

        for (int i = 0; i < 3; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

}
