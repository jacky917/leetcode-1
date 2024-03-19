package questions.q11;

import java.util.HashMap;

/**
 * 2024.03.04
 */
class Solution240304 {

    HashMap<Integer,Integer> map;
    int highest;

    public Solution240304() {
        map = new HashMap();
    }

     public int maxArea(int[] height) {
         int left = 0, right = height.length -1, result = 0, resultLeft = 0, resultRight = 0;
         while(left < right) {
             int tmp = Math.min(height[left], height[right]) * (right - left + 1);
             if(tmp > result) {
                 result = tmp;
                 resultLeft = left;
                 resultRight = right;
             }
             if(height[left] < height[right]) left ++;
             else right --;
         }
         int level = Math.min(height[resultLeft],height[resultRight]);
//         for( ;resultLeft <= resultRight; resultLeft++) {
//             result -= Math.min(level, height[resultLeft]);
//         }
         System.out.println("resultLeft = " + resultLeft);
         System.out.println("resultRight = " + resultRight);
         System.out.println("level = " + level);
         return result;
     }

//    public int maxArea(int[] height) {
//        int left = 0, right = height.length -1, result = 0, h = 0;
//        pillar(height[left]);
//        pillar(height[right]);
//        while(true) {
//            int tmp = Math.max(result, Math.min(height[left], height[right]) * (right - left + 1));
//            if(tmp > result) {
//                result = tmp;
//                h = Math.min(height[left], height[right]);
//            }
//            if(height[left] < height[right]) {
//                left ++;
//                if(left < right) pillar(height[left]);
//                else break;
//            } else {
//                right --;
//                if(left < right) pillar(height[right]);
//                else break;
//            }
//        }
//        return result - map.get(height[]);
//    }
//
//    public void pillar(int high) {
//        highest = Math.max(highest, high);
//        for(int i = 1; i <= highest; i++) {
//            // 原本的柱子佔用空間 + 低於水位新增的柱子空間
//            map.put(i, map.getOrDefault(i,0) + Math.min(i, high));
//        }
//    }

    public static void main(String[] args) {
        Solution240304 solution240226 = new Solution240304();
        System.out.println(solution240226.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); //49
    }
}


