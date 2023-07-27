package arrays.multi_dimension_arrays;

import java.util.Scanner;

public class transpose_inplace_matrix {
    static void transpose(int[][] matrix, int r, int c) {

    }

    public static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of 1st matrix ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int total_elements = r * c;
        System.out.println("Enter matrix values ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix is :");
        printmatrix(a);
        System.out.println("transpose of a matrix is :");
        transpose(a, r, c);
        printmatrix(a);
    }
}
