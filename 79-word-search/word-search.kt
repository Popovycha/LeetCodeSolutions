class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (dfs(board, word, i,j, 0) ) return true
            }
        }
        return false
    }

    private fun dfs(
        board: Array<CharArray>,
        word: String,
        i: Int,
        j: Int,
        index: Int) : Boolean {
            //if the index match
            if (word.length == index) return true
            //if row,column out of bound or 
            //current word char doesnt match board char
            if (i !in board.indices || j !in board[0].indices 
            || board[i][j] != word[index]) return false

            //temp storing current character
            val temp = board[i][j]
            //mark as visited
            board[i][j] = '#'

            val found = dfs(board, word, i + 1, j, index + 1) ||
            dfs(board, word, i - 1, j, index + 1) ||
            dfs(board, word, i, j + 1, index + 1) ||
            dfs(board, word, i, j - 1, index + 1)
            //After searching all dir, restore the original character  
            //in the board to allow other paths to use it later.
            board[i][j] = temp
            return found
        }
        
}
