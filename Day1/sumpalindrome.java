/*
Given a number, reverse it and add it to itself unless it becomes a palindrome or return -1 if the number of iterations becomes more than 5. Return that palindrome number if it becomes a palindrome else returns -1.

Examples :

Input: n = 23
Output: 55 
Explanation: reverse(23) = 32,then 32+23 = 55 which is a palindrome. 
Input: n = 73
Output: 121
Explanation: reverse(73) = 37,then 37+73 = 110 which is not a palindrome, again reverse(110)= 011, then 110+11 = 121 which is a palindrome.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 104
*/
class Solution {
        
    static long isSumPalindrome(long n) {
        
         if (isPalindrome(n)) {
            return n;
        }
        
        int iteration = 0;
        while (iteration < 5) {
            long reversenum = reverse(n);
            n = n + reversenum;
            
            if (isPalindrome(n)) {
                return n;
            }
            iteration++;
        }
        return -1;
    }
    
    private static long reverse(long num) {
        long sum = 0;
        while (num > 0) {
            long rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        return sum;
    }
    
    private static boolean isPalindrome(long num) {
        return num == reverse(num);
    }
}
