package com.zoho.coding.secondRound;

import java.util.Arrays;
//O(n),O(n)
public class ProductExcepself {
	public static void main(String[] args) {
		int arr1[] = { 4,2,1,3 };
		int arr2[] = { 7 };
		int arr3[] = { 1, 3, 5, 4, 7 };
		int arr4[] = { 7, 5, 2, 1 };
		int arr5[] = { 8, 5, 3, 8, 2 };
		System.out.println("The product of the given array is: " + productOfArray(arr1));
		System.out.println("The product of the given array is: " + productOfArray(arr2));
		System.out.println("The product of the given array is: " + productOfArray(arr3));
		System.out.println("The product of the given array is: " + productOfArray(arr4));
		System.out.println("The product of the given array is: " + productOfArray(arr5));
	}

	private static String productOfArray(int arr[]) {
		int n = arr.length;
		if(n<2) {
			return "expected 'nums' to have 2 <= size <= 100000 but got 1";
		}
		int answer[] = new int[n];
		answer[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			answer[i] = answer[i - 1] * arr[i - 1];
		}

		int rightProduct = 1;
		for (int i = n - 1; i >= 0; i--) {
			answer[i] *= rightProduct;
			rightProduct *= arr[i];
		}
		return Arrays.toString(answer);
	}
}
