package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//     Args for Q1
        addNumbers(11, 7);
        subtractNumbers(11, 7);
        divideNumbers(11, 7);
        multiplyNumbers(11, 7);
        modulusNumbers(11, 7);
        //     End for Q1
        // Q2 Get Integer
        getInteger(1, 25);
        //     End for Q2
        // Q3 Factorial
        factorial();
        //     End for Q3
        // Q4 Factorial
        diceRoll();

    }

    //     Args for Q1
    public static void addNumbers(int x, int y) {
        System.out.println("The sum is: " + (x + y));
    }

    public static void subtractNumbers(int x, int y) {
        System.out.println("The difference is: " + (x - y));
    }

    public static void divideNumbers(int x, int y) {
        System.out.println("The quotient is: " + (x / y));
    }

    public static void multiplyNumbers(int x, int y) {
        System.out.println("The product is: " + (x * y));
    }

    public static void modulusNumbers(int x, int y) {
        System.out.println("The remainder is: " + (x % y));
    }

    //     End for Q1
    // Q2 get integer
    public static int getInteger(int min, int max) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 25:");
        int input = Scanner.nextInt();
        if (input > max || input < min) {
            System.out.println("Your number is invalid!");
            return getInteger(min, max);
        }
        System.out.printf("The number, %s, is valid. ", input);
        return input;
    }
    //     End for Q2
    // Q3 factorial

    public static void factorial() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Now, please enter a number between 1 and 10: ");
        String userIntStr = Scanner.nextLine();
        int userInt = Integer.parseInt(userIntStr);
        if (!(userInt >= 1 && userInt <= 10)) {
            factorial();
        }

        String choice;
        do {
            for (long i = 1; i <= userInt; i++) {
                long factorial = i;
                System.out.printf("%s! = 1 ", factorial);
                for (long l = 1; l <= i; l++) {
                    factorial *= l;
                    if (l != 1) {
                        System.out.printf("x %s ", l);
                    }
                }
                System.out.printf("  = %s%n", factorial);
            }
            System.out.println("Would you like to continue? [y/n]");
            choice = Scanner.nextLine();

        } while (choice.equalsIgnoreCase("y"));
    }

    // Q4 Factorial
    public static void diceRoll() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Give me a number of sides for a pair of dice: ");
        String diceSidesStr = Scanner.nextLine();
        int diceSides = Integer.parseInt(diceSidesStr);
        System.out.printf("Your first di rolled a %s.%nYour second di rolled a %s.", randomNum(diceSides), randomNum(diceSides));
    }

    public static int randomNum(int num) {
        return (int) ((Math.random() * (num)) + 1);
    }
}








