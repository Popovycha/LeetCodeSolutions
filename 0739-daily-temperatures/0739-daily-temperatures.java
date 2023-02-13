class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //Space: o(n) Time: o(n)
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
}
/**The first step is to initialize an array ans with the same length as the input array, temperatures, to store the result. We also initialize an empty stack stack.
We start iterating through the input array temperatures in reverse order, from the last element to the first. This is done using a for loop with i starting at temperatures.length - 1 and ending at 0. The reason we iterate in reverse order is that we need to find the next warmer temperature that comes after the current temperature. By iterating in reverse order, we are essentially working backwards from the end of the array and this allows us to keep track of the next warmer temperature that comes after the current temperature.
For each iteration, we first check if the stack is not empty and the temperature at the current index is greater than or equal to the temperature at the index at the top of the stack. If the condition is true, we pop the top element of the stack. This is because, the element at the top of the stack has a temperature that's equal or less than the current temperature, and we are looking for a next warmer temperature, so we can discard that element.  **/