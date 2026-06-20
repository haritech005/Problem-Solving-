// Given a string s consisting only of characters a, b and c.
// Return the number of substrings containing at least one occurrence of all these characters a, b and c.

// Example 1:
// Input: s = "abcabc"
// Output: 10
// Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", 
// "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 


class Solution {
    public int numberOfSubstrings(String s) {
        int lastA = -1;
        int lastB = -1;
        int lastC = -1;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                lastA = i;
            }
            if (s.charAt(i) == 'b') {
                lastB = i;
            }
            if (s.charAt(i) == 'c') {
                lastC = i;
            }

            int minIndex = Math.min(lastA, Math.min(lastB, lastC));

            if (minIndex != -1) {
                count += minIndex+1;
            }
        }

        return count;
    }
}
