import java.util.Scanner;

public class DoubleDice {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int n = console.nextInt();
		int aPoints = 100;
		int dPoints = 100;
		
		int[] aRolls = new int[n];
		int[] dRolls = new int[n];
		
		for (int i=0; i < n; i++) {
			aRolls[i] = console.nextInt();
			dRolls[i] = console.nextInt();
			
			if (aRolls[i] > dRolls[i])
				dPoints -= aRolls[i];
			else if (dRolls[i] > aRolls[i])
				aPoints -= dRolls[i];
		}
		
		System.out.println(aPoints);
		System.out.println(dPoints);
		
	}

}
