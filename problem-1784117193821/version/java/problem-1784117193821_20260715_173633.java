// Last updated: 7/15/2026, 5:36:33 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3       int l=0;
4       int r=nums.length-1;
5       while(l<r){
6        int m=l+(r-l)/2;
7        if(m%2==1){
8            m--;
9        }
10        if(nums[m]==nums[m+1]){
11            l=m+2;
12        }
13        else{
14            r=m;
15        }
16       }
17       return nums[l];
18    }
19}