package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int QUESTIONS_ARRAY_SIZE = 3;
    private static final int RANGE_OF_NUMBERS = 100;
    private static final int UPPER_RANGE = 7;
    private static final String[] CORRECT_ANSWERS = new String[QUESTIONS_ARRAY_SIZE];

    public static void startGame() {
        var questions = getQuestions();
        var description = "What number is missing in the progression?";
        Engine.generateGame(description, questions, CORRECT_ANSWERS);
    }

    public static String[] getQuestions() {
        var questions = new String[QUESTIONS_ARRAY_SIZE];
        for (var i = 0; i < questions.length; i++) {
            var progression = new String[UPPER_RANGE];
            var startOfProgression = (int) (Math.random() * RANGE_OF_NUMBERS);
            var step = 2 + (int) (Math.random() * (UPPER_RANGE - 1 - 2));
            var indexOfAnswer = (int) (Math.random() * UPPER_RANGE);

            progression[0] = Integer.toString(startOfProgression);

            for (var j = 1; j < progression.length; j++) {
                progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + step);
            }

            CORRECT_ANSWERS[i] = progression[indexOfAnswer];
            progression[indexOfAnswer] = "..";
            questions[i] = String.join(" ", progression);
        }
        return questions;
    }
}
