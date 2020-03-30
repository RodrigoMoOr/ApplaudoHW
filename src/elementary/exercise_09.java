package elementary;

import java.util.Random;
import java.util.Scanner;

public class exercise_09 {

    public static void main(String [] args) {
        int random = generateRandom();
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.println("Guess the secret number");
            guess = scanner.nextInt();

            if (guess > random) {
                System.out.println("Too large");
            } else if (guess < random) {
                System.out.println("Too small");
            } else {
                System.out.println("You guessed the random!");
            }
        } while (guess != random);

    }

    private static int generateRandom() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
