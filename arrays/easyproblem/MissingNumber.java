class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length+1;
        long sumSeq = n*(n+1)/2;
        
        long sumArr = 0;
        
        for(int i=0;i<=arr.length-1;i++){
            sumArr+=arr[i];
        }
        
        long result = sumSeq - sumArr;
        
        return (int)result;
    }
}
