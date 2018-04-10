
public class Food {

	private String name;
	private int value;
	private int weight;
	
	public Food(String n, int v, int w) {
		this.name = n;
		this.value = v;
		this.weight = w;
	}

	public int getValue() {
		return this.value;
	}

	public int getWeight() {
		return this.weight;
	}
	
	public double density() {
		return 1.0 * value / weight;
	}
	
	public String toString() {
		return "(" + name + ", " + value + ", " + weight + ")";
	}
	
}
