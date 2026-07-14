// Last updated: 7/14/2026, 2:16:10 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long t=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0){
                c++;
                t=t+c;
            }else{
                c=0;
            }
        }
        return t;
    }
}