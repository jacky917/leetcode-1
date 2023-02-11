package questions.l10_02;

public class l10_02_230203 {
    public int numWays(int n) {
        n = n + 1;
        int a = 0, b = 1, sum;
        for (int i = 0; i < n ; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}