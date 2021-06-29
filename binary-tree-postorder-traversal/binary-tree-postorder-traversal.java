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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        helperPostOrder(root, list);
        return list;
    }
    private static void helperPostOrder(TreeNode root, List<Integer> list) {
        if(root.left!=null)
            helperPostOrder(root.left,list);
        if(root.right!=null)
            helperPostOrder(root.right,list);
        list.add(root.val);
    }
}