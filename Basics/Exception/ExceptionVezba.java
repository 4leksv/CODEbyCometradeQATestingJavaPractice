package Exception;
import java.io.IOException;
public class ExceptionVezba {
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