package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    public static void greeting() {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void generateGame(String description, String[] questions, String[] correctAnswers) {
        greeting();
        System.out.println(description);
        Scanner scanner  = new Scanner(System.in);

        for (var i = 0; i < questions.length; i++) {

            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            var answer = scanner.next();

            if (answer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'.\n" + "Let's try again, " + Engine.userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.userName + "!");
    }
}


