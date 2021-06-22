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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        return traverseTree(root, new ArrayList<>());
        
    }
    
    private List<Integer> traverseTree(TreeNode root, List<Integer> holdingList) {
        if(root == null) return holdingList;
        holdingList.add(root.val);
        List<Integer> holdings=traverseTree(root.left, holdingList);
        return traverseTree(root.right, holdings);
    }
}