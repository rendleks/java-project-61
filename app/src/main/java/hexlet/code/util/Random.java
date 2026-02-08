package hexlet.code.util;

public class Random {

    public static int generateNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static int generateNumber() {
        return generateNumber(1, 100);
    }

}
