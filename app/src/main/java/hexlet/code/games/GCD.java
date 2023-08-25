package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final String[] correctAnswers = new String[3];
    public static void startGame() {
        var questions = getQuestions();
        var description = "Find the greatest common divisor of given numbers.";
        Engine.generateGame(description, questions, correctAnswers);
    }

    public static String[] getQuestions() {
        var questions = new String[3];
        for (var i = 0; i < 3; i++) {
            var int1 = (int) (Math.random() * 100);
            var int2 = (int) (Math.random() * 100);
            questions[i] = int1 + " " + int2;
            correctAnswers[i] = Integer.toString(gcd(int1, int2));
        }

        return questions;
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
