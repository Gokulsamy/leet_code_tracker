// Last updated: 7/29/2026, 2:08:09 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int c=nums[0];
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]<c){
6                c=nums[i];
7            }
8        }
9        int t=0;
10        for(int i=0;i<nums.length;i++){
11            t=t+nums[i]-c;
12            
13        }
14        return t;
15    }
16}