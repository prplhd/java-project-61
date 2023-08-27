package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int QUESTIONS_ARRAY_SIZE = 3;
    private static final int RANGE_OF_NUMBERS = 100;
    private static final String[] CORRECT_ANSWERS = new String[QUESTIONS_ARRAY_SIZE];
    public static void startGame() {
        var questions = getQuestions();
        var description = "Find the greatest common divisor of given numbers.";
        Engine.generateGame(description, questions, CORRECT_ANSWERS);
    }

    public static String[] getQuestions() {
        var questions = new String[QUESTIONS_ARRAY_SIZE];
        for (var i = 0; i < questions.length; i++) {
            var int1 = 1 + (int) (Math.random() * RANGE_OF_NUMBERS - 1);
            var int2 = 1 + (int) (Math.random() * RANGE_OF_NUMBERS - 1);
            questions[i] = int1 + " " + int2;
            CORRECT_ANSWERS[i] = Integer.toString(gcd(int1, int2));
        }

        return questions;
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
