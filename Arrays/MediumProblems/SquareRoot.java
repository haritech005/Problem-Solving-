public class SquareRoot {
    static void main(String[] args) {
        int n = 36;
        int ans = 1;
        for(int i=1;i<=n;i++){
            if(i*i <= n){
                ans = i;
            }
        }
//        System.out.println(ans);
        System.out.println(SqRoot(25));
    }
    public static int SqRoot(int n){
        int low = 1;
        int high = n;

        while(low<=high){
            int mid = low + (high-low)/2;

            if((mid*mid) <= n){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return high;

    }
}
