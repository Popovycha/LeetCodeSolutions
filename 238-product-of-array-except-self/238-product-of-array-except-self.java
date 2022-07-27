class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        
        int[] output_arr = new int[N];
        
        output_arr[0] = 1;
        //calculates all values up to current element
        for(int i = 1; i < N; i++) {
            output_arr[i] = nums[i-1] * output_arr[i-1];
        }
        //variable to handle all elements on the right
        int R = 1;
        for(int i = N - 1; i >= 0; i--) {
            output_arr[i] = output_arr[i] * R;
            //keep multiplying by current element
            R = R * nums[i];
        }
        return output_arr;
    }
}