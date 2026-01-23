package hexlet.code.games;

import hexlet.code.Cli;

public class Even {

    private static int num;

    public static String description() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String question() {
        int randomNumber = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
        num = randomNumber;
        return Integer.toString(randomNumber);
    }

    public static String answer() {
        String answer = num % 2 == 0 ? "yes" : "no";
        return answer;
    }

}
