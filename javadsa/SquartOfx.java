package Expected_programs;
import java.util.*;

public class SquartOfx {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for to find the Square root: ");
		int n= sc.nextInt();
		System.out.println("The squre of an number is "+ SquareRoot(n));
	}
	
	static int SquareRoot(int x){
		if(x==0 | x==1) return x;
		int left=1,right=x;
		int result=0;
		while(left<right) {
			int mid = left+(right-left)/2;
			if(mid==x/mid) return mid;// using the x/mid instead of the mid*mid because it cause the overflow for larger values 
			else if(mid<x/mid) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return result;
	}
}
