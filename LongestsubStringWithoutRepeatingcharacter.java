package com.zoho.coding.secondRound;
/*
 * 1)Return the length of the longest substring withoout repeating characters. (str="abcabcdae")
 * 2)the comparision is case sensitive (str="abcabcAae")
 * 3)All characters including special characters are considered.(str="abc@abcd@Aa")
 */

public class LongestsubStringWithoutRepeatingcharacter {
	public static void main(String[] args) {
		String str1 = "abcabcdae";
		String str2 = "abcbcAaeBdcE";
		String str3 = "abc@abcd@Aa";
		String str4 = " abcdcb a@ab cdcb a#ABCDcba";
		String str5 = " ";
		String str6 = "hihello#";
		
		System.out.println("The Longest SubString of the given String is: " + LongestSubString(str1));
		System.out.println("The Longest SubString of the given String is: " + LongestSubString(str2));
		System.out.println("The Longest SubString of the given String is: " + LongestSubString(str3));
		System.out.println("The Longest SubString of the given String is: " + LongestSubString(str4));
		System.out.println("The Longest SubString of the given String is: " + LongestSubString(str5));
		System.out.println("The Longest SubString of the given String is: " + LongestSubString(str6));
		
	}
	
	private static int LongestSubString(String str) {
		int[] lastseen = new int[256];
		for (int i = 0; i < 256; i++) lastseen[i] = -1;

		int maxlen = 0, l = -1;
		for (int r = 0; r < str.length(); r++) {
		    if (lastseen[str.charAt(r)] > l) l = lastseen[str.charAt(r)];
		    maxlen = Math.max(maxlen, r - l);
		    lastseen[str.charAt(r)] = r;
		}
		return maxlen;

    }
}
