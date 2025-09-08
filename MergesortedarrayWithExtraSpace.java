package com.zoho.coding.secondRound;

import java.util.Arrays;

public class MergesortedarrayWithExtraSpace {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7 };
		int arr2[] = { 2, 4, 6, 8 };

		int arr3[] = { 2, 6, 15, 20, 23, 67, 90, };
		int arr4[] = { 1, 3, 4, 5, 7, 10, 12, 98, 100 };

		int merged[] = merge(arr1, arr2);
		System.out.println("Merged In-place Array: " + Arrays.toString(merged));

		int merged1[] = merge(arr3, arr4);
		System.out.println("Merged In-place Array: " + Arrays.toString(merged1));
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		int m = arr1.length, n = arr2.length;
		int[] merged = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {

			if (arr1[i] <= arr2[j]) {
				merged[k++] = arr1[i++];
			} else {
				merged[k++] = arr2[j++];
			}
		}
		while (i < m) merged[k++] = arr1[i++];
		while (j < n) merged[k++] = arr2[j++];

		return merged;
	}
}
