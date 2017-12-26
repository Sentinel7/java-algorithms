import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PartyInvitation {
	
	public static void remove() {
		
		Scanner console = new Scanner(System.in);
		
		int numFriends = console.nextInt();
		int rounds = console.nextInt(); 
		List<Integer> friendList = new ArrayList<Integer>();
		
		for (int i=1; i <= numFriends; i++) {
			friendList.add(i);
		}
		
		for (int i=0; i < rounds; i++) {
			int r = console.nextInt();
			int j = friendList.size()/r;
		
			while (r*j > 0) {
				friendList.remove(r*j-1);
				j--;
			}
		}
		
		System.out.println(friendList);
		
		console.close();
	}

	public static void main(String[] args) {
		
		remove();
	}

}
