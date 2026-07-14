// Last updated: 7/14/2026, 2:16:33 PM
class Solution {
    public int minMoves(int[] nums) {
        int m=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<m){
                m=nums[i];
            }
        }
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x+nums[i]-m;
        }
        return x;
    }
}