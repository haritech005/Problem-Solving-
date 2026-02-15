//problem

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
*/

//Brute approach

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
      int[] arr = {2,0,2,1,1,0};
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      
      for(int i=0;i<arr.length;i++){
        if (arr[i] == 0) {
                count1++;
            } else if (arr[i] == 1) {
                count2++;
            } else if (arr[i] == 2) {
                count3++;
            }
      }
      for(int i=0;i<count1;i++){
          arr[i] =0;
      }
    for(int i=count1;i<count1+count2;i++){
          arr[i] =1;
      }
            for(int i=count1+count2;i<arr.length;i++){
          arr[i] =2;
      }
      
      System.out.println(Arrays.toString(arr));
      
    }
}


//Optimal approach (Using Duch National Flag Algorithm)

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] ==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] ==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--; 
            }
        }
    }
}
