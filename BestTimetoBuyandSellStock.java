package com.zoho.coding.secondRound;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		int arr1[] = { 4,2,1,3 };
		int arr2[] = { 7 };
		int arr3[] = { 1, 3, 5, 4, 7 };
		int arr4[] = { 7,1,5,3,6,4 };
		int arr5[] = {7,6,4,3,1 };
		System.out.println("The maximum Profit of the given array is: " + maximumProfit(arr1));
		System.out.println("The maximum Profit of the given array is: " + maximumProfit(arr2));
		System.out.println("The maximum Profit of the given array is: " + maximumProfit(arr3));
		System.out.println("The maximum Profit of the given array is: " + maximumProfit(arr4));
		System.out.println("The maximum Profit of the given array is: " + maximumProfit(arr5));
	}
	
	private static int maximumProfit(int prices[]) {
		if (prices == null || prices.length < 2) {
            return 0;
        }
		int maxProfit=0;
		int cost=prices[0];
		
		for(int sprice:prices) {
			if(sprice<cost) {
				cost=sprice;
			}
			
			int profit = sprice-cost;
			if(profit>maxProfit) {
				maxProfit=profit;
			}
		}
		return maxProfit;
	}
}
