package solutions.n695_max_area_of_Island;

/**
 * @author : Sobornov Vladimir
 * @since : 16.12.2022
 **/
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxResult = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxResult = Math.max(dfs(grid, i ,j), maxResult);
            }
        }

        return maxResult;

    }

    private int dfs(int[][] grid, int x, int y) {
        if (x >= 0 && x <= grid.length - 1 && y >= 0 && y <= grid[0].length - 1 && grid[x][y] == 1) {
            grid[x][y] = 0;
            return 1 + dfs(grid, x + 1, y) + dfs(grid, x, y + 1) + dfs(grid, x - 1, y) + dfs(grid, x, y - 1);
        }
        return 0;


    }
}
