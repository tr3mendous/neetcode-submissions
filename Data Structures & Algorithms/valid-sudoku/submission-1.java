class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
        Set<Character> row = new HashSet<>();
        Set<Character> column = new HashSet<>();
           for (int j = 0; j < 9; j++) {
            if (board[i][j] != '.' && !row.add(board[i][j])){
                return false;
            }
            if (board[j][i] != '.' && !column.add(board[j][i])){
                return false;
            }
           }
        }
        for (int s = 0; s < 9; s++) {
            Set<Character> square = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (s / 3) * 3 + i;
                    int col = (s % 3) * 3 + j;
                    if (board[row][col] != '.' && !square.add(board[row][col])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
