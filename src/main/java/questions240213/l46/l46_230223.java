package questions240213.l46;

// 規律想錯了，想成
// dp[i] = dp[i-1]     (x > 25)
// dp[i] = dp[i-1] + 1 (x <= 25)
// ---------------------------
// 正確的
// dp[i] = dp[i-1]           (x > 25)
// dp[i] = dp[i-1] + dp[i-2] (x <= 25 && x >= 10)
public class l46_230223 {
    public int translateNum(int num) {
        int pre = 1, result = 1;
        while (num >= 10) {
            if (num % 100 < 26 && num % 100 >= 10) {
                int tmp = result;
                result += pre;
                pre = tmp;
            } else
                pre = result;
            num /= 10;
        }
        return result;
    }
}
