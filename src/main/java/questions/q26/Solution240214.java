package questions.q26;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 2024.02.14
 */
class Solution240214 {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
            if(!list.contains(nums[i])) list.add(nums[i]);
        int result = list.size();
        for(int i = 0; i < result; i++) {
            nums[i] = list.get(0);
            list.remove(0);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution240214 solution240214 = new Solution240214();
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution240214.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}


