package questions.l42;

public class l42_230222 {
    public int maxSubArray(int[] nums) {
        int pre = nums[0], cur, result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (pre > 0) cur = nums[i] + pre;
            else cur = nums[i];
            pre = cur;
            result = Math.max(result, cur);
        }
        return result;
    }
}
