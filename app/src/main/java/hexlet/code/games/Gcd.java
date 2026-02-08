package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.Random.generateNumber;

public class Gcd {
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
        var min = 1;
        var max = 20;

        var number1 = generateNumber(min, max);
        var number2 = generateNumber(min, max);

        var greatestDevisor = greatestCommonDivisor(number1, number2);

        var question = number1 + " " + number2;
        var answer = String.valueOf(greatestDevisor);

        return new String[] {question, answer};
    }


    public static void runGame() {
        final var description = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[3][2];

        for (int i = 0; i < 3; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

}
