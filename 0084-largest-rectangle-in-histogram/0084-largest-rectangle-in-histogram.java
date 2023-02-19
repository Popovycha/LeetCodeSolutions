class Solution {
    public int largestRectangleArea(int[] heights) {
        //Complexity Space O(n), Time O(n)
        int area = 0, n = heights.length;
        int start;
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        for(int i = 0; i < heights.length; i++) {
            int currentHeight = heights[i];
            start = i;
            while(!stack.isEmpty() && stack.peek().getValue() > currentHeight) {
                Pair<Integer,Integer> pair = stack.pop();
                int index = pair.getKey();
                int h = pair.getValue();
                area = Math.max(area, h * (i - index));
                start = index;
            }
            stack.push(new Pair(start,currentHeight));
        }
         while(!stack.isEmpty()) {
             Pair<Integer,Integer> pair = stack.pop();
             int index = pair.getKey();
             int h = pair.getValue();
             area = Math.max(area, h * (n - index));
         }
        return area;
    }
}