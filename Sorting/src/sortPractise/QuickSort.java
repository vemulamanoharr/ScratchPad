package sortPractise;
import java.lang.Math;  
public class QuickSort {
	
	public void quickSort(int [] a) {
		quickSortHelper(a,0,a.length-1);
	}

	private void quickSortHelper(int[] a, int start, int end) {
		if(start >= end) {
			return;
		}
		else {
			int randomPivot = random(start, end);
			Swap.swapTwo(a, randomPivot, start);
			int pivot = a[start];
			int smaller = start;
			//divide the array so that pivot element is in right index
			for(int bigger=start+1;bigger<=end;bigger++) {
				if(a[bigger]<pivot) {
					smaller ++;
					Swap.swapTwo(a, bigger, smaller);
				}
			}
			Swap.swapTwo(a, smaller, start);
			quickSortHelper(a,0,smaller-1);
			quickSortHelper(a, smaller+1, end);
		}
		
	}
	
	private int random(int start, int end) {
		int range = (end-start) + 1;
		return (int) Math.random()*range + start;
	}

}
