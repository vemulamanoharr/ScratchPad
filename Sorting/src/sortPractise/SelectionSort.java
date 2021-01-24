package sortPractise;

public class SelectionSort {

	public int [] selectionSort (int [] inputArray) {		
		int length = inputArray.length;
		for (int i=0;i<=length-1;i++) {
			for(int j=i+1;j<=length-1;j++) {
				if(inputArray[i]>inputArray[j]) {
					int temp;
					temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;
				}
			}
		}
		return inputArray;
		
	}

}
