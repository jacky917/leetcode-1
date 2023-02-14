package questions.l53_1;

public class l53_230214 {
//    public int search(int[] nums, int target) {
//        int right = bisection1(nums, 0, nums.length - 1, target);
//        int left = bisection2(nums, 0, nums.length - 1, target);
//        return right - left - 1;
//    }
//
//    private int bisection1(int[] nums, int left, int right, int target) {
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (nums[mid] <= target) left = mid + 1;
//            else right = mid -1;
//        }
//        return left;
//    }
//
//    private int bisection2(int[] nums, int left, int right, int target) {
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (nums[mid] < target) left = mid + 1;
//            else right = mid -1;
//        }
//        return right;
//    }

    // 優化
    public int search(int[] nums, int target) {
        return bisection(nums,  target) - bisection(nums, target - 1);
    }

    private int bisection(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) left = mid + 1;
            else right = mid -1;
        }
        return left;
    }
}
