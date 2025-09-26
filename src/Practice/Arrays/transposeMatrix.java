package Practice.Arrays;

import java.util.Arrays;

public class transposeMatrix {
    //https://leetcode.com/problems/transpose-matrix/
    public static void main(String[] args) {
       int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Fix the output logic
        int[][] transposedMatrix = transpose(matrix);
        
        // Print the transposed matrix
        for (int[] row : transposedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Fixed transpose function
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows]; // Create new transposed matrix

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transposed[col][row] = matrix[row][col];
            }
        }
        return transposed;
    }
}
