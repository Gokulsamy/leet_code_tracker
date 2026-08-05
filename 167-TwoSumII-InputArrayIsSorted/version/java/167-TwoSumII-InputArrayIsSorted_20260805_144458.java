// Last updated: 8/5/2026, 2:44:58 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3
4        int left = 0;
5        int right = numbers.length - 1;
6
7        while (left < right) {
8
9            int sum = numbers[left] + numbers[right];
10
11            if (sum == target) {
12                return new int[]{left + 1, right + 1}; // 1-based index
13            } else if (sum < target) {
14                left++;
15            } else {
16                right--;
17            }
18        }
19
20        return new int[]{-1, -1};
21    }
22}