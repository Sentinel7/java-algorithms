import java.util.Scanner;

public class AssigningPartners {
	
	public static boolean checkOne(String[] A1, String[] A2) {
		
		if (A1.length != A2.length) {
			return false;
		}
		
		for (int i=0; i < A1.length; i++) {
			
			int t = 0;
			
			for (int j=0; j < A2.length; j++) {
				if (A1[i].equals(A2[j]))
					t++;
			}
			if (t != 1) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean checkTwo(String[] A1, String[] A2) {
		
		for (int i=0; i < A1.length; i++) {
			 
			for (int j=0; j < A2.length; j++) {
				if (A1[i].equals(A2[j])) { //found A1[i] at A2[j]
					//Go to A1[j] and see if it equals A2[i]
					if (!A1[j].equals(A2[i]))
						return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int numStudents = console.nextInt();
		String[] A1 = new String[numStudents];
		String[] A2 = new String[numStudents];
		
		for (int i=0; i < numStudents; i++) {
			A1[i] = console.next();
		}
		for (int i=0; i < numStudents; i++) {
			A2[i] = console.next();
		}
		
		if ((checkOne(A1, A2) == false) || (checkOne(A2, A1) == false) || (checkTwo(A1, A2) == false)) {
			System.out.println("bad");
			return;
		}
		
		System.out.println("good");
	}

}
