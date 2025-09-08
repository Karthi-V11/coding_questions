package com.zoho.coding.secondRound;

public class MajorityElementNBy2 {
	public static void main(String[] args) {
		int arr1[] = { 2, 2, 1, 1, 1, 2, 2 };
		int arr2[] = { 3, 3, 4 };
		int arr3[] = { 6, 5, 5, 6, 6, 6, 6, 6, 5, 6, 6, 5, 5, 6, 5, 5, 5, 6 };
		int arr4[] = { 7 };
		int arr5[] = { 1, 2, 3, 2, 2 };
		System.out.println("The element in the array\n" + "that appears more than [array length /2] is : "
				+ majorityElement(arr1) + "\n");
		System.out.println("The element in the array\n" + "that appears more than [array length /2] is : "
				+ majorityElement(arr2) + "\n");
		System.out.println("The element in the array\n" + "that appears more than [array length /2] is : "
				+ majorityElement(arr3) + "\n");
		System.out.println("The element in the array\n" + "that appears more than [array length /2] is : "
				+ majorityElement(arr4) + "\n");
		System.out.println("The element in the array\n" + "that appears more than [array length /2] is : "
				+ majorityElement(arr5) + "\n");
	}

	private static int majorityElement(int arr[]) {

		int count = 0;
		int element = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (count == 0) {
				count = 1;
				element = arr[i];
			} else if (element == arr[i]) {
				count++;
			} else {
				count--;
			}
		}
		int count1 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == element) {
				count1++;
			}
		}
		return(count1 >n/2)?element:-1;
	}

//	sc=O(n);
	// public int majorityElement(int[] nums) {
	// int ele = nums[0];
	// int n = nums.length;

	// Map<Integer, Integer> map = new HashMap<>();
	// for (int i = 0; i < n; i++) {
	// map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	// }
	// for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	// if (entry.getValue() > n / 2) {
	// return entry.getKey();
	// }
	// }
	// return -1;
	// }

}
