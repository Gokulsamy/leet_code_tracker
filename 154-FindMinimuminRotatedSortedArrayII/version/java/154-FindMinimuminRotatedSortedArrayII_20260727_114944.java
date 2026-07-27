// Last updated: 7/27/2026, 11:49:44 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int m=nums[0];
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]<m){
6                m=nums[i];
7            }
8        }
9        return m;
10    }
11}