class Solution {
    public int getSecondLargest(int[] arr) {
       int max = arr[0];
       int min = Integer.MIN_VALUE;
       
       if(arr.length<=1){
           return -1;
       }
       
       for(int i=0;i<=arr.length-1;i++){
           if(arr[i]>max){
               min = max;
               max = arr[i];
           }
           else if (arr[i]<max && arr[i]>min){
               min = arr[i];
           }
       }
       
       if(min == max || min ==Integer.MIN_VALUE){
           return -1;
       }
       return min;
        
    }
}
