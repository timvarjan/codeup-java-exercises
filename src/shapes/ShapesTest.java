package src.shapes;

    public class ShapesTest {

        public static void main(String[] args) {



            // create rectangle with side length 6 and width 4
            Measurable rectangle = new Rectangle(6,4);


            // create a square with length 5
            Measurable square = new Square(5);

            // assign the rectangle to the myShape variable
            Measurable myShape = rectangle;
            System.out.println("Rectangle:");
            System.out.println("Area: " + myShape.getArea());
            System.out.println("Perimeter: " + myShape.getPerimeter());

            // assign the square to the myShape variable
            myShape = square;
            System.out.println("Square:");
            System.out.println("Area: " + myShape.getArea());
            System.out.println("Perimeter: " + myShape.getPerimeter());
        }
    }


//    package shapes;
//
//public class ShapesTest {
//
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//
//
//    }
//
//}

