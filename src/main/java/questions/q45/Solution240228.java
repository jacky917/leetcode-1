package questions.q45;

import java.util.Arrays;

/**
 * 2024.02.28
 */
class Solution240228 {

    // 錯誤
//    public int jump(int[] nums) {
//        if(nums.length < 2) return 0;
//        int max = nums[0], result = 0, cur = 0;
//        while(max < nums.length) {
//            int index = Integer.MIN_VALUE;
//            for(int i = cur + 1; i <= max; i ++) {
//                if(index == Integer.MIN_VALUE || nums[i] > nums[index]) {
//                    index = i;
//                }
//            }
//            result ++;
//            cur = index;
//            if(cur >= nums.length) break;
//            max = cur + nums[cur];
//        }
//        return result;
//    }

    // 解答
    public int jump(int[] nums) {
        int length = nums.length; // 數組的長度
        int end = 0; // 當前能跳到的最遠距離
        int maxPosition = 0; // 遍歷過程中，能跳到的最遠距離
        int steps = 0; // 跳躍的次數
        for (int i = 0; i < length - 1; i++) { // 因為每次跳躍至少前進1步，所以最後一個元素不需要考慮
            maxPosition = Math.max(maxPosition, i + nums[i]); // 更新能跳到的最遠距離
            if (i == end) { // 當達到當前能跳到的最遠距離時
                end = maxPosition; // 更新下一次的最遠距離
                steps++; // 跳躍次數加1
            }
        }
        return steps; // 返回跳躍的最小次數
    }


    public static void main(String[] args) {
        Solution240228 solution240228 = new Solution240228();
//        int[] arr = new int[]{2,3,1,1,4};
//        int[] arr = new int[]{2,3,0,1,4};
//        int[] arr = new int[]{0};
//        int[] arr = new int[]{2,1};
        int[] arr = new int[]{1,2,3};
        System.out.println(solution240228.jump(arr));
        System.out.println(Arrays.toString(arr));
    }
}


