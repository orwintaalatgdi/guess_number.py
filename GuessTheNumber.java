import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guess the Number Game!");
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congrats! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
