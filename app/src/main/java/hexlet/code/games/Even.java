package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGame() {
        var questions = getQuestions();
        var correctAnswers = getCorrectAnswer(questions);
        var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.generateGame(description, questions, correctAnswers);
    }

    public static String[] getQuestions() {
        var questions = new String[3];
        for (var i = 0; i < 3; i++) {
            questions[i] = Integer.toString((int) (Math.random() * 100));
        }

        return questions;
    }
    public static String[] getCorrectAnswer(String[] questions) {
        var correctAnswers = new String[3];
        for (var i = 0; i < 3; i++) {
            correctAnswers[i] = Integer.parseInt(questions[i]) % 2 == 0 ? "yes" : "no";
        }

        return correctAnswers;
    }
}
