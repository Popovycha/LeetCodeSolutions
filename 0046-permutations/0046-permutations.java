class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List <List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }
    private void permute(int [] nums, int start, List<List<Integer>> acc) {
        if (start == nums.length) {
            List<Integer> toAdd = new ArrayList<>();
            for (int num : nums) toAdd.add(num);
            acc.add(toAdd);
        } else {
            for (int i = start; i < nums.length; ++i) {
                swap(nums, start, i);
                permute(nums, start + 1, acc);
                swap(nums, start, i);
        }
    }
}
        private void swap(int[] nums, int i, int j) {
        int buf = nums[i];
        nums[i] = nums[j];
        nums[j] = buf;
    }
}