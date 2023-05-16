package src;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//Exercises 1.
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//

//        double pi = 3.14159;
//        System.out.format("The value of pi is: %f%n", pi);

        //==========Exercises - Explore the scanner class: 1:=============

//        System.out.print("Enter and integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        I entered my name and got an error returned

        //==========Exercises - Explore the scanner class: 2:=============
//         TODO Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//       What happens if you enter less than 3 words? Nothing happens...
//       What happens if you enter more than 3 words? Removes the fourth work, then prints...

//        System.out.println("Enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("Your words are: %n %s, %n %s, %n %s, %n", firstWord, secondWord, thirdWord);

        //==========Exercises - Explore the scanner class: 3:=============
//        System.out.println("Type a sentence: ");
//        String sent = scanner.next();
//        System.out.printf("Here is your sentence: %s", sent);
//        Only first word of sentence prints

//        System.out.println("Type a sentence: ");
//        String sent = scanner.nextLine();
//        System.out.printf("Here is your sentence: %s", sent);
//        works as expected


        //==========Exercises - Calculate the perimeter and area of Codeup's classrooms: 1:=============
//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).

//        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.

//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.

        System.out.println("What is the length of your room in feet?");
        double length = scanner.nextDouble();
        System.out.println("What is the width of your room in feet?");
        double width = scanner.nextDouble();
        System.out.println("What is the height of your room in feet?");
        double height = scanner.nextDouble();

        //Calculating the area of the room
        double area = length*width;
        System.out.printf("The area if the room is %.2f feet squared %n", area);

        double perimeter = (length*2) + (width*2);
        System.out.printf("The perimeter of the room is %.2f feet %n", perimeter);

        double volume = length * width * height;
        System.out.printf("The volume of the room is %.2f feet cubed %n", volume);

    }
}


