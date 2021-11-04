import java.util.ArrayList;
import java.util.List;

public class ParallelThreadsCreator {
	public static void multiply(int[][] matrix1, int[][] matrix2, int[][] result) {
		  List threads = new ArrayList<>();
		  
		  for (int row = 0; row < matrix1.length; row++) {
		   RowMultiplyWorker task = new RowMultiplyWorker(result, matrix1, matrix2, row);
		   Thread thread = new Thread(task);
		   thread.start();
		   threads.add(thread);
		   if (threads.size() % 10 == 0) {
		    waitForThreads(threads);
		   }
		  }
		 }
	
	private static void waitForThreads(List<Thread> threads) {
		  for (Thread thread : threads) {
		   try {
		    thread.join();
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		  }
		  threads.clear();
		 }
}
