class Solution {
    public int[][] updateMatrix(int[][] mat) {
        //new matrix to store result
        int[][] distances = new int[mat.length][mat[0].length];
        //calculate max possible distance
        int maxPossibleDistance = mat.length - 1 + mat[0].length - 1;
        //solving dynamic
        //1. itterate thru matrix top to bottom, left to right
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != 0) {
                   int upCell = (i > 0) ? distances[i - 1][j] : maxPossibleDistance;
                   int leftCell = (j > 0) ? distances[i][j - 1] : maxPossibleDistance;
                    //update current value
                    distances[i][j] = Math.min(upCell, leftCell) + 1;
                }
            }            
        }
        
        //2. itterate bottom to top, right to left
        for(int i = mat.length - 1; i >= 0; i--) {
            for(int j = mat[0].length - 1; j >= 0; j--) {
                if(mat[i][j] != 0) {
                    int downCell = (i < mat.length - 1) ? distances[i + 1][j] : maxPossibleDistance;
                    int rightCell = (j < mat[0].length - 1) ? distances[i][j + 1] : maxPossibleDistance;
                    distances[i][j] = Math.min(Math.min(downCell, rightCell) + 1, distances[i][j]);
                }        
            }
        }
        return distances;
    }
}