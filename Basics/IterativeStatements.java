public class IterativeStatements {

    public static void main(String[] args) {

        int[] nizPromenljivih = {10, 20, 30, 40, 50, 60, 70, 80};
        int whileIterator = 0;

//        System.out.println(nizPromenljivih[7]);
//
//        for (int clanArraya : nizPromenljivih) {
//            System.out.println(clanArraya);
//        }

//        while(whileIterator < 5 ) {
//            System.out.println(whileIterator);
//            whileIterator++;
//        }

//        do {
//            System.out.println(whileIterator);
//            whileIterator++;
//        } while(whileIterator < 5 );

//        while(nizPromenljivih.length > whileIterator) {
//            System.out.println(nizPromenljivih[whileIterator]);
//            whileIterator++;
//        }

//        for(int i = 0; i < nizPromenljivih.length; i++) {
//            System.out.println("Ovo je vrednost niza promenljivih: " + nizPromenljivih[i]);
//            if (nizPromenljivih[i] == 50)
//                break;
//       }

//        String s = new String("Hello World");
//        System.out.println(s);


//      System.out.println(sumaDvaBroja(2, 4));
//        System.out.println(odstampajPunoIme("Aleksa", "Vukosavljevic"));
//        System.out.println(uporediDvaBroja(3,3));
//        System.out.println(podeliDvaBroja(3,2));
        ispisiSamoParneBrojeve(10);
    }


////    public static int sumaDvaBroja(int prviSabirak, int drugiSabirak) {
////
////        int zbir = prviSabirak + drugiSabirak;
////        return zbir;
//
//    }

//    public static String odstampajPunoIme(String ime, String prezime) {
//
//        String imeIPrezime = ime + " " + prezime;
//        return imeIPrezime;
//
//
//    }

//    public static String uporediDvaBroja(int prviBroj, int drugiBroj) {
//
//        if (prviBroj > drugiBroj) {
//            return "Prvi broj " + prviBroj + " je veci od " + drugiBroj + " drugog broja.";
//        } else if (prviBroj == drugiBroj) {
//            return "Brojevi su jednaki.";
//        } else {
//            return "Drugi broj " + drugiBroj + " je veci od " + prviBroj + " prvog broja.";
//        }

//    public static int podeliDvaBroja(int prviBroj, int drugiBroj) {
//        return prviBroj % drugiBroj;
//    }


//    public static void ispisiSamoParneBrojeve(int maxBroj) {
//        for (int i = 1; i < maxBroj; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }

//
//    public static void ispisiSamoParneBrojeve() {
//        int iterator = 1;
//        while(iterator <= 10) {
//            if (iterator % 2 == 0) {
//                System.out.println(iterator);
//            }
//            iterator++;
//        }
//    }


    public static void ispisiSamoParneBrojeve(int maxBroj) {
        for (int i = 1; i < maxBroj; i++) {
            if (i % 2 == 0 && i !=4 && i != 6) {
                System.out.println(i);
            }
        }
    }
}






