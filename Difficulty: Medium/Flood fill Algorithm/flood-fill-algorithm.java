class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // code here
        int n=image.length;
        int m=image[0].length;
        boolean[][] visited=new boolean[n][m];
        int oldColor=image[sr][sc];
        dfs(image,sr,sc,newColor,visited,oldColor);
        return image;
        
    }
    public static void dfs(int[][] image,int sr,int sc,int newColor,boolean[][] visited,int oldColor){
        if(sr>=image.length || sr<0 || sc>=image[0].length || sc<0 || image[sr][sc]!=oldColor || visited[sr][sc])return;
        if(image[sr][sc]==oldColor){
            image[sr][sc]=newColor;
            visited[sr][sc]=true;
        
        }
        dfs(image,sr-1,sc,newColor,visited,oldColor);
        dfs(image,sr+1,sc,newColor,visited,oldColor);
        dfs(image,sr,sc-1,newColor,visited,oldColor);
        dfs(image,sr,sc+1,newColor,visited,oldColor);
    }
}