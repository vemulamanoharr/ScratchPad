package recursionPractise;

public class Fibonacci {
	
	public static int fib(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		else {
			return  fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		System.out.println(fb.fib(7));

	}

}