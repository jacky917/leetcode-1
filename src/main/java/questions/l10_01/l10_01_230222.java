package questions.l10_01;

public class l10_01_230222 {
    public int fib(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        int pre = 0, cur = 1, index = 2;
        while (n >= index) {
            int tmp = (pre + cur) % 1000000007;
            pre = cur;
            cur = tmp;
            index++;
        }
        return cur;
    }
}
