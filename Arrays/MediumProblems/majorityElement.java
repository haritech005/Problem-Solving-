/*
problem statement

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
*/

//Brute approch

class Main {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int n = arr.length;

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
               if(arr[j] == arr[i]){
                count++;
               }
            }
            if(count>n/2){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

//Better Approach

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int num : nums){
            hashmap.put(num,hashmap.getOrDefault(num,0)+1);
            if(hashmap.get(num) > nums.length/2){
                return num;
            }
        }
        return -1;
    }
}

//Optimized approach (Boyer Moore Majority voting algorithm)

class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int count = 0;
        int candidate = 0;

        for (int num : nums){
            if(count ==0){
                candidate = num;
            }
            else if (num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(candidate);
    }
}
