package com.zoho.coding.secondRound;

public class RemoveUnbalancedParentheses {
	public static void main(String[] args) {
		String input1 = "((abc)((de))";
		String input2 = "(((ab)";

		System.out.println("Input : " + input1);
		System.out.println("Output: " + removeUnbalanced(input1));

		System.out.println("Input : " + input2);
		System.out.println("Output: " + removeUnbalanced(input2));
	}

	private static String removeUnbalanced(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;

//        first pass
		int openCount = 0, writeIndex = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == '(') {
				openCount++;
				arr[writeIndex++] = arr[i];
			} else if (arr[i] == ')'&& openCount>0) {
				openCount--;
				arr[writeIndex++] = arr[i];
			} else {
				arr[writeIndex++] = arr[i];
			}
		}

//        second pass
		int extraOpen = openCount, finalWriteIndex = writeIndex-1;
		
		for(int i=writeIndex-1;i>=0;i--) {
			if(arr[i] =='(' && extraOpen>0) {
				extraOpen--;
			}
			else {
				arr[finalWriteIndex--] = arr[i];
			}
		}
		
		return new String(arr,finalWriteIndex+1,writeIndex-(finalWriteIndex+1));
	}
}
