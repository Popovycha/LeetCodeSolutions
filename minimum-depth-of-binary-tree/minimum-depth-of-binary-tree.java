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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
         else 
            return getMinDepth(root);
        }
        
      private int getMinDepth(TreeNode node) {
          if(node == null) return Integer.MAX_VALUE;
      if(node.left == null && node.right == null) return 1;
          return Math.min(getMinDepth(node.left), getMinDepth(node.right)) +1;
      }   
}