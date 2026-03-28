public class FindHowManyTimesArraySorted {
    static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int n = arr.length;
        int low = 0;
        int high =n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while(low<=high){
            int mid = low+(high -low)/2;
            if(arr[mid]>=arr[low]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                low = mid+1;
            }
            else{
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[mid];
                }
                high = mid-1;
            }
        }
        System.out.println(index);
    }
}
