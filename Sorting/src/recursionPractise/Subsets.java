package recursionPractise;

/**
 * @author manvemula
 * No. of subsets in a set of elements N. 
 * Example: {a,b,c} => {},{a}.{b},{c},{ac},{ab},{bc},{abc} 
 * 2^N => Base is 2 because for each element we have two choices (Include/Exclude)
 *
 */
public class Subsets {
	
	public static int noOfSubsets(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return 2 * noOfSubsets(n-1);
		}
	}

	public static void main(String[] args) {
		Subsets ss = new Subsets();
		System.out.println(ss.noOfSubsets(5));

	}

}
