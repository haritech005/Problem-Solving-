// Binary Search is a searching algorithm that operates on a sorted or monotonic search space, repeatedly dividing it into halves to find a target value or optimal answer in logarithmic time O(log N).

// To apply Binary Search algorithm:

// The data structure must be sorted.
// Access to any element of the data structure should take constant time.

// Binary Search Algorithm
// Below is the step-by-step algorithm for Binary Search:

// Divide the search space into two halves by finding the middle index "mid". 
// Compare the middle element of the search space with the key. 
// If the key is found at middle element, the process is terminated.
// If the key is not found at middle element, choose which half will be used as the next search space.
// -> If the key is smaller than the middle element, then the left side is used for next search.
// -> If the key is larger than the middle element, then the right side is used for next search.
// This process is continued until the key is found or the total search space is exhausted.


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Recrusive Apporach
class Main {
    public static void main(String[] args) {
    //  Code for binary search
    int[] arr = {1,2,3,4,5,6};
    int target = 6;
    int low = 0;
    int high = arr.length-1;
    boolean isFound = false;
    
    while (low<=high){
        int mid = (low+high)/2;
        if(target == arr[mid]){
            System.out.println(mid);
            isFound = true;
            break;
        }
        
        if(target<arr[mid]){
            high = mid-1;
        }
        else{
            low = mid +1;
        }
    }
    if(!isFound){
        System.out.println(-1);
    }
    }
}

// Iterative apporach

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    //  Code for binary search
int [] arr = {1,2,3,4,5,6};
    System.out.println(binary(arr,0,arr.length-1,9));
    
    }
    public static int binary(int arr[],int low, int high,int target){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target < arr[mid]){
            high = mid -1;
        }
        else{
            low = mid+1;
        }
        return binary(arr,low,high,target);
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
