package Exception;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTesting {
    static String[] names = {"Dragana", "Nebojsa", "Nina"};

    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Zdravo " + names[i]);

            createNewFile();
            numbersExceptionHandling();
        }

    public static void createNewFile() {
        try {
            File file = new File("mojFolder/nepostojeciFajl.txt");
            file.createNewFile();
        } catch(IOException |
                IllegalArgumentException |
                ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception is handled");
            ex.printStackTrace();
        } finally {
            System.out.println("Finnaly block is executed");
        }
    }

    public static void numbersExceptionHandling() {
        Scanner scanner = null;
        try {
            File file = new File("nepostojeciFolder/nopostojeciFajl.txt");
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                double num = scanner.nextDouble();
                System.out.println(num);
            }
        } catch(IOException | InputMismatchException | NullPointerException ex) {
            System.out.println("Exceptions are handled");
        } finally {
            System.out.println("Finaaly block is executed");
            if(scanner != null) {
                scanner.close();
            }
        }
    }
}