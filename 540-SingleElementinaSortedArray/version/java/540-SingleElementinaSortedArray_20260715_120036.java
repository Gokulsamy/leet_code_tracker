// Last updated: 7/15/2026, 12:00:36 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3
4        int ans=0;
5
6        for(int x:nums){
7            ans^=x;
8        }
9
10        return ans;
11    }
12}