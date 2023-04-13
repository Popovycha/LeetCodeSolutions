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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        return rightOrder(root, res, 0);
    }
    
    public List<List<Integer>> rightOrder(TreeNode node, List<List<Integer>> res, int depth) {
        if (node == null) return res;
        if (res.size() == depth) {
            res.add(new LinkedList <Integer>());
        }
        res.get(depth).add(node.val);
        depth++;
        rightOrder(node.left, res, depth);
        rightOrder(node.right, res, depth);
        return res;
    }
}