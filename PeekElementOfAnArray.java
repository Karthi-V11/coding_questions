package com.zoho.coding.secondRound;

public class PeekElementOfAnArray {
	public static void main(String[] args) {
		int arr1[] = { 10, 15, 20, 2, 23, 90, 67 };
		int arr2[] = { 7 };
		int arr3[] = { 1, 3, 5, 4, 7, 10 };
		int arr4[] = { 7, 5, 2, 1 };
		int arr5[] = { 18, 5, 3, 8, 28 };
		System.out.println("The peek element in the given array is: " + findPeek(arr1));
		System.out.println("The peek element in the given array is: " + findPeek(arr2));
		System.out.println("The peek element in the given array is: " + findPeek(arr3));
		System.out.println("The peek element in the given array is: " + findPeek(arr4));
		System.out.println("The peek element in the given array is: " + findPeek(arr5));
	}

	private static int findPeek(int[] arr) {
		int n = arr.length;
		if (n == 1)
			return 0;
		if (arr[0] > arr[1])
			return arr[0];
		if (arr[n - 1] > arr[n - 2])
			return arr[n - 1];
		int low = 1;
		int high = n - 2;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
				return arr[mid];
			if (arr[mid] > arr[mid - 1])
				low = mid + 1;
			else
				high = mid - 1;
		}

		return -1;
	}
}
