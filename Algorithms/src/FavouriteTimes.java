import java.text.SimpleDateFormat;
import java.util.*;

public class FavouriteTimes {

	public static String[] timeArr(int mins) throws Exception {
		
		String[] array = new String[mins];
		String startTime = "12:00";
		SimpleDateFormat df = new SimpleDateFormat("hh:mm");
		Calendar cal = Calendar.getInstance();
		Date date = df.parse(startTime); 
		
		for (int i=0; i < mins; i++) {

			cal.setTime(date);
			cal.add(Calendar.MINUTE, i);
			String newTime = df.format(cal.getTime());
			
			array[i] = newTime;
		}
		
		return array;
	}
	
	public static boolean isSequence(String s) throws Exception {
		
		char[] digits = s.toCharArray();
		
		if(digits[0] != '0') {
			if(digits[1] - digits[0] == digits[3] - digits[1] && digits[3] - digits[1] == digits[4] - digits[3])
				return true;
		}
		
		if(digits[0] == '0') {
			if(digits[3] - digits[1] == digits[4] - digits[3])
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt() + 1;
		
		int counter = 0;
		
		int minutes2 = minutes;
		String[] times = null;
		
		if (minutes > 720) {
			minutes2 = 720;	
		}
		
		times = timeArr(minutes2);
				
		for (int i=0; i < minutes2; i++) {
			
			if (isSequence(times[i])) {
				counter++;
			}
		}
		
		if (minutes > 720) {
			counter = counter * (minutes / 720);
			int m = minutes % 720;
			
			for (int i=0; i < m; i++) {
				
				if (isSequence(times[i])) {
					counter++;
				}
			}
		}
		
		System.out.println(counter);
	}
	
}
