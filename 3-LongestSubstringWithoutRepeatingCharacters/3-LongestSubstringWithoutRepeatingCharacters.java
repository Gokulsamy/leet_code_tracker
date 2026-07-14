// Last updated: 7/14/2026, 2:20:49 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                boolean repeat = false;
                for (int k = i; k < j; k++) {
                    if (s.charAt(k) == s.charAt(j)) {
                        repeat = true;
                        break;
                    }
                }
                if (repeat) {
                    break;
                }
                count++;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}