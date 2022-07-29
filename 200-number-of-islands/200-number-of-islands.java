class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        //BFS
        int numOfIslands = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands += 1;
                    callBFS(grid, i , j);
                }
            }
        }
        return numOfIslands;
    }
    
    public void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') //boundary check
            return;
        grid[i][j] = '0'; //if see the 1 ,we set all 1 to 0
        callBFS(grid, i + 1, j); //up
        callBFS(grid, i - 1, j); //down
        callBFS(grid, i , j - 1); //left
        callBFS(grid, i , j + 1); //right
    }
}