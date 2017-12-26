
public class SortInsertion {

	public static void main(String[] args) {
		
		int N = 100000000;
		int[] L = new int[N];
		
		for (int i=0; i < N; i++) {
			L[i] = (int) Math.random()*1000;
		}
		
		long startTime = System.currentTimeMillis();
		
		for (int i=1; i < L.length; i++) {
		    for (int j=i-1; j > 0; j--) {
		    	
		    	if (L[j+1] < L[j]) {
		    		int t = L[j];
		            L[j] = L[j+1];
		            L[j+1] = t;
		    	}
		        else
		            break;
		    }   
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("That took " + (endTime - startTime)/1000.0 + " seconds");
		
	}

}
