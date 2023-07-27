package arrays.multi_dimension_arrays;

import java.util.Scanner;

public class matrix_multi {

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("multiplication not possible dur to wrong dimension input");
            return;
        }
        int[][] mul = new int[r1][c2];// here answer is stored

        for (int i = 0; i < r1; i++)// row
        {
            for (int j = 0; j < c2; j++)// column
            {
                for (int k = 0; k < c1; k++)// this loop perform addition of array (a and b)
                // adition occurs c1 or r2 times bcoz r2=c1 hence k<c1 or k<r2
                {
                    mul[i][j] = mul[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }
        printmatrix(mul);
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
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter matrix values ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        printmatrix(a);
        System.out.println("Enter number of rows and columns of 2nd matrix ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter matrix values ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        printmatrix(b);
        multiply(a, r1, c1, b, r2, c2);

    }
}
