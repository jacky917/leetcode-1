package questions.q121;

/**
 * 2024.02.13
 */
class Solution240213 {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for(int price : prices) {
            if(price < min) min = price;
            if((price - min) > max) max = price - min;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution240213 solution240213 = new Solution240213();
        System.out.println(solution240213.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}


