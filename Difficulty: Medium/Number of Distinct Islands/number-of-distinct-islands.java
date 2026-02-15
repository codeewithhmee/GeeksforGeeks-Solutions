// User function Template for Java

class Solution {
HashSet<List<Integer>> set=new HashSet<>();
    int countDistinctIslands(int[][] grid) {
           int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    List<Integer> shape = new ArrayList<>();
                    helper(grid, visited, shape, i, j, i, j);
                    set.add(shape); 
                }
            }
        }

        return set.size();
        
    }
     public void helper(int[][] grid, boolean[][] visited, List<Integer> store,
                       int x1, int y1, int cr, int cc) {
        int n = grid.length;
        int m = grid[0].length;

        // boundary & visited check
        if (cr < 0 || cr >= n || cc < 0 || cc >= m) return;
        if (grid[cr][cc] == 0 || visited[cr][cc]) return;

        visited[cr][cc] = true;

        // store coordinates relative to base
        store.add(cr - x1);
        store.add(cc - y1);

        // explore 4 directions
        helper(grid, visited, store, x1, y1, cr + 1, cc);
        helper(grid, visited, store, x1, y1, cr - 1, cc);
        helper(grid, visited, store, x1, y1, cr, cc + 1);
        helper(grid, visited, store, x1, y1, cr, cc - 1);
    }
}
