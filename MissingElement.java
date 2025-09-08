package com.zoho.coding.secondRound;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr1 = {6,0,1,4,2,3};//5
		int[] arr2 = {1,2,3,0};//4
		int[] arr3 = {1,4,0,3};//2
		int[] arr4 = {1,4,2,3};//0
		int[] arr5 = {};//0
		int[] arr6 = {0};//1
		int[] arr7 = {1};//0
		
		System.out.println("the missing element is : "+FindMissingElement(arr1));
		System.out.println("the missing element is : "+FindMissingElement(arr2));
		System.out.println("the missing element is : "+FindMissingElement(arr3));
		System.out.println("the missing element is : "+FindMissingElement(arr4));
		System.out.println("the missing element is : "+FindMissingElement(arr5));
		System.out.println("the missing element is : "+FindMissingElement(arr6));
		System.out.println("the missing element is : "+FindMissingElement(arr7));

	}

	
	private static int FindMissingElement(int arr[]) {
		int missingNumber = 0;
		int sum1=0, sum2 =0;
		int n = arr.length+1;
		
		sum1 =(n*(n-1))/2;
		for(int i=0;i<arr.length;i++) {
			sum2+=arr[i];
		}
		
		missingNumber =sum1-sum2;
		 		
		return missingNumber;
	}
}
