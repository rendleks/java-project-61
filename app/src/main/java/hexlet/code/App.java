package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have you name? ");
        String name = Cli.readInput();
        System.out.println("Hello, " + name + "!");
    }
}
