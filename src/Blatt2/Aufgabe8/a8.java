package Blatt2.Aufgabe8;

public class a8 {

    private static double[][] myMatrixRandom(int cols, int rows) {
        double[][] matrix = new double[cols][rows];
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                matrix[i][j] = Math.random();
            }
        }
        return matrix;
    }

    private static void myMatrixPrint(double[][] m) {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("\n");
        }
    }

    private static void myMatrixSwapRows(int a, int b, double[][] m) {
        double[] buf = new double[m[0].length];
        for(int i = 0; i < m[0].length; i++) {
            buf[i] = m[a][i];
            m[a][i] = m[b][i];
            m[b][i] = buf[i];
        }
    }

    public static void main(String[] args) {
        double[][] m = myMatrixRandom(3 , 3);
        myMatrixPrint(m);
        myMatrixSwapRows(1, 2, m);
        myMatrixPrint(m);
    }
}
