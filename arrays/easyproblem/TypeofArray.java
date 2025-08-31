// User function Template for Java

// You are given an array arr[] having unique elements. Your task is to return the type of array.
// Note: The array can be categorized into ascending, descending, descending rotated and ascending rotated followed by:

// Return 1 if the array is in ascending order
// Return 2 if the array is in descending order
// Return 3 if the array is in descending rotated order
// Return 4 if the array is in ascending rotated order

class Solution {
    int maxNtype(int arr[]) {
         int n = arr.length;
        boolean isAscending = true;
        boolean isDescending = true;

        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) isAscending = false;
            if (arr[i] < arr[i + 1]) isDescending = false;
        }

        if (isAscending) return 1;  
        if (isDescending) return 2; 

       
        if (arr[0] > arr[n - 1]) return 4;
        return 3;        
    }
    }

