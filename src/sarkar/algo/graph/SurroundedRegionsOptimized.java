package sarkar.algo.graph;

public class SurroundedRegionsOptimized {
    public static void solve(char[][] board) {
        int row = board.length;
        if (row == 0) return;
        int col = board[0].length;

        //first col & last col
        for (int i=0; i<row; i++) {
            dfs(board, i, 0);
            dfs(board, i, col-1);
        }
        //first row & last row
        for (int j=1; j<col-1; j++) {
            dfs(board, 0, j);
            dfs(board, row-1, j);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '0')
                    board[i][j] = 'X';
                else if (board[i][j] == '1')
                    board[i][j] = '0';

            }
        }

    }

    private static void dfs(char[][] board, int i, int j) {
        if (board[i][j] == '0') {
            board[i][j] = '1';

            if (i+1 < board.length) dfs(board, i+1, j);
            if (i > 1) dfs(board, i-1, j);
            if (j+1 < board[i].length) dfs(board, i, j+1);
            if (j > 1) dfs(board, i, j-1);
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'X','X','X','X'},
                          {'X','0','0','X'},
                          {'X','X','0','X'},
                          {'X','0','X','X'}};
        solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
