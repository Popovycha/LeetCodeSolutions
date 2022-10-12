class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> output = new LinkedList<>();
        if(digits.length() == 0) return output;
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        // Recursive Function 
        recursiveFunction(output, digits, "", 0, mapping);
        return output;
    }
    
    public void recursiveFunction(List<String> output, String digits, String current, int index, String[] mapping){
         // base case, if the index reaches the end of the String digits, then add the current String to the output
         if(index == digits.length()){
             output.add(current);
             return;
         }
         // This string will keep the numeric values of the string numbers
         String letters = mapping[digits.charAt(index) - '0'];
         for(int i = 0; i < letters.length(); i++){
             // just increments index and add the current letter to the string
             recursiveFunction(output, digits, current + letters.charAt(i), index + 1, mapping);
         }
     }
}