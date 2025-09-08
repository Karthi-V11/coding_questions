package com.zoho.coding.secondRound;

public class SmallestWindowSubString {
	public static String minWindow(String s, String t) {
		if (s.length() < t.length())
			return "";

		int freqT[] = new int[128];
		for (int c : t.toCharArray()) {
			freqT[c]++;
		}

		int left = 0, right = 0;
		int minLen = Integer.MAX_VALUE;
		int minStart = 0;
		int need = t.length();
		while (right < s.length()) {
			char rChar = s.charAt(right);

			if (freqT[rChar] > 0) {
				need--;
			}
			freqT[rChar]--;
			right++;

			while (need == 0) {
				if (right - left < minLen) {
					minLen = right - left;
					minStart = left;
				}

				char lchar = s.charAt(left);

				freqT[lchar]++;

				if (freqT[lchar] > 0) {
					need++;
				}
				left++;
			}
		}
		
		if (minLen == Integer.MAX_VALUE) return "";
		StringBuilder ans = new StringBuilder();
		for(int i=minStart;i<minStart+minLen;i++) {
			ans.append(s.charAt(i));
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		System.out.println("Smallest window: " + minWindow("this is a test string", "tist"));
	}
}

