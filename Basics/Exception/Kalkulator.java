package Exception;

import java.util.Scanner;

public class Kalkulator {

    public static int broj1;
    public static int broj2;


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(SabiranjeDvaBroja(1));

    }
    public static int SabiranjeDvaBroja(int zbir) {
        zbir = broj1 + broj2;
        return zbir;
    }

}
