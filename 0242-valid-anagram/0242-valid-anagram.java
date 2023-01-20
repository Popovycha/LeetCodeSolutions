class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
        
        Map<Character,Integer>map1 = new HashMap<Character,Integer>();
        Map<Character,Integer>map2 = new HashMap<Character,Integer>();
        for(Character ch:s.toCharArray())   map1.put(ch,map1.getOrDefault(ch,0)+1);
        for(Character ch:t.toCharArray())   map2.put(ch,map2.getOrDefault(ch,0)+1);
        return map1.equals(map2);        
    }
}