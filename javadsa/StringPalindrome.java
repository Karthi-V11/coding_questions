import java.util.Scanner;
//this program only considers letters and digits, and ignores special characters.
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str =sc.nextLine();
		sc.close();
		if(isPalindrome(str)) {
			   System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
	}
	
	static boolean isPalindrome(String s) {
		if (s == null || s.length() <= 1) return true;
		
		int left=0;
		int right=s.length()-1;
		
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(s.charAt(left)))left++;
			while(left<right && !Character.isLetterOrDigit(s.charAt(right)))right--;

			if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
}
