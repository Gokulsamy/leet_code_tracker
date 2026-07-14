// Last updated: 7/14/2026, 2:17:21 PM
class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        for(int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}