package com.zoho.coding.secondRound;

public class FindMinSizeSubArraySum {
	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 2, 4, 3};
	    int target = 7;
	    int result = minSizeSubArraysum(target, nums);
	    System.out.println("Minimum Subarray Length = " + result);

	}

	public static int minSizeSubArraysum(int target, int[] nums) {
		int left = 0;
		int minLen = Integer.MAX_VALUE;
		int sum = 0;
		for (int right = 0; right < nums.length; right++) {
			sum += nums[right];

			while (sum >= target) {
				minLen = Math.min(minLen, right - left + 1);
				sum -= nums[left];
				left++;
			}
		}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
	}
}