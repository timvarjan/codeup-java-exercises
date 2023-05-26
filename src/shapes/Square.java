package src.shapes;

public class Square extends Quadrilateral {

    // 1.Remove the code from the body of your Rectangle and Square classes.
    protected Square(double side) {
        super(side, side);
    }

    // Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.
    @Override // implement Quadrilateral
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override // implement Quadrilateral
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override // implement Measurable
    public double getPerimeter() {
        return 4 * width;
    }

    @Override // implement Measurable
    public double getArea() {
        return length * width;
    }

}

//package shapes;
//
//public class Square extends Rectangle {
//    public Square(int side) {
//        super(side, side);
//    }
//
//    @Override
//    public int getArea() {
//        return (int) Math.pow(length, 2);
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * length;
//    }}