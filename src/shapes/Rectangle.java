package src.shapes;


public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static class Square extends Rectangle {
        public Square(double side) {
            super(side, side);
        }

        @Override
        public double getArea() {
            return Math.pow(length, 2);
        }

        @Override
        public double getPerimeter() {
            return 4 * length;
        }
    }

    public static class ShapesTest {
        public static void main(String[] args) {
            // Testing Rectangle
            Rectangle box1 = new Rectangle(5, 4);
            System.out.println("Rectangle - Box1");
            System.out.println("Area: " + box1.getArea());            // Expected output: 20.0
            System.out.println("Perimeter: " + box1.getPerimeter());  // Expected output: 18.0
            System.out.println();

            // Testing Square
            Rectangle box2 = new Square(5);
            System.out.println("Square - Box2");
            System.out.println("Area: " + box2.getArea());            // Expected output: 25.0
            System.out.println("Perimeter: " + box2.getPerimeter());  // Expected output: 20.0
        }
    }
}

