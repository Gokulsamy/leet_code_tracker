// Last updated: 8/5/2026, 2:44:25 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3    
4        for(int i=0;i<numbers.length;i++){
5                for(int j=i+1;j<numbers.length;j++){
6                if(numbers[i]+numbers[j]==target)
7               {
8                    return new int[]{i+1,j+1};
9
10                }
11                }
12        }
13        return new int[]{-1,-1};
14    }
15}