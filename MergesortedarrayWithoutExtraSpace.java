package com.zoho.coding.secondRound;

import java.util.Arrays;

public class MergesortedarrayWithoutExtraSpace {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7, 0, 0, 0, 0 };
		int arr2[] = { 2, 4, 6, 8 };
		int m = 4, n = 4;

		int arr3[] = { 2, 6, 15, 20, 23, 67, 90, 0, 0, 0, 0, 0, 0, 0, 0 };
		int arr4[] = { 1, 3, 4, 5, 7, 10, 12, 14 };
		int p = 7, q = 8;

		merge(arr1, n, arr2, m);
		System.out.println("Merged In-place Array: " + Arrays.toString(arr1));

		merge(arr3, p, arr4, q);
		System.out.println("Merged In-place Array: " + Arrays.toString(arr3));
	}

	private static void merge(int[] arr1, int m, int[] arr2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = n + m - 1;

		while (i >= 0 && j >= 0) {

			if (arr1[i] > arr2[j]) {
				arr1[k--] = arr1[i--];
			} else {
				arr1[k--] = arr2[j--];
			}
		}
		while (j >= 0) {
			arr1[k--] = arr2[j--];
		}
	}
}
