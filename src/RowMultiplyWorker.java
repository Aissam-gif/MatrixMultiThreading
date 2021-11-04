
public class RowMultiplyWorker implements Runnable {
	private int[][] result;
	private int[][] matrix1;
	private int[][] matrix2;
	private final int row;
	
	public RowMultiplyWorker(int[][] result, int[][] matrix1, int[][] matrix2, int row) {
		this.result = result;
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.row = row;
	}
	
	@Override
	public void run() {
		for (int j=0; j<matrix2[0].length; j++) {
			result[row][j] = 0;
			for (int k=0; k<matrix1[row].length; k++) {
				result[row][j] += matrix1[row][k] * matrix2[k][j];
			}
		}
	}
	
	
}
