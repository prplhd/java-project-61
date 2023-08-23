package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void isEvenGameStart() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 1; i <= 3; i++) {
            var currentNum = (int) (Math.random() * 100);
            var isEven = currentNum % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + currentNum);
            System.out.print("Your answer: ");
            var answer = scanner.next();

            if (answer.equals(isEven)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + isEven + "'.\n" + "Let 's try again, " + App.userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + App.userName + "!");
    }
}
