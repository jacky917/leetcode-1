package l42;

public class l42_answer {

    public int maxSubArray1(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
//    作者：jyd
//    链接：https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/solution/mian-shi-ti-42-lian-xu-zi-shu-zu-de-zui-da-he-do-2/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    // 動態規劃，有提示思路
    public int maxSubArray2(int[] nums) {
        if (nums.length == 0) return 0;
        // dp 當前累加最大值
        // dp = nums[i], nums[i-1] <= 0
        // dp = num[i-1] + num[i], num[i-1] > 0
        // res 歷史累加最大值
        int dp = nums[0], res = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            dp = Math.max(dp + nums[i], nums[i]);
            res = Math.max(res, dp);
        }
        return res;
    }
}
