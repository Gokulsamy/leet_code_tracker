// Last updated: 7/27/2026, 12:26:27 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3     int m=0;
4     int n=0;
5     for(int i=0;i<nums.length;i++){
6        for(int j=i+1;j<nums.length;j++){
7            m=((nums[i]-1)*(nums[j]-1));
8            if(m>n){
9                n=m;
10            }
11        }
12     }
13     return n;
14    }
15}