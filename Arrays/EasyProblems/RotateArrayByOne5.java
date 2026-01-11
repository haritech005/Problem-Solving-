// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        
    int n = arr.length;
    int temp = arr[n-1];
        
        for(int i=arr.length-1;i>0;i--){
        arr[i] = arr[i-1];
    }
        
        arr[0] =temp;
        
    }
}
