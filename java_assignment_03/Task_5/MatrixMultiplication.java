package java_assignment_03.Task_5;

public class MatrixMultiplication {
    public static void main(String[] args) throws InterruptedException {
        int[][] A = { {1, 2, 3}, {4, 5, 6} };
        int[][] B = { {7, 8}, {9, 10}, {11, 12} };
        int rows = A.length, cols = B[0].length;
        int[][] C = new int[rows][cols];

        Thread[] threads = new Thread[rows];
        for (int i = 0; i < rows; i++) {
            threads[i] = new MatrixMultiplie(A, B, C, i, cols);
            threads[i].start();
        }
        for (int i = 0; i < rows; i++) {
            threads[i].join();
        }
        System.out.println("Result Matrix:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
class MatrixMultiplie extends Thread {
    private int[][] A, B, C;
    private int row, cols;

    public MatrixMultiplie(int[][] A, int[][] B, int[][] C, int row, int cols) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
        this.cols = cols;
    }

    public void run() {
        for (int j = 0; j < cols; j++) {
            C[row][j] = 0;
            for (int k = 0; k < A[0].length; k++) {
                C[row][j] += A[row][k] * B[k][j];
            }
        }
    }
}