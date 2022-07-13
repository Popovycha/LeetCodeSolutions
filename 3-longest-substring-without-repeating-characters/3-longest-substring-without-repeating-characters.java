class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointer_a = 0;
        int pointer_b = 0;
        int max = 0;
        
        HashSet<Character> hash_set = new HashSet();
        
        while(pointer_b < s.length()) {
            if(!hash_set.contains(s.charAt(pointer_b))) {
                hash_set.add(s.charAt(pointer_b));
                pointer_b++;
                max = Math.max(hash_set.size(), max);
            } else {
                hash_set.remove(s.charAt(pointer_a));
                pointer_a++;
            }
        }
        return max;
    }
}