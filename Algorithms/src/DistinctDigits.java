import java.util.Scanner;

public class DistinctDigits {
	
	public static boolean isDistinct(int Y) {
		
		String temp = Integer.toString(Y);  
		int[] arr = new int[temp.length()];
		
		for (int i=0; i < temp.length(); i++) {
			arr[i] = temp.charAt(i);   //Convert year into array of digits
		}
		
		for (int i=0; i < arr.length; i++) {
			for (int j=i+1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int year = console.nextInt();
		int max = Integer.MAX_VALUE;
		
		for (int i=year+1; i < max; i++) {
			if (isDistinct(i)) {
				System.out.println(i);
				break;
			}
		}
	}

}
