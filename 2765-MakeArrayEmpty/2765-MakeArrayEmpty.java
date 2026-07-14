// Last updated: 7/14/2026, 2:16:23 PM
import java.util.*;

class Solution {
    public long countOperationsToEmptyArray(int[] nums) {

        int n = nums.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];   // value
            arr[i][1] = i;         // original index
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        long ans = n;

        for (int i = 1; i < n; i++) {
            if (arr[i][1] < arr[i - 1][1]) {
                ans += n - i;
            }
        }

        return ans;
    }
}