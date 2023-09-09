package sarkar.algo.matrix;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {

    // Better Solution
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int boxIndex = (i/3)*3+(j/3);
                if (board[i][j] != '.') {
                    if (!set.add("row"+i+board[i][j]) || !set.add("col"+j+board[i][j])
                            || !set.add("box"+boxIndex+board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudokuUsingHashMap(char[][] board) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int boxIndex = (i/3)*3+(j/3);
                if (board[i][j] != '.') {
                    if (map.containsKey("row"+i+board[i][j]) || map.containsKey("col"+j+board[i][j])
                        || map.containsKey("box"+boxIndex+board[i][j])) {
                        return false;
                    } else {
                        map.put("row"+i+board[i][j], 1);
                        map.put("col"+j+board[i][j], 1);
                        map.put("box"+boxIndex+board[i][j], 1);
                    }
                }
            }
        }
        return true;
    }

}
