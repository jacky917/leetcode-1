package questions.q128;

import java.util.HashSet;

/**
 * 2024.03.21
 */
class Solution240321 {

    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums) {
            set.add(num);
        }
        for(int i : set) {
            int count = 1;
            if(!set.contains(i - 1)) {
                while(set.contains(i + count)) {
                    count ++;
                }
            }
            result = Math.max(result, count);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution240321 solution240321 = new Solution240321();
        System.out.println(solution240321.longestConsecutive(new int[]{100,4,200,1,3,2})); // 4
        System.out.println(solution240321.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1})); // 9
    }
}


