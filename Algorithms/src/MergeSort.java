import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	
	public static void merge(int[] alist) {
		
		if (alist.length > 1) {
			
			int mid = alist.length/2;
			
			int[] leftHalf = Arrays.copyOfRange(alist, 0, mid);
			int[] rightHalf = Arrays.copyOfRange(alist, mid, alist.length);
			
			merge(leftHalf);
			merge(rightHalf);
			
			
			int i = 0;
			int j = 0;
			int k = 0;
			
			while ((i < leftHalf.length) && (j < rightHalf.length)) {
				
				if (leftHalf[i] < rightHalf[j]) {
					alist[k] = leftHalf[i];
					i++;
				}
				else {
					alist[k] = rightHalf[j];
					j++;
				}
				k++;
			}
			
			while (i < leftHalf.length) {
				
				alist[k] = leftHalf[i];
				i++;
				k++;
			}
			
			while (j < rightHalf.length) {
				
				alist[k] = rightHalf[j];
				j++;
				k++;
			}
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = new int[100000];
		Random rand = new Random();
		
		for (int i=0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100000);
		}
		
		long startTime = System.currentTimeMillis();
		merge(arr);
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime)/1000.0 + " seconds");
	}

}
