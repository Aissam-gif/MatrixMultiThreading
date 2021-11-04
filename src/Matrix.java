import java.util.Random;

public class Matrix {
	
	public static int[][] generateMatrix(int rows, int cols){
		int[][] matrix = new int[rows][cols];
		Random random = new Random();
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				matrix[i][j] = random.nextInt(200);
			}
		}
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] multiplyMatrix(int[][] m1, int[][] m2){
		
		
		if (m1[0].length == m2.length) {
		int rows = m1.length;
		int columns = m2[0].length;
		int common = m2.length;
		int coeff = 0;
		int[][] resultMatrix = new int[rows][columns];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				for (int k=0; k<common; k++) {
					coeff += m1[i][k] * m2[k][j];
				}
				resultMatrix[i][j] = coeff;
				coeff = 0;
			}
		}
		return resultMatrix;
		}
		return null;
	}
}
