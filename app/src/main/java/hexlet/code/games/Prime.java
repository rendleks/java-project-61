package hexlet.code.games;

import java.util.StringJoiner;

public class Prime {
    private static int num;

    public static String description() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String question() {
        int randomNumber = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
        num = randomNumber;

        return Integer.toString(randomNumber);
    }

    public static String answer() {
        return isSimple(num) ? "yes" : "no";
    }

    public static Boolean isSimple(int number) {
        if (number < 2 || number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        var maxDevisor = (int) Math.sqrt(number);
        var i = 3;

        while (i <= maxDevisor) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
}
