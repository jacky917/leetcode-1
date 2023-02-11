package questions.l53_1;

public class l53_01_230129 {

    public int search(int[] nums, int target) {
        if (nums.length == 0) return 0;
        // 二分法
        int mid = 0, min = 0, max = nums.length - 1;
        while (min <= max) {
            mid = (min + max) / 2;
            if (nums[mid] >= target) max = mid - 1;
            else min = mid + 1;
            if (nums[mid] == target) break;
        }

//        System.out.println("mid = " + mid);

        // 沒有target返回0
        if (nums[mid] != target) return 0;

        // 從mid向左右計數
        int c = 0, tmp = mid;
        while (tmp >= 0 && nums[tmp] == target) {
            c++;
            tmp--;
        }
        tmp = mid + 1;
        while (tmp <= nums.length - 1 && nums[tmp] == target) {
            c++;
            tmp++;
        }
        return c;
    }
}
