package PrimitiveTypes;

import java.awt.*;

public class ObjectInit {

    public static void main(String[] args) {

//        RectangleExample kvadrat = new RectangleExample(3.15, 6.25);
//        kvadrat.setLength(5.25);
//        RectangleExample pravougaonik = new RectangleExample();
//        double area = pravougaonik.calculateArea();
//        System.out.println(area);

        Appartment appartment = new Appartment(10, 15);
        AreaCalculator calculator = new AreaCalculator(appartment);
        System.out.println(calculator.appartmentArea());



        StaticObject staticObject = new StaticObject();
        staticObject.number = 10;


    }
}
