class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //    Time: O(log(mn)) | Space: O(1)    
        if (matrix.length == 0) return false;

        int rows = matrix.length;
        int columns = matrix[0].length;
        //binary search
        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_point = matrix[mid/columns][mid%columns]; //number of rows & position
            if(mid_point == target) {
                return true;
            } else if (target < mid_point) {
                right = mid - 1;
            } else if (target > mid_point) {
                left = mid + 1;
            }
        }
        return false;
    }
}