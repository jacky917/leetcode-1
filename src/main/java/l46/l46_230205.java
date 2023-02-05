package l46;

public class l46_230205 {
    public int translateNum(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        if (chars.length == 0 || chars.length == 1) return 1;
        // f(0) -> 0 只有一種翻譯方法
        // f(1) -> i 只有一種翻譯方法
        // f(x) -> f(n-1) 當結尾數字無法產生新組合時 [0,10) 聯集 (25,99]
        // f(x) -> f(n-1) + f(n-2) 當結尾數字可以和前一位產生新組合時 [10,25]
        // 初始化 a=f(0), b=f(1)
        int a = 1, b = 1, dp = 0;
        for (int i = 1; i < chars.length; i++) {
            if ((chars[i - 1] == 49 && (chars[i] >= 48 || chars[i] <= 57)) ||
                    (chars[i - 1] == 50 && (chars[i] >= 48 && chars[i] <= 53))) {
                dp = a + b;
            } else {
                dp = b;
            }
            a = b;
            b = dp;
        }
        return dp;
    }
}
