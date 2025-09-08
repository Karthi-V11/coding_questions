package Expected_programs;

public class LongestSubarrayAfterDeletingOneElement {
	public static void main(String[] args) {
		int[] arr = {0,1,1,1,0,1,1,0,1};
		System.out.println("The Length of Longest Subarray After "
				+ "Deleting One Element: "+LongestSubArray(arr));
	}
	
	static int LongestSubArray(int[] arr) {
		int left=0;
		int zeros=0;
		int maxlen=0;
		
		for( int right=0;right<arr.length;right++) {
			if(arr[right]==0) {
				zeros++;
			}
		
			while(zeros>1) {
				if(arr[left]==0) {
					zeros--;
				}
				left++;
			}
			maxlen = Math.max(maxlen, right-left);
		}
		return maxlen;
	}
}
