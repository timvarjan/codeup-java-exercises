

package src;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Formatter;

public class ControlFlowExercises {
    public static void main(String[] args) {
//      1.Loop Basics==================
//
//     a. While-------------------
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15){
//            System.out.println("i is " + i);
//            i++;
//        }


//        b. Do While--------------------
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);


//        Alter your loop to count backwards by 5's from 100 to -10.--------------------
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//      Output should equal:---------------

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

        //or

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i <= 1000000);

//        For===============================
//==================
//        Refactor the previous two exercises to use a for loop instead.==================


// b.
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println("i is " + i);
//        }

// c.
//        for (long i = 2; i <= 1000000; i = i * i) {
//            System.out.println("i is " + i);
//        }
//==================


//  ==========================================================
//  2.      Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.


//        int end = 100;
//
//        for (int i = 1; i <= end; i++) {
//
//            if (((i % 3) == 0) && ((i % 5) == 0)) {
//                System.out.println("fizzbuzz");
//            } else if ((i % 3) == 0) {
//                System.out.println("fizz");
//            } else if ((i % 5) == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//  ==========================================================

//  ==========================================================
//    3.  Display a table of powers.
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//


//        Scanner scanner = new Scanner(System.in);

//        System.out.print("What number would you like to go up to? ");
//        int userInput = scanner.nextInt();
//        System.out.println("Here is your table!");
//
//        System.out.println("The highest we will go is: --> \"" + userInput + "\" <--");
//        System.out.println("Number Squared Cubed");
//
//
//        Formatter fmt;
//
//        for (int i = 1; i <= userInput; i++) {
//            fmt = new Formatter();
//
//            fmt.format("%4d   %4d   %4d", i, i * i, i * i * i);
//
//            System.out.println(fmt);
//    }
        //OR====================
//        boolean confirm = true;
//
//        do {
//            System.out.println("What number would you like to go up to? ");
//
//            int userInt = scanner.nextInt();
//            System.out.println("Here is your table:");
//            System.out.println("number | squared | cubed");
//            System.out.println("----- | ------- | ------");
//
//            for (int i = 1; i <= userInt; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-7s|%-7s|%-7s\n", i, square, cubed);
//            }
//            System.out.println("Continue? [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//        } while(confirm);
//        System.out.println("Okie dokie, adios!");



//  ==========================================================

        Scanner scanner = new Scanner(System.in);
//        String userAnswer;
//
//        do {
//            int userInput = 0;
//            char letterGrade;
//            do {
//                System.out.println("Enter a grade ranging from 0 to 100: ");
//                userInput = scanner.nextInt();
//            } while ((userInput <= 0) || (userInput >= 100));
//
//            if (userInput >= 88) {
//                letterGrade = 'A';
//            } else if (userInput >= 80) {
//                letterGrade = 'B';
//            } else if (userInput >= 67) {
//                letterGrade = 'C';
//            } else if (userInput >= 60) {
//                letterGrade = 'D';
//            } else {
//                letterGrade = 'F';
//            }
//            System.out.printf("Your grade of %d = %s", userInput, letterGrade);
//            System.out.println("\n Do you wish to input another grade? \n Type yes and enter to continue. \n Type anything else and hit enter to cancel.");
//            userAnswer = scanner.next();
//
//        } while (userAnswer.equals("yes"));

        //OR====================Review Answer

//see video


    }
}