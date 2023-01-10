class Solution {
    public boolean wordPattern(String pattern, String s) {
        // array to store diff words
        String [] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        // store each char as word
        Map<Character, String> map = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++) {
            // get current char from pattern
            char current_char = pattern.charAt(i);
            // if we find the current character in the map so, 
            // we check if the word of current index is same as we store in map or not
            // if both words are not match so we can return false.
            if(map.containsKey(current_char)) {
                if(!map.get(current_char).equals(words[i])) {
                    return false;
                }
            } else {
                // if current character is not stored in map but current word is stored. 
                // it's means current word is value of some other character
                if(map.containsValue(words[i])) {
                    return false;
                }
                // not found in the map, then put character as key and value as word at current index
                map.put(current_char, words[i]);
            }
        }
        return true;
    }
}