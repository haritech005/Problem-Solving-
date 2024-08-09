/*
Given an integer n, find the square root of n. If n is not a perfect square, then return floor(√n).
Note: Floor value of an integer n is the greatest number less than or equal to n.

Examples:

Input: n = 5
Output: 2
Explanation: Since, 5 is not a perfect square, floor of square_root of 5 is 2.
Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.
Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ n ≤ 107
*/
class Solution {
    long floorSqrt(long n) {
        long squ =(long) Math.sqrt(n);
        return squ;
    }
}
