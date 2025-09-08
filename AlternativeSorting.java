package com.zoho.coding.secondRound;

import java.util.Arrays;

public class AlternativeSorting {
	public static void main(String[] args) {
		int arr1[] = { 7, 1, 10, 2, 3, 9, 4, 5, 6, 8, 11 };

		int sorted[] = sorting(arr1);
		System.out.println("Sorted Array in alternative way: " + Arrays.toString(sorted));
	}

//	tc =>O(nlogn)+O(n)=>O(nlog n), sc=O(1)
	private static int[] sorting(int arr[]) {
		Arrays.sort(arr);

		int n = arr.length, left = 0, right = n - 1;

		int maxElem = arr[n - 1] + 1;

		Arrays.toString(arr);// --> tc = O(log n)
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				arr[i] += (arr[right] % maxElem) * maxElem;
				right--;
			} 
			else {
				arr[i] += (arr[left] % maxElem) * maxElem;
				left++;
			}
		}

		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] / maxElem;
		}

		return arr;
	}

//	tc =>O(nlogn)+O(n)=>O(nlog n), sc=O(n)
//	private static int[] sorting(int arr[]) {
//		Arrays.sort(arr);
//		int n = arr.length, j = n - 1, i = 0, k = 0;
//		boolean flag = true;
//		Arrays.toString(arr);//--> tc = O(log n)
//		System.out.println(Arrays.toString(arr));
//
//		int nums[] = new int[n];//-->sc =O(n)
//		while (i <= j) {//---> tc = O(n)
//			if (flag) {
//				if (arr[i] <= arr[j]) {
//					nums[k++] = arr[j--];
//					flag = false;
//				}
//			} else {
//				nums[k++] = arr[i++];
//				flag = true;
//			}
//		}
//
//		return nums;
//	}

}