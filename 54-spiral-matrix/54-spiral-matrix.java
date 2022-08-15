class Solution {
    //Time O(n)
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> nums = new ArrayList<>();
        if(matrix == null || matrix.length == 0) {
            return nums;
        }
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        //variable to know when we reach that limit
        int size = matrix.length * matrix[0].length;
        
        while( nums.size() < size) {
            //first row => 1 -> 3
            for (int i = left; i <= right && nums.size() < size; i++) {
                nums.add(matrix[top][i]);
            } 
            top++;
            //traverse top column to bottom column => 3 -> 9
            for (int i = top; i <= bottom && nums.size() < size; i++) {
                nums.add(matrix[i][right]); //make sure that we stay right most column
            }
            right--; //scoot our right pointer over one (to avoid double counting (9))
            //traverse 9 -> 7
            for (int i = right; i >= left && nums.size() < size; i--) {
                nums.add(matrix[bottom][i]);
            }
            bottom--;
            //traverse 7 -> 4
            for (int i = bottom; i >= top && nums.size() < size; i--) {
                nums.add(matrix[i][left]);
            }
            left++;
        }
        return nums;
    }
}