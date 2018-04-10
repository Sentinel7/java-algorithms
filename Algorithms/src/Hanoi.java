public class Hanoi {

	static void Towers(int n, String A, String B, String C) {
		if(n==1)
			System.out.println("move from " + A + " to " + C);
		else {
			Towers(n-1,A,C,B); //recursive call
			Towers(1,A,B,C);
			Towers(n-1,C,B,A);
		}
	}
	
	public static void main(String[] args) {
		Towers(4, "A", "B", "C");
	}
}
