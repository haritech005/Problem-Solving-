// this code is bruteforce of printing longest postive subarray in java 

import java.lang.Math;
class Main {
    public static void main(String[] args) {
     int[] arr = {1,2,3};
     int target=3;
     int n = arr.length;
     int maxLen = 0;
     
     for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
             int sum = 0;
             for(int k=i;k<=j;k++){
                 sum+=arr[k];
             }
             if(sum==target){
                 int length = j-i+1;
                 maxLen = Math.max(maxLen,length);
             }
             
         }
     }
     System.out.println(maxLen);
    }
}


//brute better

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.Math;
class Main {
    public static void main(String[] args) {
     int[] arr = {1,2,3};
     int target=3;
     int n = arr.length;
     int maxLen = 0;
     
     for(int i=0;i<n;i++){
             int sum = 0;
         for(int j=i;j<n;j++){
             sum += arr[j];
             if(sum==target){
                 int length = j-i+1;
                 maxLen = Math.max(maxLen,length);
             }
             
         }
     }
     System.out.println(maxLen);
    }
}




