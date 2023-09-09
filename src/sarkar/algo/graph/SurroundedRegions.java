package sarkar.algo.graph;

public class SurroundedRegions {

    static boolean seen;
    public static void solve(char[][] board) {
        int r = board.length;
        if (r <= 1) return;
        int c = board[0].length;
        if (c<=1) return;

        boolean[][] visited = new boolean[r][c];

        for (int i = 1; i < r-1; i++) {
            for (int j = 1; j < c-1; j++) {
                if (board[i][j]=='0' && !visited[i][j]) {
                    seen=false;
                    dfs(board,i,j,r,c,visited);
                    if (!seen) {
                        mark(board,i,j,r,c);
                    }
                    seen=true;
                }
            }
        }
    }

    private static void mark(char[][] board, int i, int j, int r, int c) {
        if (i<0 || i>r-1 || j<0 || j>c-1)
            return;
        if (board[i][j]=='X')
            return;
        board[i][j] = 'X';
        mark(board,i-1,j,r,c);
        mark(board,i+1,j,r,c);
        mark(board,i,j-1,r,c);
        mark(board,i,j+1,r,c);
    }

    private static void dfs(char[][] board, int i, int j, int r, int c, boolean[][] visited) {
        if (i<0 || i>r-1 || j<0 || j>c-1)
            return;
        if (board[i][j]=='X' || visited[i][j])
            return;
        if (i<=0 || i>=r-1 || j<=0 || j>=c-1)
            seen = true;
        visited[i][j] = true;
        dfs(board,i-1,j,r,c,visited);
        dfs(board,i+1,j,r,c,visited);
        dfs(board,i,j-1,r,c,visited);
        dfs(board,i,j+1,r,c,visited);
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
