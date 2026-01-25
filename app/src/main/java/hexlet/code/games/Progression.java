package hexlet.code.games;

import java.util.StringJoiner;

public class Progression {
    private static int num;

    public static String description() {
        return "What number is missing in the progression?";
    }

    public static String question() {
        int randomNumberDelete = (int) Math.floor(Math.random() * (9 - 0 + 0)) + 0;
        int randomNumberStart = (int) Math.floor(Math.random() * (50 - 10 + 10)) + 10;
        int randomStep = (int) Math.floor(Math.random() * (30 - 1 + 1)) + 1;

        StringJoiner numbersSequence = new StringJoiner(" ");

        for (var i = 0; i < 10; i++) {
            var currentNum = randomNumberStart + i * randomStep;
            if (randomNumberDelete == i) {
                num = currentNum;
                numbersSequence.add("..");
            } else {
                numbersSequence.add(String.valueOf(currentNum));
            }
        }

        return numbersSequence.toString();
    }

    public static String answer() {
        return Integer.toString(num);
    }

}
