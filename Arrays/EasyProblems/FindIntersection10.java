//BruteForce Approach

import java.util.Arrays;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,5};
        int n = arr1.length;
        int m = arr2.length;
        boolean[] vis = new boolean[m];
        ArrayList <Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i] == arr2[j] && !vis[j]){
                    result.add(arr1[i]);
                    vis[j] = true;
                    break;
                }
                if(arr2[j] > arr1[i]){
                    break;
                }
            } 
        }

       System.out.println(result);

    }
}

// Optimized Approach

class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
         int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                int val = arr1[i];
                list.add(val);

                while (i < arr1.length && arr1[i] == val) {
                    i++;
                }

                while (j < arr2.length && arr2[j] == val) {
                    j++;
                }
            }
        }
        
        return list;
    }
}
