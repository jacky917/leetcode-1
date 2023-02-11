package questions.l12;

// 有看解答
public class l12_230207 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        if(word.length() == 0) return false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        // 越界
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word[k]) return false;
        // 最後一個字符匹配成功
        if (k == word.length - 1) return true;
        // 避免走到重複數字
        board[i][j] = '\0';
        // 上下左右遍歷
        boolean res = dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i + 1, j, k + 1)
                || dfs(board, word, i, j - 1, k + 1) || dfs(board, word, i, j + 1, k + 1);
        // 還原被修改的字符
        board[i][j] = word[k];
        return res;
    }
}
