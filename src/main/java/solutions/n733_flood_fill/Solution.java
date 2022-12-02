package solutions.n733_flood_fill;

/**
 * @author : Sobornov Vladimir
 * @since : 01.12.2022
 **/
class Solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int baseColor = image[sr][sc];
        boolean[][] visited = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, baseColor, color, visited);
        return image;
    }

    public static void dfs(int[][] image, int sr, int sc, int baseColor, int newColor, boolean[][] visited) {
        int srMax = image.length - 1;
        int scMax = image[0].length - 1;
        if (sr < 0 || sc < 0 || sr > srMax || sc > scMax || visited[sr][sc] || image[sr][sc] != baseColor) {
            return;
        }

        visited[sr][sc] = true;
        image[sr][sc] = newColor;

        dfs(image, sr + 1, sc, baseColor, newColor, visited);
        dfs(image, sr, sc + 1, baseColor, newColor, visited);
        dfs(image, sr - 1, sc, baseColor, newColor, visited);
        dfs(image, sr, sc - 1, baseColor, newColor, visited);
    }
}


