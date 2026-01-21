package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        scanner.close();

        return input;
    }
}
