class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums) {
            if(map.containsKey(i) && map.get(i) + 1 > nums.length / 2) { //if num occured & more that 2 times
                return i;
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1); //hasn't occured, occured once $ add one to it
            }
        }
        return -1;
    }
}