// Brute solution

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 5; 
        int length = 0;

        for(int i=0;i<arr.length;i++){
                int sum = 0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(sum == target){
                    length = Math.max(length,(j-i)+1);
                }

            }
        }

        System.out.println(length);

    }
}

//better solution

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3; 

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        map.put(0,-1);

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(map.containsKey(sum-k)){
                int prevIndex = map.get(sum-k);
                int len = i - prevIndex;

                maxLen = Math.max(maxLen,len);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
       System.out.println(maxLen);
    }
}
