package questions.l10_02;

public class l10_02_230305 {

    public int numWays(int n) {
        // f(1) = 1
        if (n < 2) return 1;
        // f(2) = 2
        if (n == 2) return 2;
        int pre = 1, cur = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = cur;
            cur = (pre + cur) % 1000000007;
            pre = tmp;
        }
        return cur;
    }
}
