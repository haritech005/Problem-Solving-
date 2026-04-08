public class NthRoot {
    static void main(String[] args) {
        System.out.println(nthRootValue(3,27));
    }

    public static double multiple(double m, int n){
        double ans = 1.0;
        for(int i=1;i<=n;i++){
            ans = ans * m;
        }
        return  ans;
    }

    public static double nthRootValue(int n,int m){
        double low = 1;
        double high = n;
        double esp = 1e-6;

        while((high-low) > esp){
            double mid = (low + high)/2.0;

            if(multiple(mid,n) < m){
                low = mid;
            }
            else{
                high = mid;
            }

        }

        return low ;
    }
}
