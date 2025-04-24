package ChallengeKe2;

import java.util.Random;

public class No1 {
    public static void main(String[] args) {


        // Matriks diagonal
        System.out.println("\nMatrix diagonal Soal 1:");
        int[][] diagonalMatrix = matrixDiagonal(5); // Ukuran 5x5
        displayMatrix(diagonalMatrix);

    }


    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    // Versi yang disamakan: matrixDiagonal(int n)
    public static int[][] matrixDiagonal(int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    matrix[row][col] = row + 1;
                } else if (col > row) {
                    matrix[row][col] = 10;
                } else {
                    matrix[row][col] = 20;
                }
            }
        }

        return matrix;
    }
}