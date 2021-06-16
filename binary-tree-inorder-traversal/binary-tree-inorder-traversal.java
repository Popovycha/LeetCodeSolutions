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
    public List<Integer> inorderTraversal(TreeNode root) {
        
     if(root == null)
        {
            List<Integer> temp = new ArrayList<>();;
            return temp;
        }
        List<Integer> result = new ArrayList<>();
        List<Integer> leftSide = inorderTraversal(root.left);
        
        if(leftSide!=null)
            result.addAll(leftSide);
        result.add(root.val);
        List<Integer> rightSide = inorderTraversal(root.right);
        if(rightSide!=null)
            result.addAll(rightSide);
        return result;
    }
}