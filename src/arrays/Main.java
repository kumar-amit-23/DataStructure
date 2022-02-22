package arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {40,50,60,70,10,20,44,23,20, 20 ,20, 70, 70 , 70, 100};
		BinarySearch bs = new BinarySearch();
		BubbleSort bbs = new BubbleSort();
//		InsertionSort is = new InsertionSort();
//		SelectionSort ss = new SelectionSort();
//		LinearSearch ls = new LinearSearch();
		displayArray(arr);
		System.out.println("-------AFTER SORTING-------");
//		ss.selectionSort(arr);
//		is.insertionSort(arr);
		bbs.bubbleSort(arr);
		displayArray(arr);
		System.out.println("BINARY SEARCH");
		System.out.println(bs.binarySearch(arr, 23));
		
		System.out.println("----FINDING LOWER AND UPPER BOUND OF ARRAY----");
		LowerAndUpperBound bound = new LowerAndUpperBound();
		
		System.out.println(bound.getLowerBound(arr, 20));
		System.out.println(bound.getUpperBound(arr, 20));

	}
	
	public static void displayArray(int[] arr) {
		for( int val : arr)
			System.out.println(val);
	}

}
