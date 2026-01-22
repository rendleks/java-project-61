package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner sc;
    private static String userName;

    public static String readInput() {
        sc = new Scanner(System.in);
        return  sc.nextLine().trim();
    }

    public static void setUserName(String name) {
        userName = name;
    }

    public static String getUserName() {
         return userName;
    }

    public static void close() {
        sc.close();
    }
}
