class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Integer>> columnMap = new HashMap<>();
        Map<Integer, HashSet<Integer>> squareMap = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            Set<Integer> rowSet = new HashSet<>();
            var row = board[i];
            for (int j = 0; j < row.length; j++) {
                if (Character.isDigit(row[j])) {
                    var number = Character.getNumericValue(row[j]);
                    if (!rowSet.add(number)) {
                        return false;
                    }
                    if (!columnMap.computeIfAbsent(j, k -> new HashSet<>()).add(number)) {
                        return false;
                    }
                    var rowBlock = i/3;
                    var colBlock = j/3;
                    var square = rowBlock * 3 + colBlock;
                    if (!squareMap.computeIfAbsent(square, k -> new HashSet<>()).add(number)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
