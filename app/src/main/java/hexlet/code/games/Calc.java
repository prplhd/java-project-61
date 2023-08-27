package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int QUESTIONS_ARRAY_SIZE = 3;
    private static final int RANGE_OF_NUMBERS = 100;
    private static final String[] CORRECT_ANSWERS = new String[QUESTIONS_ARRAY_SIZE];
    public static void startGame() {
        var questions = getQuestions();
        var description = "What is the result of the expression?";
        Engine.generateGame(description, questions, CORRECT_ANSWERS);
    }

    public static String[] getQuestions() {
        var questions = new String[QUESTIONS_ARRAY_SIZE];
        for (var i = 0; i < questions.length; i++) {
            var int1 = ((int) (Math.random() * RANGE_OF_NUMBERS));
            var int2 = ((int) (Math.random() * RANGE_OF_NUMBERS));
            var sign = (int) (Math.random() * 2);

            switch (sign) {
                case 0 -> {
                    questions[i] = int1 + " + " + int2;
                    CORRECT_ANSWERS[i] = Integer.toString(int1 + int2);
                }
                case 1 -> {
                    questions[i] = int1 + " - " + int2;
                    CORRECT_ANSWERS[i] = Integer.toString(int1 - int2);
                }
                case 2 -> {
                    questions[i] = int1 + " * " + int2;
                    CORRECT_ANSWERS[i] = Integer.toString(int1 * int2);
                }
                default -> System.out.println("Something wrong: " + sign + " not expected.");
            }
        }

        return questions;
    }
}
