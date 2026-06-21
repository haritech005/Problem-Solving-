import java.util.HashMap;

public class CountSubArray {
    static void main(String[] args) {
        int[] arr = {3,-3,1,1,1};
        int k = 3;

        System.out.println(optimalApproach(arr,k));


    }
    public static int bruteApproach(int[] arr,int k) {
        int count = 0;

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(sum ==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static int optimalApproach(int[] arr,int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int count = 0;
        int prefixSum = 0;

        for(int i=0;i<arr.length;i++){
            prefixSum+= arr[i];

            int remove = prefixSum-k;

            count+= map.getOrDefault(remove,0);

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }



        return count;
    }
}
