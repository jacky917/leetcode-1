package questions.q209;

/**
 * 2024.03.11
 */
class Solution240311 {

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, result = Integer.MAX_VALUE, p = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum >= target) {
                while(sum - nums[p] >= target) {
                    sum -= nums[p];
                    p ++;
                }
                result = Math.min(result, i - p + 1);
                sum -= nums[p];
                p ++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        Solution240311 solution240311 = new Solution240311();
//        System.out.println(solution240311.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        System.out.println(solution240311.minSubArrayLen(80, new int[]{10,5,13,4,8,4,5,11,14,9,16,10,20,8}));
    }
}


