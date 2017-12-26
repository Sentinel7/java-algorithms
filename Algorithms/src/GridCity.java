import java.util.*;

public class GridCity {

	public static boolean isPossible(int startX, int startY, int endX, int endY, int charge) {
		
		int sumOfStops = 0;
		int sumX, sumY = 0;
		
		if (startX >= endX) {
			sumX = startX - endX;
		}
		else sumX = endX - startX;
		
		if (startY >= endY) {
			sumY = startY - endY;
		}
		else sumY = endY - startY;
		
		sumOfStops = sumX + sumY;
		
		if ((charge >= sumOfStops) && (charge - sumOfStops)%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int startX = scanner.nextInt();
		int startY = scanner.nextInt();
		int endX = scanner.nextInt();
		int endY = scanner.nextInt();
		int charge = scanner.nextInt();
		
		if (isPossible(startX, startY, endX, endY, charge)) {
			System.out.println("Y");
		}
		else
			System.out.println("N");
	}
	
}
