class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return;
            
        int start = 0; //keep track 0 to the front
        int end = nums.length - 1; //keep track 2 to the back
        int index = 0; //move along current number
        
        while(index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start]; //swap to the front
                nums[start] = 0;
                start++;
                index++;
                
            } else if (nums[index] == 2) {
                nums[index] = nums[end]; //swap to the back
                nums[end] = 2;
                end--;
            } else {
                index++;
            }
        }
    
    }
}