package questions240213.l63;

public class l63_230222 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length ; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}
