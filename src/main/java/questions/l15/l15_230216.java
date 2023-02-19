package questions.l15;

/**
 * 存在問題，應該用 while(n != 0)
 * while(n > 0) 在輸入負數的時候出錯
 */
public class l15_230216 {
    public int hammingWeight1(int n) {
        int count = 0;
        while(n > 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
    public int hammingWeight2(int n) {
        int count = 0;
        while(n > 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
