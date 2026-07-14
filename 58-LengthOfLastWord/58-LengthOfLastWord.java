// Last updated: 7/14/2026, 2:17:40 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(' ') - 1;
    }
}