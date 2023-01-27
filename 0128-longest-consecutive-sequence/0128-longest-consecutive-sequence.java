class Solution {
    //SPACE & TIME O(n)
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int longestStreak = 0;
        
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int currentNum = i;
                int currentStreak = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}