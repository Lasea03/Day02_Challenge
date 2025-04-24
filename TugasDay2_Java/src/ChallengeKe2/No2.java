package ChallengeKe2;

public class No2 {
    public static void main(String[] args) {
// Matriks diagonal
        System.out.println("\nMatrix diagonal Soal 2:");
        int[][] diagonalMatrix2 = matrixDiagonal2(5); // Ukuran 5x5
        displayMatrix(diagonalMatrix2);
    }
    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] matrixDiagonal2(int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    matrix[row][col] = n - row; // dari 5 sampai 1
                } else if (col > row) {
                    matrix[row][col] = 10; // kanan atas diagonal
                } else {
                    matrix[row][col] = 20; // kiri bawah diagonal
                }
            }
        }

        return matrix;
    }


}
