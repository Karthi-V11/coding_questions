import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no for Array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the Array Elements : ");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		sc.close();
		OccuranceOfNO(arr);
	}
	
	static void OccuranceOfNO(int[] arr) {
		HashMap<Integer,Integer>freqencyMap = new HashMap<>();
		int maxInt =0;
		
		for(int num :arr) {
			int freq = freqencyMap.getOrDefault(num, 0)+1;
			freqencyMap.put(num, freq);
			
			if(freq>maxInt)maxInt=freq;
		}
		System.out.println("The max Frequency is : "+ maxInt);
		System.out.println("frequency of each element : ");
		for(int key : freqencyMap.keySet()) {
			System.out.println("Frequency of "+ key+ " is  "+freqencyMap.get(key)+ " times.");
		}
	}

}
