package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.Random.generateNumber;

public class Gcd {
    private static final int MAX_NUMBER = 20;
    private static final int COUNT_ROUNDS = 3;

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


    private static String[] generateRoundData() {

        var number1 = generateNumber(MAX_NUMBER);
        var number2 = generateNumber(MAX_NUMBER);

        var greatestDevisor = greatestCommonDivisor(number1, number2);

        var question = number1 + " " + number2;
        var answer = String.valueOf(greatestDevisor);

        return new String[]{question, answer};
    }


    public static void runGame() {
        final var description = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[COUNT_ROUNDS][2];

        for (int i = 0; i < COUNT_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

}
