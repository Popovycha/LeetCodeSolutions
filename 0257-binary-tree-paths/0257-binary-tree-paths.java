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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        DFS(root, "", list);
        return list;
    }
    public void DFS(TreeNode root, String solution, ArrayList<String> list) {
        if(root == null) return;
        
        if(root.left == null && root.right == null) list.add(solution + root.val);
        DFS(root.left, solution + root.val + "->", list);    	
        DFS(root.right, solution + root.val + "->", list);
    }
}