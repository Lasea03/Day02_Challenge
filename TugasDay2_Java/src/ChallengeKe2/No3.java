package ChallengeKe2;

public class No3 {
    public static void main(String[] args) {
// Matriks Soat 5
        System.out.println("\nMatrix Soal 3:");
        int[][] diagonalMatrix3 = matrixDiagonal3(6); // Ukuran 7x7 (N=6)
        displayMatrix(diagonalMatrix3);
    }
    public static int[][] matrixDiagonal3(int n) {
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == 0) {
                    matrix[row][col] = col;
                } else if (col == 0) {
                    matrix[row][col] = row;
                } else if (row == matrix.length - 1) {
                    matrix[row][col] = row + col;
                } else if (col == matrix[row].length - 1) {
                    matrix[row][col] = col + row;
                }
            }
        }
        return matrix;
    }


    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
