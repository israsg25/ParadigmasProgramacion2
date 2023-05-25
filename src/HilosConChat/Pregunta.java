package HilosConChat;

import java.util.Scanner;

public class Pregunta {
    private static final int DELAY = 2000; // Retardo en milisegundos entre cada ejercicio

    public static void main(String[] args) {
        System.out.println("Read the conversation. Who is doing these things? Complete the sentences.");

        Pregunta exerciseThread = new Pregunta();
        exerciseThread.startExercise("1. _____________________________ is writing an essay.");
        exerciseThread.waitForAnswer("1. Who is writing an essay? ", "Kathyo");
        exerciseThread.evaluateAnswer("Kathyo");

        exerciseThread.startExercise("2. _____________________________ is having coffee.");
        exerciseThread.waitForAnswer("2. Who is having coffee? ", "Megm");
        exerciseThread.evaluateAnswer("Megm");

        exerciseThread.startExercise("3. _____________________________ is talking on the phone.");
        exerciseThread.waitForAnswer("3. Who is talking on the phone? ", "Carmen");
        exerciseThread.evaluateAnswer("Carmen");

        exerciseThread.startExercise("4. _____________________________ is watching a baseball game.");
        exerciseThread.waitForAnswer("4. Who is watching a baseball game? ", "Kathyo's father");
        exerciseThread.evaluateAnswer("Kathyo's father");

        exerciseThread.startExercise("5. _____________________________ is shopping.");
        exerciseThread.waitForAnswer("5. Who is shopping? ", "Kathyo's mother");
        exerciseThread.evaluateAnswer("Kathyo's mother");

        exerciseThread.startExercise("6. _____________________________ is playing soccer.");
        exerciseThread.waitForAnswer("6. Who is playing soccer? ", "John");
        exerciseThread.evaluateAnswer("John");
    }

    private void startExercise(String exercise) {
        System.out.println(exercise);
        sleep(DELAY);
    }

    private void waitForAnswer(String question, String expectedAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);

        String answer = scanner.nextLine();
        while (!answer.equalsIgnoreCase(expectedAnswer)) {
            System.out.println("Incorrect answer. Try again.");
            System.out.print(question);
            answer = scanner.nextLine();
        }
    }

    private void evaluateAnswer(String person) {
        System.out.println("Correct! " + person + " is doing that.");
        System.out.println("Great job!");
        System.out.println();
        sleep(DELAY);
    }

    private void sleep(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

