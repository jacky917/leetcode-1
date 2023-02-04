package l47;

// 有提示思路
public class l47_230204 {
    public int maxValue(int[][] grid) {
        if (grid.length == 0) return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int a = (i - 1) >= 0 ? grid[i - 1][j] : 0;
                int b = (j - 1) >= 0 ? grid[i][j-1] : 0;
                grid[i][j] = grid[i][j] + Math.max(a,b);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
