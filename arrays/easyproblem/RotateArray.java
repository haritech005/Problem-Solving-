// User function Template for Java

class Solution {
    
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d%n;
        
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
        
    }
     static void reverseArray(int arr[], int start,int end){
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
}
