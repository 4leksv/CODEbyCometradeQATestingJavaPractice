package Exception;
import java.io.IOException;
public class ExceptionVezba {

    //Write a Java program that takes a number as input and prints itsmultiplication table up to 10

    public static void main(String[] args) {
        try {
            int c = 30/0;
        } catch (ArithmeticException ex) {
            System.out.println("Dividing by zero is not allowed");
        } finally {
            System.out.println("Division is fun");
        }
    }
}