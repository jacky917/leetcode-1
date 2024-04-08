package questions.q219;

import java.util.HashMap;

/**
 * 2024.04.03
 */
class Solution240403 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        HashMap<Integer, int[]> map = new HashMap<>();
        while(left < right) {
            if(!map.containsKey(nums[left]))
                map.put(nums[left], new int[]{left, Integer.MAX_VALUE});
            else {
                int[] tmp = map.get(nums[left]);
                if(tmp[0] != Integer.MIN_VALUE && (left - tmp[0]) <= k) return true;
                tmp[0] = left;
                if(tmp[1] != Integer.MAX_VALUE && (tmp[1] - tmp[0]) <= k) return true;
            }
            if(!map.containsKey(nums[right]))
                map.put(nums[right], new int[]{Integer.MIN_VALUE, right});
            else {
                int[] tmp = map.get(nums[right]);
                if(tmp[1] != Integer.MAX_VALUE && (tmp[1] - right) <= k) return true;
                tmp[1] = right;
                if(tmp[0] != Integer.MIN_VALUE && (tmp[1] - tmp[0]) <= k) return true;
            }
            left ++;
            right --;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution240403 solution240403 = new Solution240403();
        System.out.println(solution240403.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
}


