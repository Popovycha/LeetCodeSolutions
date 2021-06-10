class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; //ref of the front of the arr
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j; 
    }
}