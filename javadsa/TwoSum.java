package leetcode;
import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int target =9;
		System.out.println("The idex of the numbers are :" + Arrays.toString(twosum(arr,target)));
	}
	
	static int[] twosum(int[]nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int[] ans = new int[2];
		for( int i=0;i<nums.length;i++) {
			int complement = target-nums[i];
			if( map.containsKey(complement)) {
				ans[0]=map.get(complement);
				ans[1]=i;
				break;
			}
			else {
				map.put(nums[i], i);
			}
		}
		return ans;
	}
	

}
