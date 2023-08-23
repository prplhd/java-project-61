package hexlet.code;

import java.util.Scanner;

public class App {
    public static String userName;
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        var selected = scanner.next();
        System.out.println("Your choice: " + selected + "\n");

        switch (selected) {
            case "1":
                greeting();
                break;
            case "2":
                greeting();
                Even.isEvenGameStart();
                break;
            default:
                return;
        }
    }

    public static void greeting() {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
