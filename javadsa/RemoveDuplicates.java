package Expected_programs;

//import java.util.HashSet;
//import java.util.Set;


public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,3,3,4,4};
        int k = removeDuplicatesFromArray(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
	}
	
	public static int removeDuplicatesFromArray(int[] arr) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!= arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
	}
}



 













// tc-o(n^2) sc-o(n)
//public class RemoveDuplicates {
//	
//	public static void main(String[] args) {
//		int[] arr = {1,1,2,4,2,3,5,3,2};
//        int k = removeDuplicatesFromArray(arr);
//        System.out.println("The array after removing duplicate elements is ");
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
//        }
//	}
//	
//	public static int removeDuplicatesFromArray(int[] nums) {
//		
//		Set<Integer> set = new HashSet<>();
//		for(int i=0;i<nums.length;i++) {
//			set.add(nums[i]);
//		}
//		int k = set.size();
//		int j=0;
//		for(int x:set) {
//			nums[j++]=x;
//		}
//		return k;
//	}
//}
