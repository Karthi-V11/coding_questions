package com.zoho.coding.secondRound;

public class ThirdLargestElement {
	public static void main(String[] args) {

		int arr1[] = { 4, 6, 5, 1, 2 };
		int arr2[] = {};
		int arr3[] = { 5, 5, 5, 5 };
		int arr4[] = { 6, 4, 6, 4 };
		int arr5[] = { -1, -3, -2, -10, 10 };
		int arr6[] = { -7, -7, -7, -7, -7 };
		System.out.println("Third Largest element in given array: " + findThirdLargestElement(arr1));
		System.out.println("Third Largest element in given array: " + findThirdLargestElement(arr2));
		System.out.println("Third Largest element in given array: " + findThirdLargestElement(arr3));
		System.out.println("Third Largest element in given array: " + findThirdLargestElement(arr4));
		System.out.println("Third Largest element in given array: " + findThirdLargestElement(arr5));
		System.out.println("Third Largest element in given array: " + findThirdLargestElement(arr6));

	}

	private static int findThirdLargestElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		if (arr.length < 3) {
			return -1;
		}

		for (int num : arr) {

			if (num > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = num;
			} 
			else if (num > secondMax && num != max) {
				thirdMax = secondMax;
				secondMax = num;
			} 
			else if (num > thirdMax && num != secondMax && num != max) {
				thirdMax = num;
			}
		}
		
		if (thirdMax == Integer.MIN_VALUE  ) {
			thirdMax = secondMax;
			return thirdMax;
		}

		return thirdMax;
	}
}
