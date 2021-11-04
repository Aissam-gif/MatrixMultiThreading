import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date start = new Date();
		
		int[][] matrix1 = Matrix.generateMatrix(2000, 2000);
		int[][] matrix2 = Matrix.generateMatrix(2000, 2000);
		
		int[][] result = Matrix.multiplyMatrix(matrix1, matrix2);
		
		System.out.println("Matrix 1 :");
	//	Matrix.printMatrix(matrix1);
		System.out.println("Matrix 2 :");
	//	Matrix.printMatrix(matrix2);
		
		System.out.println("Matrix result :");
	//	Matrix.printMatrix(result);
		
		/*
		 * Time taken in milli second :81215

Time taken in milli second :14783
		 */
		
		Date end = new Date();
		System.out.println("\nTime taken in milli second :"+
				(end.getTime() - start.getTime()));
		
		start = new Date();
		int[][] m1 = Matrix.generateMatrix(2000, 2000);
		  int[][] m2 = Matrix.generateMatrix(2000, 2000);

		  int[][] result2 = new int[m1.length][m2[0].length];
		  ParallelThreadsCreator.multiply(m1, m2, result2);
		  end = new Date();
		  System.out.println("\nTime taken in milli second :"+
					(end.getTime() - start.getTime()));
	}

}
