package l57;

// 有查看思路（left,right指針移動的正確性有疑問）
public class l57_230206 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1, sum;
        while(left <= right) {
            // 等於目標立即返回
            sum = nums[left] + nums[right];
            if(sum == target)
                return new int[]{nums[left], nums[right]};
            if(sum < target) left ++;
            else right --;
        }
        return new int[0];
    }
}
