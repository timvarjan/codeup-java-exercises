package src;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine();

            int guess;
            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Your guess is out of range. Please enter a number between 1 and 100.");
                continue;
            }

            if (guess < secretNumber) {
                System.out.println("HIGHER");
            } else if (guess > secretNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
                System.out.println("You guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
