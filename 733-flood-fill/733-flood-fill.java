class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) {
            return image;
        }
        
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }
    
    public void fill(int[][] image, int i, int j, int ThisColor, int color) {
        if( i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != ThisColor) {
            return;
        }
        
        image[i][j] = color;
        fill(image, i + 1, j, ThisColor, color);//down 
        fill(image, i - 1, j, ThisColor, color);//up
        fill(image, i, j + 1, ThisColor, color);//right
        fill(image, i, j - 1, ThisColor, color);//left
    }
}