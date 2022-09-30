class Solution {
    public int[] sortedSquares(int[] nums) {
        //Brute Force
        // for(int i = 0; i < nums.length; i++) {
        //     nums[i] = (nums[i] * nums[i]);
        // }
        // Arrays.sort(nums);
        // return nums;
        
//         //  Time Complexity = O(N)
//         //  Space Complexity = O(N)
        //  Resultant squared sorted array
        int[] resultant = new int[nums.length];
        //  Left and Right Pointer
        int left = 0, right = nums.length -1;
        
        //  Loop through the resultant array from right most side
        for(int i = nums.length-1 ; i >= 0; --i){
            //  if absolute value on left pointer is greater than absolute value of right
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                resultant[i] = nums[left]*nums[left];
                ++left;                 //  update the pointer
            }
            //  if absolute value on right pointer is greater than or equal to absolute value of left
            else{
                resultant[i] = nums[right]*nums[right];
                --right;                //  update the pointer
            }
        }
        
        return resultant;
    }
}