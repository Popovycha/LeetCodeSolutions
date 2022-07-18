/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
      //dfs  
      //time: O(n) space: O(n)
      if (node == null) return null;
        Map<Integer, Node> map = new HashMap<>();
        return cloneGraph(node, map);
    }
    //each call of cloneGraph,creating a new copy of the node we focus on, if it has not been created
    private Node cloneGraph(Node node, Map<Integer, Node> map) {
        //check if node in our map
        if(map.containsKey(node.val)) return map.get(node.val); //return copy node inside of the map
        //create node
        Node copy = new Node(node.val);
        map.put(node.val, copy);
        for (Node neighbor : node.neighbors) copy.neighbors.add(cloneGraph(neighbor, map));
        return copy;
    }
}