package sortPractise;

import java.util.ArrayList;
import java.util.List;

public class MergeSortList {
	public static List<Integer> merge_sort(List<Integer> arr) {
		mergeSortHelper(arr,0,arr.size()-1);
		return arr;
	}
	public static void mergeSortHelper(List<Integer> arr,int start,int end){
		if (start>=end){
			return;
		}
		else{
			int mid = start + (end-start)/2;

			mergeSortHelper(arr,start,mid);
			mergeSortHelper(arr,mid+1,end);

			//merge logic:
			List<Integer> aux = new ArrayList <Integer>();
			int i = start;
			int j = mid+1;

			while(i<=mid && j<=end){
				if(arr.get(i) <= arr.get(j)){
					aux.add(arr.get(i));
					i++;
				}
				else{
					aux.add(arr.get(j));
					j++;
				}

			}
			while(i<=mid){
				aux.add(arr.get(i));
				i++;
			}
			while(j<=end){
				aux.add(arr.get(j));
				j++;
			}
			for(int t = start; t<=end;t++){
				arr.set(t, aux.get(t-start));
			}    
		}
	}

}