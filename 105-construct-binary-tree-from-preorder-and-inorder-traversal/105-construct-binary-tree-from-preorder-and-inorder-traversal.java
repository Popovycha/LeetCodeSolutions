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
    
    int inorderIndex, preorderIndex;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = inorderIndex = 0;
        
        return dfs(preorder, inorder, 3001);
    }
    private TreeNode dfs(int[] preorder, int[] inorder, int rightBoundary) {
      if (preorderIndex == preorder.length || inorder[inorderIndex] == rightBoundary) return null;

      TreeNode node = new TreeNode(preorder[preorderIndex++]);
      node.left  = dfs(preorder, inorder, node.val);
      inorderIndex++;
      node.right = dfs(preorder, inorder, rightBoundary);
      return node;
   }
}
//we use preorder to create nodes from left to right, whenever we go left, we need to pass current root value as right boundary for it's whole left sub tree(root has no boundary, so used 3001 as valid nodes are from 1-3000, you could use Integer.MAX_VALUE), so that the left sub tree creation will know when to exit to go right subtree, the right bounary of right subtree is right subtree's parent's parent which was passed in.

