
/*
Given an integer array nums, return a list of all the leaders in the array.
A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.

Example 1

Input: nums = [1, 2, 5, 3, 1, 2]

Output: [5, 3, 2]

Explanation:

2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]

Example 2

Input: nums = [-3, 4, 5, 1, -4, -5]

Output: [5, 1, -4, -5]

Explanation:

-5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]
*/

//Bruteforce
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
       int[] arr = {10,22,12,3,0,6};
       ArrayList<Integer> result = new ArrayList<>();
       
       for(int i=0;i<arr.length;i++){
           boolean leader= true;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]>arr[i]){
                   leader = false;
                   break;
               }
           }
           if(leader==true){
               
           result.add(arr[i]);
           }
       }
       
    System.out.println(result);
    }
    
}


//Optimal Approach

import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
       int[] arr = {10,22,12,3,0,6};
       ArrayList<Integer> result = new ArrayList<>();
      
      int max = Integer.MIN_VALUE;
      for(int i=arr.length-1;i>=0;i--){
          if(arr[i]>max){
              result.add(arr[i]);
              max = arr[i];
          }
          
      }
      
      System.out.println(result);
      
    }
    
}
