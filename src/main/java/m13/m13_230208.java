package m13;

import java.util.Arrays;

public class m13_230208 {

    boolean[][] arr;
    int result = 0, k;

    public int movingCount(int m, int n, int k) {

        if (m == 0 || n == 0) return 0;
        this.k = k;
        arr = new boolean[n][m];
        dfs(0, 0);
        for (boolean[] b : arr) {
            System.out.println(Arrays.toString(b));
        }
        return result;
    }

    private void dfs(int x, int y) {
        // 越界
        if (x > arr[0].length - 1 || y > arr.length - 1 || arr[y][x]) return;
        // 剪枝
        int sum = 0, a = x, b = y;
        while (a != 0 || b != 0) {
            sum += a % 10;
            sum += b % 10;
            a /= 10;
            b /= 10;
        }
//        System.out.printf("x = %d,y = %d\n", x, y);
//        System.out.printf("a = %d,b = %d\n", a, b);
//        System.out.println(sum);
//        System.out.println("----------");
        if (sum > k) return;

        dfs(x + 1, y);
        dfs(x, y + 1);
        if (!arr[y][x]) {
            arr[y][x] = true;
            result++;
        }
    }
}
