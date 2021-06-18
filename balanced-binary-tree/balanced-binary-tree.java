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
    public boolean isBalanced(TreeNode root) {
        ans = true;
        height(root);
        return ans;
    }
    
    boolean ans = true; // checks for the blanace of subtrees
    
    public int height(TreeNode root) {
        if(ans == false) return -1;
        
        if(root == null) return 0;
        
        int lans = height(root.left);
        int rans = height(root.right);
        
        if(ans) {
            if(Math.abs(lans - rans) > 1) ans = false;
        }
        return Math.max(lans, rans) + 1;
            
    }
}