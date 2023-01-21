class Solution {
    //Complexity: Time:O(n * m * log m), Space(n * m)
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            //string to char array to sort the elements
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            //if there is no element with that type then add
            //else add with same anagram
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);    
        }
        //return list of list of map values
        return new ArrayList<>(map.values());
    }
}