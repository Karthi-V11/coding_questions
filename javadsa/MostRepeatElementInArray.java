package Expected_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostRepeatElementInArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter the Array Elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		frequency(arr,n);
		sc.close();
	}
	
	public static void frequency(int[] arr, int n) {
		
		Map<Integer,Integer>frequencymap= new HashMap<>();
		int maxFreq=0;
		int mostFrequentElement =arr[0];
		
		for(int num:arr) {
			frequencymap.put(num, frequencymap.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry :frequencymap.entrySet()) {
			
			if(entry.getValue()>maxFreq) {
				maxFreq= entry.getValue();
				mostFrequentElement = entry.getKey();
			}
		}
		
		System.out.println("Most repeated element: " + mostFrequentElement);
        System.out.println("Frequency: " + maxFreq);
		
	}
}








