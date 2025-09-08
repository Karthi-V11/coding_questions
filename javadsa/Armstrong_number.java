import java.util.*;


public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		
		if(isArmstrong(n)) {
			System.out.println("The given number "+ n +" is an Armstrong Number.");
		}
		else {
			System.out.println("The given number "+ n +" is not an Armstrong Number.");
		}
		sc.close();
	}
	
	static boolean isArmstrong(int n) {
		
		int original =n;
		int sum=0;
		int numDigits  = countDigits(n);
		
		int[] powertable = new int[10];
		for(int i=0;i<=9;i++) {
			powertable[i] = intPow(i,numDigits);
		}
		while(n>0) {
			int digit = n%10;
			sum += powertable[digit];
			n/=10;
		}
		return sum ==original;
	}
	
	
	static int countDigits(int n) {
		int count =0;
		while(n>0) {
			count++;
			n/=10;
		}
		
		return count;
	}
	
	
	static int intPow(int base, int exp) {
		int result =1;
		
		for(int i=0;i<exp;i++) {
			result*=base;
		}
		return result;
	}

}
