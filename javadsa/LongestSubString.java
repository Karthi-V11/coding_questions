package Expected_programs;

//using two pointer and sliding window and hash array tc- o(N) sc-o(256)
public class LongestSubString {
	public static void main(String[] args) {
		String str= "cabdzabcd";
		System.out.println("the longest substring without repeating character : "+ withoutRepeatingChar(str));
	}
	
	static int withoutRepeatingChar(String str){
		
		int[] hash = new int[256];
		
		int l=0, r=0, n=str.length();
		int maxlen=0;
		
		while(r<n) {
			if(hash[str.charAt(r)]!=0 && hash[str.charAt(r)]>l) {
				l=hash[str.charAt(r)];
			}
			int len=r-l+1;
			maxlen=Math.max(maxlen, len);
			hash[str.charAt(r)]=r+1;
			r++;
		}
		return maxlen;
	}
}

















// tc-o(n^2)  sc-o(256)
//public class LongestSubString {
//	public static void main(String[] args) {
//		String str= "cabdzabcd";
//		System.out.println("the longest substring without repeating character : "+ withoutRepeatingChar(str));
//	}
//	
//	static int withoutRepeatingChar(String str){
//		int n=str.length();
//		int len=0, maxlen=0;
//		
//		for(int i=0;i<n;i++) {
//			int[] hash=new int[255];
//
//			for(int j=i;j<n;j++) {
//				if(hash[str.charAt(j)]==1) break;
//				len=j-i+1;
//				maxlen=Math.max(maxlen, len);
//				hash[str.charAt(j)]=1;
//			}
//		}
//		return maxlenc
//	}
//}
