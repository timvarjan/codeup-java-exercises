package src;

import java.util.Scanner;
import java.lang.reflect.Array;

public class Person {
    //TODO: Create Person class inside of src that has a private name field that is a string, and the following methods:
    private String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, from %s. %n",name);
//        System.out.printf("Hello, " + name +"!");
    }

    //TODO The class should have a constructor that accepts a `String` value and sets the person's name to the passed string.
    public Person(String name) {
        this.name = name;
    }

    //TODO Create a `main` method on the class that creates a new `Person` object and tests the above methods.
    public static void main(String[] args) {

//        Person billy = new Person("Billy");
//        System.out.println(billy.getName());
//        billy.setName("Bob");
//        System.out.println(billy.getName());
//        billy.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
//            person2.setName("Jane");
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());



    }
}