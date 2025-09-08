package Coding_test;

import java.util.ArrayList;
import java.util.List;

public class LsngestIncreasingsubsequence {
	
	public static void main(String[] args) {
		int[] arr= {10,9,2,5,3,7,101,18};
		System.out.println("The Longest Increasing Subsequence of the given array is: "+LengthOfLIS(arr));
		
	}
	
	public static int LengthOfLIS(int[] arr) {
		List<Integer> sub =new ArrayList<Integer>();
		for(int num : arr) {
			int idx = lowerBounds(sub,num);
			if(idx==sub.size()) {
				sub.add(num);
			}
			else {
				sub.set(idx, num);
			}
		}
		return sub.size();
	}
	
	
	public static int lowerBounds(List<Integer>sub, int target) {
		int left=0,right=sub.size();
		while(left<right) {
			int mid = left+(right-left)/2;
			
			if(sub.get(mid)<target) {
				left=mid+1;
			}
			else {
				right=mid;
			}
		}
		return left;
	}
}












