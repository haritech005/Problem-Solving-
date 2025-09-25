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
