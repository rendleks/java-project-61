package hexlet.code.games;

public class Calc {

    private static int result;
    public static String description() {
        return "What is the result of the expression?";
    }

    public static String question() {
        int randomNumber1 = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
        int randomNumber2 = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
        int randomOperation = (int) Math.floor(Math.random() * (3 - 0 + 0)) + 0;
        String[] operation = {" * ", " + ", " - "};

        switch (randomOperation) {
            case 0:
                result = randomNumber1 * randomNumber2;
                break;
            case 1:
                result = randomNumber1 + randomNumber2;
                break;
            case 2:
                result = randomNumber1 - randomNumber2;
                break;
        }

        return randomNumber1 + operation[randomOperation] + randomNumber2;

    }

    public static String answer() {
        return Integer.toString(result);
    }

}
