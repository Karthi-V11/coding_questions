package com.zoho.coding.secondRound;

public class FirstAndLastOccurence {

	public static void main(String[] args) {
		int arr1[] = {1, 7, 8, 8, 12, 13, 13, 13, 13, 16, 17, 18, 23, 25, 34, 40};

		int occurrence[] = searchRange(arr1,13);
		System.out.println("first and last occurence potition of a given array is: ");
		for (int i = 0; i < occurrence.length; i++) {
			System.out.println(occurrence[i]+" ");
		}
	}

	 public static int[] searchRange(int[] nums, int target) {
	        int[] arr={-1,-1};

	        arr[0]=findPlace(nums,target,true); // find first Occurence of a target
	        arr[1]=findPlace(nums,target,false); // find last Occurence of a target

	        return arr;
	    }
	private static int findPlace(int arr[],int target,boolean firstOccurence) {
		
		int left=0;
		int right = arr.length-1;
		int index =-1;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(arr[mid] == target ) {
				index = mid; 
				if(firstOccurence) {
					right= mid-1;
				}
				else {
					left=mid+1;
				}
			}
			else if(arr[mid]<target) {
				left=mid+1;
				
			}
			else {
				right=mid-1;
			}
		}
		
		return index;
	}
}
