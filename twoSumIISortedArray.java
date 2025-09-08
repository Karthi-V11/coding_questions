package com.zoho.coding.secondRound;

import java.util.Arrays;

public class twoSumIISortedArray {

	public static void main(String[] args) {
		int arr1[] = { 4, 2, 1, 3 };
		int arr2[] = { 1, 2 };
		int arr3[] = { -4, -1, 0, 2, 5, 8 };
		int arr4[] = { 1, 1, 2, 3, 4 };
		int arr5[] = { -10, -8, -5, -3, -1 };
		int arr6[] = { 1, 2, 3, 4, 5 };
		System.out.println("Result for arr1: " + Arrays.toString(twoSum(arr1, 5)));
		System.out.println("Result for arr2: " + Arrays.toString(twoSum(arr2, 3)));
		System.out.println("Result for arr3: " + Arrays.toString(twoSum(arr3, 4)));
		System.out.println("Result for arr4: " + Arrays.toString(twoSum(arr4, 2)));
		System.out.println("Result for arr5: " + Arrays.toString(twoSum(arr5, -8)));
		System.out.println("Result for arr6: " + Arrays.toString(twoSum(arr6, 100)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int ans[] = new int[2];
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == target) {
				ans[0] = left + 1;
				ans[1] = right + 1;
//				return new int[] { left + 1, right + 1 };
				return ans;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
//        return new int[0];
		return ans;
	}

}
