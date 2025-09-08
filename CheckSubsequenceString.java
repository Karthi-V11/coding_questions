package com.zoho.coding.secondRound;

public class CheckSubsequenceString {
	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		
		String s1 = "axc";
		String t1 = "ahbgdc";
		
		
		 System.out.println("Is "+ s + " a subsequence of " + t + "? " + isSubsequenceString(s, t));
	     System.out.println("Is " + s1 + " a subsequence of " + t1 + "? " + isSubsequenceString(s1, t1));
		
	}
	
	private static boolean isSubsequenceString(String str1,String str2) {
		int i=0,j=0;
		while(i<str1.length() && j<str2.length()) {
			if(str1.charAt(i)==str2.charAt(j)) {
				i++;
			}
			j++;
		}
		
		return i==str1.length();
	}
}
