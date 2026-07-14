// Last updated: 7/14/2026, 2:20:40 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int x=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
        nums[x]=nums[i];
        x++;
    }
    }
       return x;
    }
}