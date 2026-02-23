package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.Random.generateNumber;

public class Calc {
    private static final int MAX_NUMBER = 20;
    private static final int MIN_NUMBER = 1;
    private static final int COUNT_ROUNDS = 3;

    private static String randomOperation() {
        String[] operation = {"*", "+", "-"};
        var randomNumber = generateNumber(0, 2);

        return operation[randomNumber];
    }

    private static String[] generateRoundData() {
        var number1 = generateNumber(MIN_NUMBER, MAX_NUMBER);
        var number2 = generateNumber(MIN_NUMBER, MAX_NUMBER);
        var operation = randomOperation();

        var question = number1 + " " + operation + " " + number2;

        int result;

        switch (operation) {
            case "*":
                result = number1 * number2;
                break;
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            default:
                throw new RuntimeException("Unknown input: " + operation);
        }

        var answer = Integer.toString(result);

        return new String[]{question, answer};
    }

    public static void runGame() {
        final var description = "What is the result of the expression?";
        String[][] roundsData = new String[COUNT_ROUNDS][2];

        for (int i = 0; i < COUNT_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }
}
