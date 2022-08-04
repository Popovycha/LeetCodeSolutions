class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //sort, recursive function
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, 0, target, new ArrayList<Integer>(), result);
        
        return result;
    }
    
    public void findCombinations(int[] candidates,int index, int target, List<Integer> current,List<List<Integer>> result) {
        //check condition what we look for
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0) {
            return;
        }
        //dfs
        for(int i = index; i < candidates.length; i++) {
            //check for duplicates
            if(candidates[i] <= target) {
                current.add(candidates[i]);
                //recursive call
                findCombinations(candidates, i, target - candidates[i], current, result);
                current.remove(new Integer(candidates[i]));
            }
        }
    }
    
}