// Last updated: 7/29/2026, 2:03:19 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int m=nums[0];
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]<m){
6                m=nums[i];
7            }
8        }
9        int x=0;
10        for(int i=0;i<nums.length;i++){
11            x=x+nums[i]-m;
12        }
13        return x;
14    }
15}