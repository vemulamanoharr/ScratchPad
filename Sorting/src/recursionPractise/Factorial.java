package recursionPractise;

public class Factorial {
	
	public static int factorial(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.factorial(5));

	}

}
