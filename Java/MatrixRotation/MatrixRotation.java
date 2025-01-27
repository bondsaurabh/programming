package com.code.practice;

public class MatrixRotation {
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println("Original Matrix:");
        printMatrix(matrix);  // Print the original matrix
		
		rotateMatrix(matrix);
	}

	private static void rotateMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		int n = matrix.length;
		
		//first transpose the matrix
		for(int i=0; i<n; i++) {
			//if mirroring the matrix
			/*
			 * for(int j=0; j<n; j++) { //swap elements (i,j) with (j,i) int temp=
			 * matrix[i][j]; matrix[i][j] = matrix[j][i]; matrix[j][i] = temp; }
			 */
			
			// if rotating 90 degrees one step at a time
			for (int j = i + 1; j < n; j++) {
                // Swap elements (i, j) with (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
		}
		
		System.out.println("transposed matrix is ::");
		printMatrix(matrix);
		
		// Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                // Swap elements at (i, left) and (i, right)
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        
        System.out.println("Rotated matrix is ::");
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		int n = matrix.length;
		for(int i = 0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(matrix[i][j] + "");
			}
			System.out.println();
		}
		
	}		

}
