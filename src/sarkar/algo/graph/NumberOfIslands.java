package sarkar.algo.graph;

public class NumberOfIslands {

    private static void markCurrentIsland(char[][] grid, int i, int j, int rows, int cols) {
        if (i<0 || i>=rows || j<0 || j>= cols || grid[i][j] != '1') // Boundary checks
            return;

        // Mark current cell as visited
        grid[i][j] = '2';

        // Make recursive call in all 4 adjacent directions
        markCurrentIsland(grid,i+1,j,rows,cols); // Down
        markCurrentIsland(grid,i,j+1,rows,cols); // Right
        markCurrentIsland(grid,i-1,j,rows,cols); // Top
        markCurrentIsland(grid,i,j-1,rows,cols); // Left
    }

    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        if (rows == 0) return 0;

        int cols = grid[0].length;
        int numOfIsland = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    markCurrentIsland(grid, i, j, rows, cols);
                    numOfIsland += 1;
                }
            }
        }
        return numOfIsland;
    }

    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '0', '0', '0'},
                         {'1', '1', '0', '0', '0'},
                         {'0', '0', '1', '0', '0'},
                         {'0', '0', '0', '1', '1'}};

        System.out.println(numIslands(grid));
    }

}
