package sortPractise;

public class MergeSort {
	
	
	public int [] mergeSort (int [] inputArray) {
		mergeSortHelper (inputArray,0,inputArray.length-1);
		return inputArray;

	}

	private void mergeSortHelper(int[] inputArray, int start, int end) {
		if (start >= end) {
			return;
		}
		else {
			int mid = start + (end-start)/2;  //To avoid integer overflow
			
			mergeSortHelper(inputArray,start,mid);
			mergeSortHelper(inputArray, mid+1, end);
			
			merge(inputArray,start,mid,end);
		}

}

	private void merge(int[] inputArray, int start, int mid, int end) {

		//merge logic
		int i = start;
		int j = mid+1;
		
		int [] auxArray = new int [end+1];
		int auxIndex =0;
		
		while (i<=mid && j<=end) {
			if (inputArray[i] <= inputArray[j]) {
				auxArray[auxIndex] = inputArray[i];
				i++;
				auxIndex++;
			}
			else {
				auxArray[auxIndex] = inputArray[j];
				j++;
				auxIndex++;		
			}
		}
		while(i<=mid) {
			auxArray[auxIndex] = inputArray[i];
			i++;
			auxIndex++;
		}
		while(j<=end) {
			auxArray[auxIndex] = inputArray[j];
			j++;
			auxIndex++;	
		}
		for(int t=start;t<=end;t++) {
			inputArray[t] = auxArray[t-start];
		}
		
		
	}
}

