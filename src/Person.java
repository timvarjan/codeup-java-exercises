package src;

import java.util.Scanner;

public class Person {

    private Scanner scanner;
    private String name;
    private Person(String name) {
        this.name = name;
    }

    private String getName(){
//TODO: return the person's name
        return this.name;
    }
//TODO: change the name field to the passed value
    private void sayHello(){
        System.out.println("Hello, " + this.name + ". How the heck are ya?");
//TODO: print a message to the console using the person's name
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
//        Person person = new Person("Zenith");
//        person.sayHello();

        // returns 2 boolean values, the first is true and the second is false.
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        // returns 1 boolean values, true.
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


// returns 4 names: john, john, jane, jane
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }


}
