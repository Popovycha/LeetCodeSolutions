class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        //Making a visited array to mark a cell visited. 
        boolean[][] visited = new boolean[row][col];
        //First character of given word.
        char firstChar = word.charAt(0);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                //if char at (i,j) in board is equal to firstChar and the word exists in the board, then return true.
                if (board[i][j] == firstChar && searchWord(board, i, j, 0, word, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean searchWord(char[][] board, int i, int j, int index, String word, boolean[][] visited) {
        //if index is equal to length of word, meaning word is found in the board, so return true.
        if (index == word.length()) {
            return true;
        }
        
        //if we go out of bounds(first 4 conditions) or char at (i,j) in board is not equal to char at index in word(fifth condition) 
		//or the cell is already visited(sixth condition), then return false.
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }
        //Mark the cell visited.
        visited[i][j] = true;
        
        //if the word is found by going to top, left, bottom or right cell, then return true.
        if (searchWord(board, i - 1, j, index + 1, word, visited) || searchWord(board, i, j - 1, index + 1, word, visited) || 
		searchWord(board, i + 1, j, index + 1, word, visited) || searchWord(board, i, j + 1, index + 1, word, visited)) {
            return true;
        }
        
        //Mark the cell unvisited.
        visited[i][j] = false;
        
        return false;
    }
}