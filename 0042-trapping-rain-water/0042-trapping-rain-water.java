class Solution {
    public int trap(int[] height) {
        int max = 0, n = height.length;
        //scan to find index of max
        for(int i = 0; i < n; i++) {
            if(height[max] < height[i]) {
                max = i;
            }
        }
        //start from Left Side
        int sum = 0;
        int LeftMax = 0;
        for(int i = 0; i < max; i++) {
            if(height[LeftMax] < height[i]) {
                LeftMax = i;
            }
            //how many water untis we have for up to this current position
            sum += Math.min(height[LeftMax], height[max]) - height[i];
        }
        //Right Side
        int RightMax = n - 1;
        for(int i = n - 1; i > max; i--) {
            if(height[RightMax] < height[i]) {
                RightMax = i;
            }
            //new sum for the current position
            sum += Math.min(height[max], height[RightMax]) - height[i];
        }
        return sum;
    }
}