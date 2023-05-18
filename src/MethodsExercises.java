package src;
import java.util.Scanner;
public class MethodsExercises {

    public static void main(String[] args) {
        int sum = addNumbers(11, 7);
        System.out.println("The sum is: " + sum);

        int difference = subtractNumbers(11, 7);
        System.out.println("The difference is: " + difference);

        int quotient = divideNumbers(11, 7);
        System.out.println("The quotient is: " + quotient);

        int product = multiplyNumbers(11, 7);
        System.out.println("The product is: " + product);

        int modulus = modulusNumbers(11, 7);
        System.out.println("The result after modulus is: " + modulus);

        int min = 1;
        int max = 100;
        int userInput = getInputInRange(min, max);
        System.out.printf("You have entered a valid number within range: %d%n", userInput);
    }

    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;

    }

    public static int subtractNumbers(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }

    public static int divideNumbers(int num1, int num2) {
        int quotient = num1 / num2;
        return quotient;
    }

    public static int multiplyNumbers(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }
    public static int modulusNumbers(int num1, int num2) {
        int modulus = num1%num2;
        return modulus;
    }
        public static int getInputInRange(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            int input;
            do {
                System.out.printf("Please enter a number between %d and %d: ", min, max);
                while (!scanner.hasNextInt()) {
                    String invalidInput = scanner.next();
                    System.out.printf("\"%s\" is not a valid number.%n", invalidInput);
                }

                input = scanner.nextInt();


            } while (input < min || input > max);

            return input;
        } while
    }







