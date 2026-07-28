// Last updated: 7/28/2026, 2:59:47 PM
1class Solution { public int[] productExceptSelf(int[] nums) { int n = nums.length; int[] ans = new int[n]; // Left products 
2ans[0] = 1; for (int i = 1; i < n; i++)
3 { ans[i] = ans[i - 1] * nums[i - 1];
4  } // Right products
5 int right = 1; for (int i = n - 1; i >= 0; i--) {
6     ans[i] = ans[i] * right; right = right * nums[i]; 
7     }
8      return ans; } }