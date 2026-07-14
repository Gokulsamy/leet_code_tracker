// Last updated: 7/14/2026, 2:17:26 PM
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return s.equals(rev);
    }
}