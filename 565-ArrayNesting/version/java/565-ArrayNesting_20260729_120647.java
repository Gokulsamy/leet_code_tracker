// Last updated: 7/29/2026, 12:06:47 PM
1class Solution {
2    public int arrayNesting(int[] nums) {
3        boolean[] vis = new boolean[nums.length];
4        int max = 0;
5        for (int i = 0; i < nums.length; i++) {
6            int count = 0;
7            int cur = i;
8            for (; !vis[cur]; ) {
9                vis[cur] = true;
10                cur = nums[cur];
11                count++;
12            }
13            if (count > max) {
14                max = count;
15            }
16        }
17        return max;
18    }
19}