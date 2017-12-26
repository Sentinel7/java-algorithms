
public class Factorial {

	/*
	static int fact(int n) {
		int prod = 1;
		for(int i=1; i<=n; i++)
			prod *= i;
		return prod;
	}*/
	
	static int fact(int n) {
		if(n==1)
			return 1;
		else
			return fact(n-1)*n;
	}
	
	
	public static void main(String[] args) {
		//System.out.println(fact(5));
		System.out.println(fact(5));
	}

}
