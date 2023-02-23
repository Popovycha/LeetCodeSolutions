class Solution {
    public int characterReplacement(String s, int k) {
        int[] char_counts = new int[26];
        int ans = 0;
        int max_count = 0; //the number of repeating character
        int start = 0; 
        for(int end = 0; end < s.length(); end++) {
            //adding to sub-array
            char_counts[s.charAt(end) - 'A']++;
            int current_char_count = char_counts[s.charAt(end) - 'A'];
            // the maximum frequency we have seen in any window yet
            max_count = Math.max(max_count, current_char_count);
            
            while (end - start + 1 - max_count > k) {
                //decrement front count
                char_counts[s.charAt(start) - 'A']--; 
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}