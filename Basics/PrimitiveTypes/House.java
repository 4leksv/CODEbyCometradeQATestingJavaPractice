package PrimitiveTypes;

import java.awt.*;

public class House {
    private static double room1Area;
    private  static double room2Area;

    public static void main(String[] args) {

        RectangleExample room1 = new RectangleExample(5, 7);
        room1Area = room1.calculateArea();

        RectangleExample room2 = new RectangleExample(7, 8);
        room2Area = room2.calculateArea();

        System.out.println(totalArea());

        }
    public static double totalArea() {
        return room1Area + room2Area;

    }
}
