package src;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,World!");

//        1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

                int myFavoriteNumber = 3;
                System.out.println(myFavoriteNumber);

//        2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.

            //           String myString = "What day is it today?";
            //           System.out.println(myString);

//        3. Change your code to assign a character value to myString. What do you notice?

            //        String myString = 'z';
            //        System.out.println(myString); ---> java: variable myString is already defined in method main(java.lang.String[])

//        4. Change your code to assign the value 3.14159 to myString. What happens?

            //        String myString = 3.14159;
            //        System.out.println(myString);  ---> doesnt work unless in quotations

//
//       5.  Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

            //        long myNumber;
            //        System.out.println(myNumber);
            //        -----> java: variable myNumber might not have been initialized

//       6.  Change your code to assign the value 3.14 to myNumber. What do you notice?

//          long myNumber = 3.14;
//          System.out.println(myNumber);
//          ----> java: incompatible types: possible lossy conversion from double to long


//        7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//                    long myNumber = 123L;
//                    System.out.println(myNumber);
//                    ----> Prints 123

//       8.  Change your code to assign the value 123 to myNumber.

//                      long myNumber = 123;
//                      System.out.println(myNumber);
//                       ----> Prints 123
//        8a. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        long doesnt allocate memory for decimal places

//
//       9.  Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//                      float myNumber = 3.14f;
//                      System.out.println(myNumber);
//                      ---> error=java: incompatible types: possible lossy conversion from double to float
//                      ---> fixed by adding an 'f' to the end of the number
//                      ---> also can be fixed by declaring it as a double

//       10.  Copy and paste the following code blocks one at a time and execute them
//        A.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        ---> prints 5, 6 on different lines

//        B.
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        ---> prints 6, 6 on different lines

//        11. Try to create a variable named class. What happens?
//        var class;
//
//          12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//                How is the above example different from the code block below?

//        int three = (int) "three";

//     13.   Rewrite the following expressions using the relevant shorthand assignment operators:
//        a.
//        int x = 4;
//        x = x + 5;
//        b.
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        c.
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

//      14.  What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//      What happens if you increment a numeric variable past the type's capacity?
//      Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
byte smallNum = 127;
System.out.println(smallNum);

    }
}