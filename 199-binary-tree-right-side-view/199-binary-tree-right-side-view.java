/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int size = 0;
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new LinkedList<Integer>();
        if(root == null)  return answer;
        rightSide(root, answer, 0);
        return answer;
    }
        //Going to left nodes first (creation of the places in the list)
        //reaching right nodes after, checking if this level exists in the list
        //then replace it by the right node (right side view)
        public void rightSide(TreeNode root, List<Integer> answer ,int level) {
            if (level < size) {
                answer.set(level, root.val);
            } else {
                answer.add(root.val);
                size++;
            }
            if (root.left != null) 
                rightSide(root.left, answer, level+1);       
            if (root.right != null) 
                rightSide(root.right, answer, level+1);
                
    }
}