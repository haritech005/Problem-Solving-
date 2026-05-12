/*
Given an array nums of size n, which denotes the positions of stalls, and an integer k, which denotes the number of aggressive cows, assign stalls to k cows such that the minimum distance between any two cows is the maximum possible. Find the maximum possible minimum distance.

Example 1

Input: n = 6, k = 4, nums = [0, 3, 4, 7, 10, 9]

Output: 3

Explanation:

The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions [0, 3, 7, 10]. Here the distances between cows are 3, 4, and 3 respectively.

In no manner can we increase the minimum distance beyond 3.*/


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
