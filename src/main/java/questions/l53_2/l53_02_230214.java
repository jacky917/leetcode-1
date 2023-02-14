package questions.l53_2;

public class l53_02_230214 {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}
