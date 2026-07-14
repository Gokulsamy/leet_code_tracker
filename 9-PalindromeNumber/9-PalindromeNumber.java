// Last updated: 7/14/2026, 2:20:46 PM
class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) return false;

        int original = x;
        int rev = 0;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return rev == original;
    }
}
