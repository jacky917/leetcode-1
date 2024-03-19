package questions.q36;

/**
 * 2024.03.19
 */
class Solution240319 {

    // chatGPT 整理後
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9]; // Track digits in rows
        boolean[][] col = new boolean[9][9]; // Track digits in columns
        boolean[][] box = new boolean[9][9]; // Track digits in boxes

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (board[y][x] != '.') {
                    int num = board[y][x] - '1'; // Convert char to index (0-8)
                    int boxIndex = (y / 3) * 3 + x / 3; // Calculate box index

                    if (row[y][num] || col[x][num] || box[boxIndex][num]) {
                        return false; // If digit is already seen in row, column, or box
                    }
                    row[y][num] = col[x][num] = box[boxIndex][num] = true; // Mark the digit as seen
                }
            }
        }
        return true; // No conflicts found, sudoku is valid
    }

//    public boolean isValidSudoku(char[][] board) {
//        boolean[][] row = new boolean[9][9];
//        boolean[][] col = new boolean[9][9];
//        boolean[][] box = new boolean[9][9];
//
//        for(int y = 0; y < board.length; y ++) {
//            for(int x = 0; x < board[0].length; x ++) {
//                if(board[y][x] != '.') {
//                    int cur = board[y][x] - '1';
//                    if(row[y][cur]) return false;
//                    else row[y][cur] = true;
//
//                    if(col[x][cur]) return false;
//                    else col[x][cur] = true;
//
//                    if(x < 3) {
//                        if(y < 3) {
//                            if(box[0][cur]) return false;
//                            else box[0][cur] = true;
//                        } else if (y < 6) {
//                            if(box[1][cur]) return false;
//                            else box[1][cur] = true;
//                        } else {
//                            if(box[2][cur]) return false;
//                            else box[2][cur] = true;
//                        }
//                    } else if (x < 6) {
//                        if(y < 3) {
//                            if(box[3][cur]) return false;
//                            else box[3][cur] = true;
//                        } else if (y < 6) {
//                            if(box[4][cur]) return false;
//                            else box[4][cur] = true;
//                        } else {
//                            if(box[5][cur]) return false;
//                            else box[5][cur] = true;
//                        }
//                    } else {
//                        if(y < 3) {
//                            if(box[6][cur]) return false;
//                            else box[6][cur] = true;
//                        } else if (y < 6) {
//                            if(box[7][cur]) return false;
//                            else box[7][cur] = true;
//                        } else {
//                            if(box[8][cur]) return false;
//                            else box[8][cur] = true;
//                        }
//                    }
//
//                }
//            }
//        }
//        return true;
//    }
    public static void main(String[] args) {
        char[][] sudoku1 = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] sudoku2 = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        Solution240319 solution240319 = new Solution240319();
        System.out.println(solution240319.isValidSudoku(sudoku1)); // true
        System.out.println(solution240319.isValidSudoku(sudoku2)); // false

    }
}


