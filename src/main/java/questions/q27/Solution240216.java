package questions.q27;

import java.util.Arrays;

/**
 * 2024.02.16
 */
class Solution240216 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return (nums[0] == val) ? 0 : 1;

        int left = 0,right = 0;
        while(right < nums.length) {
            try {
                while(nums[right] == val) right ++;
                while(nums[left] != val) left ++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
            if(left > right) {
                right = left;
                continue;
            }
            nums[left] = nums[right];
            nums[right] = val;
            left ++;
            right ++;
        }
        return left;
    }

    public static void main(String[] args) {
        Solution240216 solution240216 = new Solution240216();
        int[] arr = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(solution240216.removeElement(arr,2));
        System.out.println(Arrays.toString(arr));
    }
}


