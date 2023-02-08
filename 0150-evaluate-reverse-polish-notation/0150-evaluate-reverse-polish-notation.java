class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String each : tokens) {
            switch(each) {
                case "+" : {
                    Integer operand2 = Integer.parseInt(stack.pop());
                    Integer operand1 = Integer.parseInt(stack.pop());
                    stack.push("" + (operand1 + operand2));
                    break;
                }
                case "-" : {
                    Integer operand2 = Integer.parseInt(stack.pop());
                    Integer operand1 = Integer.parseInt(stack.pop());
                    stack.push("" + (operand1 - operand2));
                    break;        
                }
                 case "*" : {
                    Integer operand2 = Integer.parseInt(stack.pop());
                    Integer operand1 = Integer.parseInt(stack.pop());
                    stack.push("" + (operand1 * operand2));
                    break;        
                }
                 case "/" : {
                    Integer operand2 = Integer.parseInt(stack.pop());
                    Integer operand1 = Integer.parseInt(stack.pop());
                    stack.push("" + (operand1 / operand2));
                    break;        
                }
                default : {
                    stack.push(each);
                }                  
            }
        }
        return Integer.parseInt(stack.pop());
    }
}