package com.zoho.coding.secondRound;

public class IsReachEndByJump {

	public static void main(String[] args) {
		int arr1[] = { 2, 3, 1, 1, 4 };
		int arr2[] = { 7 };
		int arr3[] = { 3, 2, 1, 0, 4 };
		int arr4[] = { 0, 0, 2, 3 };
		int arr5[] = { 3, 0, 0, 0, 0 };
		System.out.println("The array can reach the end by its maximum jump:  " + CanJump(arr1));
		System.out.println("The array can reach the end by its maximum jump:  " + CanJump(arr2));
		System.out.println("The array can reach the end by its maximum jump:  " + CanJump(arr3));
		System.out.println("The array can reach the end by its maximum jump:  " + CanJump(arr4));
		System.out.println("The array can reach the end by its maximum jump:  " + CanJump(arr5));
	}

	private static boolean CanJump(int arr[]) {

		int maxReach = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > maxReach)
				return false;
			maxReach = Math.max(maxReach, i + arr[i]);
		}
		return true;
	}
}