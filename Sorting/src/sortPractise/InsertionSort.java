package sortPractise;

public class InsertionSort {
	public int [] insertionSort1 (int [] inputArray) {		
		insertionSort1Helper(inputArray,inputArray.length-1);
		return inputArray;

	}

	// Recursive version with multiple swaps
	private int [] insertionSort1Helper(int[] inputArray, int length) {
		if(length <=0) {

		}
		else {
			insertionSort1Helper(inputArray , length-1);
			int j=length-1;
			while (j>=0 && inputArray[j]>inputArray[j+1]) {
				int temp;
				temp = inputArray[j];
				inputArray[j] = inputArray[j+1];
				inputArray[j+1] = temp;
				j=j-1;
			}

		}
		return inputArray;
	}
	//ToDo: Recursive without swap
	//ToDo: Iterative version
}

