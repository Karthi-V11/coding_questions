package com.zoho.coding.secondRound;

public class shifting {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int nums[] = { 2, 4, 6, 8, 10, 12, 14 };

		leftShift(arr,4);
		System.out.println("after the left shift: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		rightShift(nums,4);
		System.out.println("after the right shift: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

//	shift by d places
	public static void leftShift(int arr[],int d) {
		int n=arr.length;
		d=d%n;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}

	public static void rightShift(int nums[],int d) {
		int n=nums.length;
		d=d%n;
		reverse(nums,n-d,n-1);
		reverse(nums,0,n-d-1);
		reverse(nums,0,n-1);
	}
	
	public static void reverse(int array[],int start,int end) {
		while(start<end) {
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
	}
	
	
	
	
	
	
	
	
	
	
//	shift by one place
//	public static void leftShift(int arr[]) {
//		int first = arr[0];
//		for (int i = 0; i < arr.length - 1; i++) {
//			arr[i] = arr[i + 1];
//		}
//		arr[arr.length - 1] = first;
//	}
//
//	public static void rightShift(int nums[]) {
//		int last = nums[nums.length - 1];
//		for (int i = nums.length - 1; i > 0; i--) {
//			nums[i] = nums[i - 1];
//		}
//		nums[0] = last;
//	}
}
