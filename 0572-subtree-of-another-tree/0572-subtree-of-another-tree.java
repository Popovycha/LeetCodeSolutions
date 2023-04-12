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
    private boolean isSame(TreeNode r1, TreeNode r2) {
        if(r1==null && r2==null) {
            return true;
        }
        if(r1==null || r2==null) {
            return false;
        }
        if(r1.val == r2.val) {
            return isSame(r1.left, r2.left) && isSame(r1.right, r2.right);
        }
        else {
            return false;
        }
        
    }
    private boolean helper(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            if(subRoot == null)  return true;
            return false;
        }
        if(root.val==subRoot.val) {
            if(isSame(root, subRoot)) {
                return true;
            }
            else {
                boolean left = helper(root.left, subRoot);
                boolean right = helper(root.right, subRoot);
                return left || right;
            }
        }else {
            boolean left = helper(root.left, subRoot);
            boolean right = helper(root.right, subRoot);
            return left || right;
        }
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       return helper(root, subRoot);

    }
}
