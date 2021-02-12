package recursionPractise;


/**
 * @author manvemula
 * No of combinations implies Repetitions are not allowed and order is not important 
 * Base case if k=0 or k=n return 1;
 */
public class Combinations {
	
	public static int noOfCombinations(int n , int k) {
		if (k==0 || k==n) {
			return 1;
		}
		else {
			return noOfCombinations(n-1,k-1) + noOfCombinations(n-1,k);
		}
	}

	public static void main(String[] args) {
		System.out.println(Combinations.noOfCombinations(10,8));

	}

}

