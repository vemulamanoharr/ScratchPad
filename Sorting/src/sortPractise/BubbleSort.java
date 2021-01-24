package sortPractise;

/**
 * @author manvemula
 * For ith iteration in bubble sort, the ith sorted element will be in the correct position  
 *
 */
public class BubbleSort {
	public int [] bubbleSort (int [] inputArray) {		
		int length = inputArray.length;
		for (int i=0;i<=length-1;i++) {
			for (int j=length-1 ; j>i ; j--) {	
				if(inputArray[j-1]>inputArray[j]) {
					int temp;
					temp = inputArray[j];
					inputArray[j] = inputArray[j-1];
					inputArray[j-1] = temp;
				}
			}
		}
		return inputArray;
		
	}
}
