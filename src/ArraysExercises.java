package src;

import java.util.Arrays;
import java.lang.String;
import java.lang.reflect.Array;



// 1. Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
public class ArraysExercises {

    private static Person[] addPerson(Person[] arr, Person person) {
        Person[] copy = Arrays.copyOf(arr, arr.length + 1);
        copy[arr.length] = person;
        return copy;
    }

        public static void main(String[] args) {

            Person[] people = new Person[3];
            people[0] = new Person("Rick");
            people[1] = new Person("Morty");
            people[2] = new Person("Bird Person");

            for (Person person : people) {
                System.out.println(person.getName());

            }

            // Add a new person to the array
            System.out.println("---------");
            Person newPerson = new Person("Summer");
            people = addPerson(people, newPerson);

            Person newPerson2 = new Person("Beth");
            people = addPerson(people, newPerson2);

            Person newPerson3 = new Person("Jerry");
            people = addPerson(people, newPerson3);

            Person newPerson4 = new Person("Rick Prime");
            people = addPerson(people, newPerson4);



            // Print the updated array
            for (Person person : people) {

                System.out.println(person.getName());
            }
        }
}




//    public static void main(String[] args) {

        // 1a. What happens when you run the following code? Why is Arrays.toString necessary?
        // Answer: Nothing happened when I ran the code without Arrays.toString...
        // Answer: Arrays.toString is necessary to convert the integer array to a string...
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(numbers));
        // The above code allows the string to be printed.  Make sure to include "import" in front of java.util.Arrays;...






        //1b. Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
    // Iterate through the array and print out the name of each person in the array.







