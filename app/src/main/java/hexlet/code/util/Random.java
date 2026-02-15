package hexlet.code.util;

public class Random {
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static int generateNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static int generateNumber(int max) {
        return (int) Math.floor(Math.random() * (max - MIN_NUMBER + 1)) + MIN_NUMBER;
    }

    public static int generateNumber() {
        return generateNumber(MIN_NUMBER, MAX_NUMBER);
    }

}
