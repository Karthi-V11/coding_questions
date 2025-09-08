package com.zoho.coding.secondRound;

import java.util.ArrayList;
import java.util.List;

public class ReturnAllPeakElements {
	public static void main(String[] args) {
		int arr1[] = { 10, 15, 20, 2, 23, 33, 29, 90, 64, 67 };

		List<Integer> peaks = findPeek(arr1);

        System.out.println("The peak elements of the given array are:");
        for (int index : peaks) {
            System.out.println("Index: " + index + " -> Value: " + arr1[index]);
        }
	}

	private static List<Integer> findPeek(int[] arr) {
		int n = arr.length;
		List<Integer> peek = new ArrayList<>();
		if (n == 1 || arr[0] > arr[1]) {
			peek.add(0);
		}

		for(int i=1;i<n-1;i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
				peek.add(i);
		}
		
		if (arr[n - 1] > arr[n - 2]) {
			peek.add(n - 1);
		}

		
		return peek;
	}
}
