package com.zoho.coding.secondRound;

public class SecondLargestElement {
	public static void main(String[] args) {

		int arr1[] = { 4, 6, 5, 1, 2 };//5
		int arr2[] = {};//-1
		int arr3[] = { 5, 5, 5, 5 };//5
		int arr4[] = { 6, 4, 6, 4 };//4
		int arr5[] = { -1, -3, -2, -10, 10 };//-1
		int arr6[] = { -7, -7, -7, -7, -7 };//-7
		System.out.println("Second Largest element in given array: " + findSecondLargestElement(arr1));
		System.out.println("Second Largest element in given array: " + findSecondLargestElement(arr2));
		System.out.println("Second Largest element in given array: " + findSecondLargestElement(arr3));
		System.out.println("Second Largest element in given array: " + findSecondLargestElement(arr4));
		System.out.println("Second Largest element in given array: " + findSecondLargestElement(arr5));
		System.out.println("Second Largest element in given array: " + findSecondLargestElement(arr6));

	}

	private static int findSecondLargestElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		if(arr.length<2) {
			return -1;
		}

		for (int num :arr) {

			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num != max) {
				secondMax = num;
			}
		}
		if (secondMax == Integer.MIN_VALUE) {
			secondMax = max;
			return secondMax;
		}

		return secondMax;
	}
}
