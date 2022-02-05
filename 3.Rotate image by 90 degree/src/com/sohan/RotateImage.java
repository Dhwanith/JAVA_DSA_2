package com.sohan;

import java.io.IOException;
import java.util.Scanner;

public class RotateImage {
    // public void transposeMatrix (int [] ) []
    public void rotateImage(int[][] matrix) {
        // initialise the length of the matrix to a variable
        int N = matrix.length;
        for (int i =0 ;  i < N; i++){
            for (int j = i; j < N; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // swap the row and col value [i] [j] = [j] [i]
        // iterate for each row
        for (int i = 0 ; i < N; i++){
            for (int j = 0; j < N/2 ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i] [N - 1 - j];
                matrix[i][N - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; ++i) {
            for (int j = 0; j < matrixSize; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        new RotateImage().rotateImage(matrix);
        for (int i = 0; i < matrixSize; ++i) {
            for (int j = 0; j < matrixSize; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
