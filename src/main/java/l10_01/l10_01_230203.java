package l10_01;


public class l10_01_230203 {

    private int[] arr;

    // 記憶化遞歸
    public int fibRecur(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        return recur(n);
    }

    private int recur(int n) {
        if (n == 0) return arr[0];
        if (n == 1) return arr[1];
        if (arr[n] == 0) {
            arr[n] = (recur(n - 1) + recur(n - 2)) % 1000000007;
        }
        return arr[n];
    }

    // 動態規劃，有提示思路
    public int fibDynamic(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int a = 0, b = 1, sum = 1;
        for (int i = 2 ; i < n ; i++){
            a = b;
            b = sum;
            sum = (a + b) % 1000000007;
        }
        return sum;
    }
}
