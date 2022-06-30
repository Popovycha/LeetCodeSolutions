class Solution {
    public int longestPalindrome(String s) {
        int[] char_counts = new int[128];
        for(char c : s.toCharArray()) {
            char_counts[c]++; //counting how many occurences of each char
        }
        
        int result = 0;
        for(Integer char_count : char_counts) { 
            result += char_count / 2 * 2; //to make sure we have pairs 
            if(result % 2 == 0 && char_count % 2 == 1) { //char_counts need to have unique char in the middle
                result += 1;
            }
        }
        return result;
    }
}