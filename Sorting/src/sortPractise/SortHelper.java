package sortPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortHelper {

	public static void main(String[] args) {
//		List <Integer> a = Arrays.asList(6,3,1,8,2,0,17,5);		
//		MergeSortList ss = new MergeSortList();
//		List <Integer> b = ss.merge_sort(a);
		
		
		int [] arr = new int [] {6,3,1,8,2,0,17,5};
		QuickSort qs = new QuickSort();
		qs.quickSort(arr);
		for(int i= 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
