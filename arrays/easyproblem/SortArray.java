// Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

// Examples:

// Input: arr[] = [10, 20, 30, 40, 50]
// Output: true
// Explanation: The given array is sorted.
// Input: arr[] = [90, 80, 100, 70, 40, 30]
// Output: false
// Explanation: The given array is not sorted.

class Solution {
    public boolean isSorted(int[] arr) {
       boolean res = true;
       
       for(int i=0;i<=arr.length-2;i++){
           if(arr[i]>arr[i+1]){
               res = false;
               break;
           }
       }
       
       return res;
        
    }
}
