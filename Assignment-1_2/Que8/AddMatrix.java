package Que8;

class AddMatrix {
    public static void main(String args[]) {
        int[][] matrix1 = {{10, 12, 30}, {24, 55, 46}, {7, 88, 9}};
        int[][] matrix2 = {{9, 28, 7}, {36, 5, 34}, {36, 42, 11}};

        int[][] matrixSum = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\nMatrix1....");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matrix1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\nMatrix2....");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matrix2[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\nSum of the Matrix1 & Matrix2...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matrixSum[i][j]);
            }
            System.out.println("");
        }
    }
}
