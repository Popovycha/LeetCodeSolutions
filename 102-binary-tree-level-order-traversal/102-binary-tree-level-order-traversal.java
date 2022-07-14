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
        //declare return value
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        
        //Queue FIFO
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            //how many tree node we need to process
            int size = queue.size();
            //for every level, we make list of all node values
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                //get current node thst we need to process
                TreeNode current = queue.remove();
                currentLevel.add(current.val);
                
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }
            //add list to ArrayList
            result.add(currentLevel);
        }
        return result;
    }
}