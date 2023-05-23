package src.shapes;

import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();


        System.out.println("Enter a radius");
        double radius = in.getDouble();
        Circle cir = new Circle(radius);

        System.out.println("This is the area: " + cir.getArea());
        System.out.println("This is the circumference: " + cir.getCircumference());
        System.out.println("Would you like to continue our circle app: ");
        in.getString();
    } while(in.yesNo());

}
