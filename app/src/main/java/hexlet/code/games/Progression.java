package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String[] CORRECT_ANSWERS = new String[3];

    public static void startGame() {
        var questions = getQuestions();
        var description = "What number is missing in the progression?";
        Engine.generateGame(description, questions, CORRECT_ANSWERS);
    }

    public static String[] getQuestions() {
        var questions = new String[3];
        for (var i = 0; i < questions.length; i++) {
            var progression = new String[7];
            var startOfProgression = (int) (Math.random() * 100);
            var step = 2 + (int) (Math.random() * (6 - 2));
            var indexOfAnswer = (int) (Math.random() * 7);

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
