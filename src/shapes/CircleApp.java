package src.shapes;


import src.util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        do {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.getDouble();

            Circle circle = new Circle(radius);


            System.out.printf("The circumference of the circle is: %.2f%n", circle.getCircumference());
            System.out.printf("The area of the circle is: %.2f%n", circle.getArea());

            System.out.println("Would you like to create another circle");
            input.getString();
        } while (input.yesNo());


    }
}
