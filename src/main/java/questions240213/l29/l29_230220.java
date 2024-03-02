package questions240213.l29;

public class l29_230220 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];
        int n = matrix[0].length, m = matrix.length;
        // x = matrix[0] 下標，y = matrix 下標
        int x = 0, y = 0;
        int[] result = new int[m * n];
        for (int cur = 0; cur < result.length; cur++) {
            result[cur] = matrix[y][x];
            matrix[y][x] = Integer.MIN_VALUE;
            // 優先度 左 > 上 > 右 > 下 <- 看完解答發現這個想法是不行的，不能每次這樣每次判斷走的方向
            if (x - 1 >= 0 && matrix[y][x - 1] != Integer.MIN_VALUE) x--;
            else if (y - 1 >= 0 && matrix[y - 1][x] != Integer.MIN_VALUE) y--;
            else if (x + 1 < matrix[0].length && matrix[y][x + 1] != Integer.MIN_VALUE) x++;
            // (y + 1 < matrix.length && matrix[y + 1][x] != Integer.MIN_VALUE) y++
            else y++;
        }
        return result;
    }
}
