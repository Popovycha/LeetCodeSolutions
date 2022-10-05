class Solution {
    
    private int start,length;
    
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        for (int i = 0; i < s.length() -1; i++) {
            //checking string in palindrome string 
            checkPalindrome(i, i, s); // for odd index
            checkPalindrome(i, i + 1, s);//for even index;

        }
        return s.substring(start, start + length);
        
    }
    
    //start from mid then one pointer move backward and another move forward 
    //It's check char at backward or forward are same then it would be palindrome
    private void checkPalindrome(int backward, int forward, String s) {
        while (backward >= 0 && forward < s.length() &&
               s.charAt(backward) == s.charAt(forward)) {
            backward--;
            forward++;
        }
        if (length < forward - backward - 1){
            start = backward + 1;
            length = forward - backward - 1;
        }
    }
}