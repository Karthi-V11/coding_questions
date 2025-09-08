package com.zoho.coding.secondRound;

/*
 * ignore case sensitivity (str= "ABCDcba" =>abcdcba)
 * ignore all non alphabetic characters (str= "@abcdcba#" =>abcd)
 * ignore spaces -> skip ' 'characters (str= " abcdcba" =>abcdcba)
 */

public class ValidPalindrome {
	public static void main(String[] args) {
		String str1 = "ABCDcba";
		String str2 = "@abcdcba#";
		String str3 = " abcdcba";
		String str4 = " abcdc ba @abc dcba# ABC Dcba";
		String str5 = " ab# cde @cb a";
		String str6 = " ";

		System.out.println("The given string is valid Palindrome?" + isValidPalindrome(str1));
		System.out.println("The given string is valid Palindrome?" + isValidPalindrome(str2));
		System.out.println("The given string is valid Palindrome?" + isValidPalindrome(str3));
		System.out.println("The given string is valid Palindrome?" + isValidPalindrome(str4));
		System.out.println("The given string is valid Palindrome?" + isValidPalindrome(str5));
		System.out.println("The given string is valid Palindrome?" + isValidPalindrome(str6));

	}

	// using two pointers approach.
	private static boolean isValidPalindrome(String str) {

		int i = 0, j = str.length() - 1;

		while (i < j) {
			char left = str.charAt(i);
			char right = str.charAt(j);

			if (left >= 'A' && left <= 'Z')
				left = (char) (left + 32); // A=65 , a=97
			if (right >= 'A' && right <= 'Z')
				right = (char) (right + 32); // A=65 , a=97

			if (!(left >= 'a' && left <= 'z')) {
				i++;
				continue;
			}
			if (!(right >= 'a' && right <= 'z')) {
				j--;
				continue;
			}

			if (left != right)
				return false;
			i++;
			j--;

		}

		return true;
	}

//	withput two pointer..
//	private static boolean isValidPalindrome(String str) {
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0;i<str.length();i++) {
//			char ch= str.charAt(i);
//			
//			if(ch>='A' && ch<='Z') {
//				ch = (char)(ch+32); //A=65 , a=97
//			}
//			
//			if(ch>='a' && ch<='z' ||ch>='0' && ch<='9') {
//				sb.append(ch);
//			}
//			
//		}
//
//		StringBuilder rev = new StringBuilder();
//		for(int i=sb.length()-1;i>=0;i--) {
//			rev.append(sb.charAt(i));
//		}
//		
//		return sb.toString().equals(rev.toString());
//	}

}
