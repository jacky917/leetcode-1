package questions.q26;

import java.util.Arrays;

/**
 * 2024.02.28
 */
class Solution240228 {

    // 錯誤
    public void swap(int[] nums,int i,int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int slow = 0, fast = 1;
        while(fast < nums.length) {
            while (nums[slow] == nums[fast]) {
                fast ++;
                if(fast >= nums.length) break;
                if (nums[slow] != nums[fast]) {
                    slow ++;
                    swap(nums, slow, fast);
                }
            }
//            slow ++;
            fast ++;
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        Solution240228 solution240228 = new Solution240228();
//        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] arr = new int[]{0,0,1,1,1,3,3,3,4};
//        int[] arr = new int[]{1,1};
//        int[] arr = new int[]{1,2};
//        int[] arr = new int[]{0,1,2,3,4};
        System.out.println(solution240228.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}


