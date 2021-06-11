class Solution {
    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(maxCurrent < 0) {
                maxCurrent = nums[i];
            } else {
                maxCurrent += nums[i];
            }
            if (maxCurrent > maxGlobal)
                maxGlobal = maxCurrent;
        }
        return maxGlobal;
    }
}