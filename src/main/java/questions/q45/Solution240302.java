package questions.q45;

import java.util.HashMap;

/**
 * 2024.03.02
 */
class Solution240302 {

    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        // max 當前最遠可到達的位置
        // cur 當前跳到哪裡
        // count 當前跳了幾次
        int max = nums[0], cur = 0, count = 0;
        while(max < nums.length - 1) {
            // index 當前可到達最遠位置下標
            int index = cur;
            for(int i = cur + 1; i <= max; i ++) {
                //　位置下標 + 點數
                if(i + nums[i] >= index + nums[index]) {
                    index = i;
                }
            }
            // 更新當前位置
            cur = index;
            // 更新最遠位置
            max = cur + nums[cur];
            // 多跳了一次
            count ++;
        }
        return count + 1;
    }
    public static void main(String[] args) {
//        Solution240302 solution240302 = new Solution240302();
//        System.out.println(solution240302.jump(new int[]{2,3,1,1,4}));
//        System.out.println(solution240302.jump(new int[]{0}));
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map.getOrDefault(0,-1));
    }
}


