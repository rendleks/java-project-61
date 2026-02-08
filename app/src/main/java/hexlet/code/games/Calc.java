package hexlet.code.games;

import  hexlet.code.Engine;

import static hexlet.code.util.Random.generateNumber;

public class Calc {

    private static String randomOperation() {
        String[] operation = {"*", "+", "-"};
        var randomNumber = generateNumber(0, 2);

        return operation[randomNumber];
    }

    private static String[] generateRoundData() {
        var min = 1;
        var max = 20;

        var number1 = generateNumber(min, max);
        var number2 = generateNumber(min, max);
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

        return new String[] {question, answer};
    }

    public static void runGame() {
        final var description = "What is the result of the expression?";
        String[][] roundsData = new String[3][2];

        for (int i = 0; i < 3; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }
}
