class Solution {
    //Complexity: Space: O(n), Time - O(n).
    //Loop on both strings, for each character in s check if it's already in the Map. 
    //if it is, check if the value in the map equals the character in t. 
    //If it's not, so the strings are not isomorphic.
    //If the character from s is not in the Map, add it with the character in t as its value.
    public boolean isIsomorphic(String s, String t) {
        Map <Character, Character> mapping_st = new HashMap<>(); //s - key ,t - value
        Set <Character> set = new HashSet<>();
        if(s == null) return true;
    
        for(int i = 0; i < s.length(); i++) {
            if(mapping_st.containsKey(s.charAt(i))) {
                if(mapping_st.get(s.charAt(i)) != t.charAt(i)) 
                    return false;
                } else {
                    if(set.contains(t.charAt(i))) return false;
                    mapping_st.put(s.charAt(i), t.charAt(i));
                    set.add(t.charAt(i));
                }
                
            }
        return true;
    }
}