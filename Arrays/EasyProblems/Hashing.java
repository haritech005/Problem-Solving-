class Main {
    public static void main(String[] args) {
       int[] arr = {1,1,2,3,2,1,2};
       int[] hash = new int [10];
       
       for(int i=0;i<arr.length; i++){
           hash[arr[i]]++;
       }
       System.out.println(hash[2]);
    }
}

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
       int[] arr = {1,1,2,2,1,3,3,4,1};
       HashMap<Integer,Integer> hashmap = new HashMap<>();
       
       for(int x : arr){
           hashmap.put(x, hashmap.getOrDefault(x,0) +1);
       }
       
       System.out.println(hashmap.getOrDefault(1,0));
       
    }
}

// Finding Maximum and Minimum element in the given Hashmap
import java.util.HashMap;
import java.util.*;


class Main {
    public static void main(String[] args) {
       int[] arr = {1,1,1,2,3,1,2,3,1,3};

       HashMap <Integer, Integer> map = new HashMap<>();
       
       for(int x : arr){
        map.put(x,map.getOrDefault(x,0)+1);
       }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int maxElement = 0;
        int minElement = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int frequency = entry.getValue();

            if(frequency > maxFreq){
                maxFreq = frequency;
                maxElement = element;
            }

            if(frequency < minFreq){
                minFreq = frequency;
                minElement = element;
            }
        }

        System.out.println(maxElement + " "+ minElement);



    }
}
