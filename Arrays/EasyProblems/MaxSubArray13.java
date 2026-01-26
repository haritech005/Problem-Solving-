// this code is bruteforce of printing longest postive subarray in java 

import java.lang.Math;
class Main {
    public static void main(String[] args) {
     int[] arr = {1,2,3};
     int target=3;
     int n = arr.length;
     int maxLen = 0;
     
     for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
             int sum = 0;
             for(int k=i;k<=j;k++){
                 sum+=arr[k];
             }
             if(sum==target){
                 int length = j-i+1;
                 maxLen = Math.max(maxLen,length);
             }
             
         }
     }
     System.out.println(maxLen);
    }
}


//brute better

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.Math;
class Main {
    public static void main(String[] args) {
     int[] arr = {1,2,3};
     int target=3;
     int n = arr.length;
     int maxLen = 0;
     
     for(int i=0;i<n;i++){
             int sum = 0;
         for(int j=i;j<n;j++){
             sum += arr[j];
             if(sum==target){
                 int length = j-i+1;
                 maxLen = Math.max(maxLen,length);
             }
             
         }
     }
     System.out.println(maxLen);
    }
}


//Optmimal solution with two pointer
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = nums[0];
        int right = 0;
        int left = 0;
        int n = nums.length;
        int maxLen = 0;

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += nums[right];
            }
        }
        return maxLen;
    }
}



