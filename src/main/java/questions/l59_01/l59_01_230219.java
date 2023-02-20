package questions.l59_01;

public class l59_01_230219 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        result[0] = Integer.MIN_VALUE;
        int left = 1, right = k;
        for (int j = 0; j < k; j++) {
            result[0] = Math.max(nums[j], result[0]);
        }

//        if(nums.length == 2 || nums.length == 3) {
//            for (int i = 1; i < nums.length ; i++) {
//                result[i] = result[0];
//            }
//            return result;
//        }

        while (right < nums.length) {
            if (result[left - 1] < nums[right]) result[left] = nums[right];
            else {
                int max = Integer.MIN_VALUE;
                for (int kk = left; kk <= right; kk++)
                    max = Math.max(max, nums[kk]);
                result[left] = max;
            }
            left++;
            right++;
        }
        return result;
    }
}
