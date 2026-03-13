/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3
*/


//Brute Solution

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      int[] arr = {1,2,5,6,7};
      int longest = 1;
      
      for(int i=0;i<arr.length;i++){
          int x = arr[i];
          int count = 1;
          
          while(ls(arr,x+1) == true){
              x = x+1;
              count = count+1;
          }
          longest = Math.max(longest,count);
      }
      
      System.out.println(longest);
    }
    public static boolean ls(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                return true;
            }
        }
            return false;
    }
}


//Better Solution

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,3};
        int count = 0;
        int last_smallest = Integer.MIN_VALUE;
        int longest = 1;
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1 == last_smallest){
                count+=1;
                last_smallest = arr[i];
            }
            else if(arr[i] != last_smallest){
                count = 1;
                last_smallest = arr[i];
            }
            
            longest = Math.max(longest,count);
        }
        
        System.out.println(longest);
        
    }
}


