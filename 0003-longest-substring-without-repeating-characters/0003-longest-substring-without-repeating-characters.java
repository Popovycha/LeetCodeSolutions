class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Time: O(n) Space: O(n)
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}