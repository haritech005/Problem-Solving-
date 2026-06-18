// Input :fruits = [1, 2, 1]
// Output :3
// Explanation : We will start from first tree.
// The first tree produces the fruit of kind '1' and we will put that in the first basket.
// The second tree produces the fruit of kind '2' and we will put that in the second basket.
// The third tree produces the fruit of kind '1' and we have first basket that is already holding fruit of kind '1'. So we will put it in first basket.
// Hence we were able to collect total of 3 fruits.


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitIntoBaskets {
    static void main(String[] args) {
        int[] arr = {3,3,3,1,2,1,2,3,3,4};
        System.out.println(bruteApproach(arr));
        System.out.println(optimizedApproach(arr));
    }

    public static int optimizedApproach(int[] arr){
            int maxLen = 0;
            int left = 0;
            int right =0;
            int n = arr.length;
            HashMap<Integer,Integer> st = new HashMap<>();

            while(right<n){
                st.put(arr[right],st.getOrDefault(arr[right],0)+1);

                while(st.size()>2){
                    st.put(arr[left],st.get(arr[left])-1);
                    if(st.get(arr[left]) == 0){
                        st.remove(arr[left]);
                    }
                    left++;
                }

                maxLen = Math.max(maxLen,right-left+1);

                right++;
            }


            return maxLen;
    }
    public static int bruteApproach(int[] arr){
        int maxLen = 0;
        for(int i=0;i<arr.length;i++){
            Set<Integer> st = new HashSet<>();
            for(int j=i;j<arr.length;j++){
                st.add(arr[j]);
                if(st.size()<=2){
                    maxLen = Math.max(maxLen,j-i+1);
                }
                else{
                    break;
                }
            }
        }


        return maxLen;
    }
}
