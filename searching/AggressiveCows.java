import java.util.Arrays;

public class AggressiveCow{
    static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 6};
        int cows = 2;
        Arrays.sort(arr);
        System.out.println(aggressiveCows(arr,cows));
    }
    public static boolean canWePlace(int[] arr, int distance,int cows){
        int countCow = 1;
        int last = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]-last >= distance){
                countCow++;
            }
            if(countCow>=cows){
                return true;
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] arr, int cows){
        int low = 0;
        int n = arr.length;
        int high = arr[n-1]-arr[0];

        while(low<=high){
            int mid = (low+high)/2;
            if(canWePlace(arr, mid, cows)){
                low = mid+1;
            }
            else{
                high = mid-1;            }
        }

        return high;
    }
}
