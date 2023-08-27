package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String[] CORRECT_ANSWERS = new String[3];

    public static void startGame() {
        var questions = getQuestions();
        var description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.generateGame(description, questions, CORRECT_ANSWERS);
    }

    public static String[] getQuestions() {
        var questions = new String[3];
        for (var i = 0; i < questions.length; i++) {
            var number = (int) (Math.random() * 100);
            questions[i] = Integer.toString(number);
            CORRECT_ANSWERS[i] = isPrime(number);
        }

        return questions;
    }
    public static String isPrime(int num) {
        if (num <= 1) {
            return "no";
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
