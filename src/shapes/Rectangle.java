package src.shapes;


public  class Rectangle extends Quadrilateral {


    // constructor
    protected Rectangle(double length, double width) {
        super(length, width);
    }

    @Override // implement Quadrilateral
    public void setLength(double length) {
        this.length = length;
    }

    @Override // implement Quadrilateral
    public void setWidth(double width) {
        this.width = width;
    }

    @Override // implement Measurable
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override // implement Measurable
    public double getArea() {
        return length * width;
    }
}


//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (length * 2) + (width * 2);
//    }
//


//}
