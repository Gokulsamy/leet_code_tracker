// Last updated: 7/14/2026, 2:16:39 PM
class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}