class Solution {
    public List<String> generateParenthesis(int n) {
        //Time O(n), Space O(n) where n is recursive stack
        List<String> list = new ArrayList<>();
        addParenthesis(0, 0, n, "", list);
        return list;
    }
    
    private void addParenthesis(int left, int right, int n, String s, List<String> list) {
        if(s.length() == n * 2) { //any parenthesis need a pair
            list.add(s);
        }
        if(left < n) {
            addParenthesis(left+1, right, n, s+"(", list);
        }
        if(right < left) {
            addParenthesis(left, right+1, n, s + ")", list);
        }

    }
}