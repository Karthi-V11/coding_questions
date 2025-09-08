package com.zoho.coding.secondRound;
/*
 * 1)if no such character is exists,return -1; (codeitcodeit)each character frequency is 2
 * 2)The Comparision is case Sensitive (Codeitcodeit) C and c both are different 
 * and frequency is 1... so return C because which is the first.
 * 3)special characters and symbols are also counted (codeit@*codeit@)
 * tc=O(n), sc=O(1)
 */

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str1 = "codeitcodeits";
		String str2 = "@codeit@*codeit@#";
		String str3 = "Codeitcodeit";
		String str4 = " abcdc ba @abc dcba# ABC Dcba";
		String str5 = "";
		String str6 = "hi hello #";
		
		System.out.println("The first Non repeating char in the given String is: " + nonRepeatingChar(str1));
		System.out.println("The first Non repeating char in the given String is: " + nonRepeatingChar(str2));
		System.out.println("The first Non repeating char in the given String is: " + nonRepeatingChar(str3));
		System.out.println("The first Non repeating char in the given String is: " + nonRepeatingChar(str4));
		System.out.println("The first Non repeating char in the given String is: " + nonRepeatingChar(str5));
		System.out.println("The first Non repeating char in the given String is: " + nonRepeatingChar(str6));
		
		

	}
	
	private static Character nonRepeatingChar(String str) {
		if(str.length()<=1)return null; 
		
		int FreqArr[] = new int [256];
		for(int i=0;i<str.length();i++) {
			FreqArr[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(FreqArr[str.charAt(i)] ==1) {
				return str.charAt(i);
			}
		}
		return null;
	}

}
