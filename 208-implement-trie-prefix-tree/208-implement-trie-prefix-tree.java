class TrieNode {
    boolean isWord;
    TrieNode[] children = new TrieNode[26];
}

class Trie {
    
    TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        //node to go thru
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++) {
            //checks wether does exist at this level
            if(node.children[word.charAt(i) - 'a'] == null) {
                //if doesn't exist,we create new
                node.children[word.charAt(i) - 'a'] = new TrieNode();
            }
            //assign new trie tree node to build up trie tree branch
            node = node.children[word.charAt(i) - 'a'];
        }
        node.isWord = true; //mark as it true 
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++) {
            //checks wether does exist at this level
            if(node.children[word.charAt(i) - 'a'] == null) {
            return false;
            }
            //continue to search down of the tree
            node = node.children[word.charAt(i) - 'a'];
        }
        return node.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i = 0; i < prefix.length(); i++) {
            if(node.children[prefix.charAt(i) - 'a'] == null) {
                return false;
            }
            //continue to search down of the tree
            node = node.children[prefix.charAt(i) - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */