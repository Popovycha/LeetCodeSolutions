class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(result, nums, new ArrayList<>());
        return result;
    }
    public void permutation(List<List<Integer>> result,int[] nums, List<Integer> temp) {
        // if the size of the temp list is same as array, we have complete that one
        if(temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        } else {
            for(int i = 0; i < nums.length; i++) {
                // if temp list already contains the element, let's continue
                if(temp.contains(nums[i])) continue;
                
                // else we will add it
                if(temp.add(nums[i]));
                
                //backtracking
                permutation(result,nums,temp);
                
                //removing the last element to continue the order
                temp.remove(temp.size()-1);
            }
        }
    }
}