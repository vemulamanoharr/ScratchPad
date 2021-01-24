package sortPractise;

public class SortHelper {

	public static void main(String[] args) {
		int [] a = new int[] {6,3,1,8,2,0,17,5};		
		BubbleSort ss = new BubbleSort();
		int [] b = ss.bubbleSort(a);
		for (int i =0 ;i<=b.length-1;i++){
			System.out.println(b[i]);
		}
	}

}
