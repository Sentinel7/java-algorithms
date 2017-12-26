import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	
	public static void sort(int[] A) {
		
		boolean sorted = false;
		int lastUnsorted = A.length - 1;
		
		while (!sorted) {
			
			sorted = true;
			
			for (int i=0; i < lastUnsorted; i++) {
				if (A[i] > A[i+1]) {
					swap(A, i, i+1);
					sorted = false;
				}
			}
			lastUnsorted--;
		}
		
	}
	
	public static void swap(int[] array, int x, int y) {
		
		int tmp = array[x];
		array[x] = array[y];
		array[y] = tmp;
	}

	public static void main(String[] args) {
		
		int[] arr = new int[100000];
		Random rand = new Random();
		
		for (int i=0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100000);
		}
		
		long startTime = System.currentTimeMillis();
		sort(arr);
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime)/1000.0 + " seconds");
		
		//String str = Arrays.toString(arr);
		//System.out.println(str);
	}

}
