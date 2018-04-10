package CourseMIT;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Food f = new Food("hotdog", 5, 10);
		
		String[] names = {"hotdog", "apple"};
		int[] values = {5, 10};
		int[] calories = {100, 20};
		ArrayList<Food> m = buildMenu(names, values, calories);
		
		System.out.println(f);
	}
	
	public static ArrayList<Food> buildMenu(String[] names, int[] values, int[] calories) {
		
		ArrayList<Food> menu = new ArrayList<>();
		for (int i=0; i < names.length; i++) {
			menu.add(new Food(names[i], values[i], calories[i]));
		}
		return menu;
	}
	
}
