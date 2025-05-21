class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) return 0

        var numOfIslands: Int = 0

        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if(grid[i][j] == '1') {
                    numOfIslands++
                    dfs(grid ,i ,j)
                }
            }
        }
        return numOfIslands
    }

    fun dfs(grid: Array<CharArray>, i: Int, j: Int): Int {
        if ( i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == '0') return 0

        grid[i][j] = '0'
        dfs(grid, i + 1, j)
        dfs(grid, i - 1, j)
        dfs(grid, i, j + 1)
        dfs(grid, i, j - 1)

        return 1
    }
}

    
