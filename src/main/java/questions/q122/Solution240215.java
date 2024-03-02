package questions.q122;

/**
 * 2024.02.15
 */
class Solution240215 {
    public int maxProfit(int[] prices) {
        int result = 0;
        int pre = 0, cur = 1, n = 0;
        while(cur < prices.length) {
            if((prices[cur] - prices[pre]) <= n) {
                result = result + (prices[cur - 1] - prices[pre]);
                pre = cur;
            }
            n = prices[cur] - prices[pre];
            cur ++;
        }
        return result + (prices[cur - 1] - prices[pre]);
    }

    public static void main(String[] args) {
        Solution240215 solution240215 = new Solution240215();
        System.out.println(solution240215.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}


