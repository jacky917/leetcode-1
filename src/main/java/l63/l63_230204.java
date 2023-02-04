package l63;

// 有提示思路
public class l63_230204 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            min = Math.min(min,price);
            profit = Math.max(profit, price-min);
        }
        return profit;
    }
}
