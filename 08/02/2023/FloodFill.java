class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        int color = image[sr][sc];
        if(color==newcolor)
            return image;
        int row = image.length;
        int col = image[0].length;
        dfs(image,sr,sc,color,newcolor);
        return image;
    }
    public void dfs(int[][] image, int row,int col,int color, int newcolor){
        if(row<0 || col<0 || row>=image.length || col>=image[0].length || image[row][col]!=color)
        return ;        
     image[row][col]=newcolor;
     dfs(image, row,col-1,color,newcolor);
     dfs(image,row, col+1,color,newcolor);
     dfs(image,row-1,col,color,newcolor);
     dfs(image,row+1,col,color,newcolor);
        
        
    }
}
