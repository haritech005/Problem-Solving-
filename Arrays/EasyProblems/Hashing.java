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
