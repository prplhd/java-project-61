package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    private static final String[] correctAnswers = new String[3];
    public static void startGame() {
        var questions = getQuestions();
        var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.generateGame(description, questions, correctAnswers);
    }

    public static String[] getQuestions() {
        var questions = new String[3];

        for (var i = 0; i < questions.length; i++) {
            var number = (int) (Math.random() * 100);
            questions[i] = Integer.toString(number);
            correctAnswers[i] = number % 2 == 0 ? "yes" : "no";
        }

        return questions;
    }
}
