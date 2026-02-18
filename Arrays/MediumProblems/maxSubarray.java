// bruteforce method

class Solution {
    public int maxSubArray(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>result){
                    result = sum;
                }
            }
        }
        return result;
    }
}
