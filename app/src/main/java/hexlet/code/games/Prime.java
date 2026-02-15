package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.Random.generateNumber;

public class Prime {
    private static final int MAX_NUMBER = 20;
    private static final int COUNT_ROUNDS = 3;

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static String[] generateRoundData() {
        var number = generateNumber(MAX_NUMBER);

        var question = Integer.toString(number);
        var answer = isPrime(number) ? "yes" : "no";

        return new String[]{question, answer};
    }

    public static void runGame() {
        final var description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[COUNT_ROUNDS][2];

        for (int i = 0; i < COUNT_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

}
