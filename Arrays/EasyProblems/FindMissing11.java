class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int value = n*(n+1)/2;
        int sum = 0;
        for(int i=0;i<n;i++){ 
            sum = sum+nums[i];
        }
        return (value - sum);
    }
}

//Using XOR method 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int [] arr = {0,1,2,3,4};
       int n = 5;
       
       int xor1 = 0;
       for(int i=1;i<=n;i++){
           xor1 = xor1^i;
       }
       
       int xor2 = 0;
       for(int i=0;i<n;i++){
           xor2 = xor2^arr[i];
       }
       
       System.out.println((xor1^xor2));
    }
}
