package solutions.n200_number_of_islands;

/**
 * @author : Sobornov Vladimir
 * @since : 02.12.2022
 **/
class Solution {
    public static int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, i, j, visited);
                    islands++;
                }
            }
        }
        return islands;
    }

    private static void dfs(char[][] grid, int sr, int sc, boolean[][] visited) {
        int srMax = grid.length - 1;
        int scMax = grid[0].length - 1;
        if (sr < 0 || sc < 0 || sr > srMax || sc > scMax || grid[sr][sc] != '1' || visited[sr][sc]) {
            return;
        }

        visited[sr][sc] = true;
        dfs(grid,sr + 1, sc, visited);
        dfs(grid,sr, sc + 1, visited);
        dfs(grid,sr - 1, sc, visited);
        dfs(grid,sr, sc - 1, visited);
    }
}
