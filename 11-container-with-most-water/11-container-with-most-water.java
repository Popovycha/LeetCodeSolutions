class Solution {
    public int maxArea(int[] height) {
        // // the total states is C(n, 2)= n * (n - 1) / 2, 
        // // we enumerate all these states to get the max area.
        // // BF time: O(n^2) space: O(1)
        // int len = height.length;
        // int max = 0;
        // for( int i = 0; i < len; i++) {
        //     for(int j = i + 1; j < len; j++) {
        //         int area = Math.min(height[i], height[j]) * (j - 1);
        //         max = Math.max(max, area);
        //     }
        // }
        // return max;
              
        // Two Pointers time: O(n) space: O(1)
        int len = height.length;
        int left = 0;
        int right = len - 1;
        
        int max = Math.min(height[left], height[right]) * (right - left);
        while(left < right) {
            // Move the shorter lines each time
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
            // update the max area
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
        }
        return max;
    }
}