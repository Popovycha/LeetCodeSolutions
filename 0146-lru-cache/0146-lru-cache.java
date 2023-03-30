class LRUCache {
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer,Node> node_Map = new HashMap<>();
    int casheCapacity;

    public LRUCache(int capacity) {
        node_Map = new HashMap(capacity);
        this.casheCapacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int result = -1;
        Node node = node_Map.get(key);
        
        if(node != null) {
            result = node.val;
            remove(node);
            add(node);
        }
        return result;
    }
    
    public void put(int key, int value) {
        Node node = node_Map.get(key);
        if (node != null) {
            remove(node);
            node.val = value;
            add(node);
        } else {
            if (node_Map.size() == casheCapacity) {
                node_Map.remove(tail.prev.key);
                remove(tail.prev);
            }
            
            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;
            
            node_Map.put(key, new_node);
            add(new_node);
        }
    }
    
    public void add(Node node) {
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;  
        head.next = node;
        node.prev = head;
    }
    
    public void remove(Node node) {
        Node next_node = node.next;
        Node prev_node = node.prev;
        
        next_node.prev = prev_node;
        prev_node.next = next_node;
    }
    
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */