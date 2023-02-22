package questions.l46;

public class l46_230223 {
    public int translateNum(int num) {
        int pre = 1, result = 1;
        while (num >= 10) {
            if (num % 100 < 26 && num % 100 > 10) {
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
