class Solution {
    public String is_palindrome(int n) {
        int temp = n;
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        if(sum == temp) {
            return "Yes";
        }
        return "No";
    }
}