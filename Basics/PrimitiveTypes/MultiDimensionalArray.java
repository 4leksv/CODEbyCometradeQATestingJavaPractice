package PrimitiveTypes;

public class MultiDimensionalArray {
    private static int red = 2;
    private static int kolona = 5;

    static int[][] dvodimenzionalnaTabela = new int[red][kolona];
    static int[][] novaTabela = {{1, 2}, {3, 4}, {5, 6}};

    public static void main(String[] args) {


        dvodimenzionalnaTabela[0][0] = 10;
        dvodimenzionalnaTabela[0][1] = 20;
        dvodimenzionalnaTabela[0][2] = 30;
        dvodimenzionalnaTabela[0][3] = 40;
        dvodimenzionalnaTabela[0][4] = 50;
        dvodimenzionalnaTabela[1][0] = 11;
        dvodimenzionalnaTabela[1][1] = 21;
        dvodimenzionalnaTabela[1][2] = 31;
        dvodimenzionalnaTabela[1][3] = 41;
        dvodimenzionalnaTabela[1][4] = 51;

        for(int i = 0; i < red; i++) {
            for(int j = 0; j < kolona; j++ ) {
                System.out.println(dvodimenzionalnaTabela[i][j]);

            }
        }

    }
}
