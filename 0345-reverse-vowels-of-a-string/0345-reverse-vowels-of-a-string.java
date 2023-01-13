class Solution {
    //Complexity: Space: O(1) Time: O(n)
    public String reverseVowels(String s) {
        //two pointer
        int left = 0;
        int right = s.length() - 1;
        
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] chars = s.toCharArray();
        while (left<=right) {
            if (set.contains(chars[left]) && set.contains(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] =temp;
                right--;
                left++;
            } else if(!set.contains(chars[left])) {
                left++;
            } else if(!set.contains(chars[right])) {
                right--;
            }           
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            builder.append((char)chars[i]);
            }
            return builder.toString();        
    }
}