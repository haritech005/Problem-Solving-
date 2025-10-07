class Main {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6};
       int x = 69;
       int low = 0;
       int high = arr.length-1;
       int ans = -1;
       boolean isFound = false;
       
       while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]>=x){
               ans = mid;
               high = mid-1;
               isFound = true;
           }
           else{
               low = mid+1;
           }
       }
           System.out.println(ans);
    }
}
