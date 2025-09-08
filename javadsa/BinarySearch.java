//tc ->O(log n) and sc=O(1) for iterative..
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,5,7,9,10,34,67,78,90};
		int index = Search(34 ,arr);
		if(index!=-1) {
			System.out.println("Element found at the index of: "+index);
		}
		else {
			System.out.println("The Element is not found.");
		}
	}
	
	static int Search(int n,int[]arr) {
		int left = 0;
		int right =arr.length-1;
		
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(arr[mid]==n)return mid;
			else if(arr[mid]<n) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}
}
