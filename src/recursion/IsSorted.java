package recursion;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,50,60,300};
		System.out.println(isSorted(arr, 0));
	}
	
	public static Boolean isSorted(int[] arr, int si) {
		
		if(si == arr.length - 1)
			return true;
		
		if(arr[si] > arr[si + 1]) {
			return false;
		}else {
			Boolean flag = isSorted(arr, si + 1);
			return flag;
		}
	}

}
