package hexlet.code.games;

public class Gcd {

    private static int num;

    public static String description() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String question() {
        int randomNumber1 = (int) Math.floor(Math.random() * (20 - 1 + 1)) + 1;
        int randomNumber2 = (int) Math.floor(Math.random() * (20 - 1 + 1)) + 1;

        StringBuilder questionString = new StringBuilder();
        questionString.append(randomNumber1);
        questionString.append(" ");
        questionString.append(randomNumber2);

        while (true) {
            var temp = randomNumber1;
            randomNumber1 = randomNumber2;
            randomNumber2 = temp % randomNumber1;
            if (randomNumber2 == 0) {
                break;
            }
        }

        num = randomNumber1;
        return questionString.toString();
    }

    public static String answer() {
        return String.valueOf(num);
    }
}
