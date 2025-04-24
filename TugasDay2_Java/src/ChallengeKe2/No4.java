package ChallengeKe2;

public class No4 {
    public static void main(String[] args) {
        System.out.println("\nMatrix Soal 4:");
        int[][] diagonalMatrix4 = matrixDiagonal4(8); // Ukuran 7x7 (N=6)
        displayMatrix(diagonalMatrix4);
    }


    public static int[][] matrixDiagonal4(int n) {
        int[][] matrix = new int[n][n];
        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < n - 1; col++) {
                matrix[row][col] = row + col;
                matrix[row][n-1] += matrix[row][col];
                matrix[n-1][row] += matrix[row][col];
            }
        }

//        matrix[n-1][n-1] = matrix[n-2][n-1]*2;
        for (int i = 0; i < n - 1; i++) {
            matrix[n-1][n-1] += matrix[n-1][i];
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

