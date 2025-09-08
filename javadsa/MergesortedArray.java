package leetcode;

import java.util.*;

class MergesortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=nums1.length-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(i>=0){
            nums1[k]=nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
    
    public static void main(String[] args) {
//        MergesortedArray obj = new MergesortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

//      obj.merge(nums1, m, nums2, n);
        merge(nums1, m, nums2, n);


        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
    
}


/*
// tc =O(m+n)and sc=O(m+n) bruteforce

 class Solution {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
         int left=0;
         int right=0;
         int index=0;
         int[] ans= new int[m+n];
         while(left<m && right<n){
             if(nums1[left]<=nums2[right]){
                 ans[index]=nums1[left];
                 index++;
                 left++;
             }
             else{
                 ans[index]=nums2[right];
                 index++;
                 right++;
             }
         }
         while(left<m){
             ans[index++]=nums1[left++];
         }
         while(right<n){
             ans[index++] = nums2[right++];
         }
         for( int i=0;i<m+n;i++){
             nums1[i]=ans[i];
         }
     }
 }
*/