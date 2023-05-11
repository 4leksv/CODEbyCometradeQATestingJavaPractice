package PrimitiveTypes;


public class RectangleExample {

    private double length;
    private double width;

    public RectangleExample() {
        length = 5;
        width = 6;
    }

    public RectangleExample(double width, double length) {
        // this.lenght = lenght;
        // this.width = width;
        setLength(length);
        setWidth(width);

    }


    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }


    public double getLength() {
        return  length;
    }

    void setLength(double length) {
        this.length = length;

    }
    public double calculateArea() {
        return length * width;
    }

    public double calculateCircumference() {
        return (length * 2) + (width * 2);
    }

}
