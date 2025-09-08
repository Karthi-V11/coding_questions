package com.zoho.coding.secondRound;

import java.util.Scanner;

public class CheckWordPatternMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  String : ");
		String str = sc.nextLine();
		System.out.println("Enter the  String Pattern : ");
		String pattern = sc.nextLine();
		sc.close();
		System.out.println("is the given word patter match with the String?" + wordPattern(pattern, str));
	}

	public static boolean wordPattern(String pattern, String s) {

		int space_count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				space_count++;
			}
		}

		int word_count = space_count + 1;

		String words[] = new String[word_count];

		int index = 0;
		StringBuilder temp_string = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				temp_string.append(c);
			} else {
				words[index++] = temp_string.toString();
				temp_string.setLength(0);
			}
		}
		words[index] = temp_string.toString();
		
		return checkPatternMatch(pattern,words);
	}
	
	private static boolean checkPatternMatch(String pattern, String[] words) {
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
