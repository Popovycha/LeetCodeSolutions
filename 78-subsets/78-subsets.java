 // Backtracking (Recursion)
 // Time Complexity: O(N * 2 ^ N) Refer to above explanation
 // Space Complexity: O(N) (Recursion Depth + TempList)
 // N = Length of input nums array
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }

        subsetsHelper(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void subsetsHelper(int[] nums, int start, List<Integer> temp, List<List<Integer>> result) {
        result.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            subsetsHelper(nums, i + 1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}