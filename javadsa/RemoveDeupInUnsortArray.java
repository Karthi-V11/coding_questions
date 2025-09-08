package Expected_programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDeupInUnsortArray {
	public static void main(String[] args) {
		int arr[] = {3, 1, 2, 1, 3, 2, 4, 5};
        int k = removeDuplicatesFromArray(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
	}
	
	public static int removeDuplicatesFromArray(int[] arr) {
		Set<Integer> seen = new HashSet<>();
		int i=0;
		
		for(int j=0;j<arr.length;j++) {
			if(!seen.contains(arr[j])) {
				seen.add(arr[j]);
				arr[i]=arr[j];
				i++;
			}
		}
			
		return i;
	}

}
