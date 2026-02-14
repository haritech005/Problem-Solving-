//Brute Force method for two sum
class Main {
    public static void main(String[] args) {
       int[] arr = {2,7,11,15};
       int target = 26;
       int[] result = new int[2];
       
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j] == target){
                   result[0] = i;
                   result[1] = j;

                     System.out.println("[" + i + "," + j + "]");
                    return;
               }
           }
       }
    }
}

//Optimal approach
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}

