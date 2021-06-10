class Solution {
    public boolean isValid(String s) {
          Map<Character, Character> mapping = new HashMap<>();
        mapping.put(']', '[');
        mapping.put(')', '(');
        mapping.put('}', '{');
        
        Stack<Character> stack = new Stack<>();
        
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (mapping.containsKey(c)) {
                if (stack.isEmpty() || !stack.pop().equals(mapping.get(c))) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}