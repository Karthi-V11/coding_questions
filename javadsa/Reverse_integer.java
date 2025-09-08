import java.util.Scanner;

public class Reverse_integer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		
		System.out.print("The reversed number is : "+reverseNumber(n));

		sc.close();
	}
	static int reverseNumber(int n) {
		int sign = 1;
		if(n<0) {
			sign=-1;
			n=0-n;
		}
		
		int rev=0;
		while(n>0) {
			rev =rev*10+n%10;
			n/=10;
		}
		
		return rev*sign;
		
	}
}
