import java.util.Scanner;

// using the two pointer and char array tc-o(n) and sc-o(n)

public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String here: ");
		String str = sc.next();
		System.out.print("The reversed string  is : "+ reversedString(str));
		sc.close();
	}
	
	static String reversedString(String str) {
		char[] chars= str.toCharArray();
		int left=0, right=str.length()-1;
		
		while(left<right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			System.out.println(chars[left]);
			System.out.println(chars[right]);
			left++;
			right--;
		}
		
		return new String(chars);
	}
}

//this is also optimal approach
//public class Reverse_String {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String or your name: ");
//		String str = sc.next();
//		System.out.println("The Reversed String of yours: ");
//		reverseString(str);
//		sc.close();
//	}
//
//	static String reverseString(String s) {
//		if (s == null || s.length() <= 1)
//			return s;
//		int n = s.length();
//		char[] reversed = new char[n];
//		for (int i = 0; i < n; i++) {
//			reversed[i] = s.charAt(n - 1 - i);
//		}
//		return new String(reversed);
//	}
//
//}
