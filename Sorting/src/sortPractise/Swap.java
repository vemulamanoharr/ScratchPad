package sortPractise;

public class Swap {
	
	public static void swapTwo(int [] arr,int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
