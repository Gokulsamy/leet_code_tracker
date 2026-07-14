// Last updated: 7/14/2026, 2:17:02 PM
class Solution {
    public int findMin(int[] nums) {
        int m=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<m){
                m=nums[i];
            }
        }
        return m;
    }
}