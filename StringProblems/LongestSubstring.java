// Longest substring with atmost k distinct characters

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbccd";
        int k = 2;
        System.out.println(longestStringLength(str,k));
    }
    public static int longestStringLength(String str,int k){
        int maxLen = 0;
        int left = 0;
        int right =0;
        HashMap<Character,Integer> map = new HashMap<>();
        int n = str.length();

        while(right<n){
            map.put(str.charAt(right),map.getOrDefault(str.charAt(right),0)+1);

            while (map.size()>k){
                map.put(str.charAt(left),map.get(str.charAt(left))-1);
                if(map.get(str.charAt(left))==0){
                    map.remove(str.charAt(left));
                }
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);

            right++;
        }




        return maxLen;
    }
}
