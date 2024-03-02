package questions.q53;

/**
 * 2024.02.13
 */
class Solution240213 {
    public int maxSubArray(int[] nums) {
        int max = nums[0], cur = nums[0];
        for(int i = 1; i < nums.length; i++) {
            cur = (cur > 0) ? cur + nums[i] : nums[i];
            max = Math.max(max,cur);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution240213 solution240213 = new Solution240213();
        System.out.println(solution240213.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}


