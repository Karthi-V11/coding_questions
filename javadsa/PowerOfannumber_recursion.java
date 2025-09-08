import java.util.Scanner;

public class PowerOfannumber_recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value: ");
		long base=sc.nextInt();
		System.out.println("Enter the exponent value: ");
		long exponent=sc.nextInt();
		sc.close();
		System.out.println("The poer of the given number is: "+recursionPower(base,exponent));
	}
	
	static long recursionPower(long base,long expo) {
		if(expo==0)return 1;
		if(expo%2==0)return recursionPower(base*base,expo/2); 
		return base*recursionPower(base,expo-1);
	}
	
//	static long IterativePower(long base,long expo) {
//		long result=1;
//		if(expo==0)return 1;
//		while(expo>0) {
//			if((expo&1)==1) {
//				result*=base;
//			}
//			base=base*base;
//			expo>>=1;
//		}
//		return result;
//	}

}
