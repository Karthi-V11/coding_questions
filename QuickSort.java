package com.zoho.coding.secondRound;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		System.out.println("Before sorting:");
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();

		quickSort(arr, 0, n - 1);

		System.out.println("After sorting:");
		for (int x : arr)
			System.out.print(x + " ");
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(arr, low, high);
			quickSort(arr, low, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {
			while (arr[i] <= pivot && i <= high - 1) {
				i++;
			}
			while (arr[j] > pivot && j >= low + 1) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;

		return j;
	}
}
