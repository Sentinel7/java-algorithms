public class Commute {

	public static void main(String[] args) {
		
		java.util.Scanner console = new java.util.Scanner(System.in);
		
		String depTime = console.nextLine();
		String[] strArray = depTime.split(":");
		
		//Turn values into integers
		int hour = Integer.parseInt(strArray[0]);
		int min = Integer.parseInt(strArray[1]);
		
		if (hour < 8 || hour > 22)
			System.out.print("0" + (hour+2) + ":" + min);
		else
			System.out.print((hour+2) + ":" + min);
	}
}
