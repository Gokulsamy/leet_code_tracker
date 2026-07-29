// Last updated: 7/29/2026, 12:05:51 PM
1class Solution {
2    public int arrayNesting(int[] nums) {
3
4        boolean[] vis = new boolean[nums.length];
5        int max = 0;
6
7        for (int i = 0; i < nums.length; i++) {
8
9            int count = 0;
10            int cur = i;
11
12            for (; !vis[cur]; ) {
13                vis[cur] = true;
14                cur = nums[cur];
15                count++;
16            }
17
18            if (count > max) {
19                max = count;
20            }
21        }
22
23        return max;
24    }
25}