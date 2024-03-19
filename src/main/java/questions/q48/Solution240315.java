package questions.q48;

import java.util.Arrays;

/**
 * 2024.03.15
 */
class Solution240315 {

//    /**
//     * 獲取下一個或是上一個位置的下標
//     * @return int[0] = x, int[1] = y, int[2] = direction
//     */
//    public int[] getAdjacentIndex(int[][] matrix, int x, int y, ) {
//        return new int[]{1,2};
//    }

    public void rotate(int[][] matrix) {
//        // level 第幾層
//        // cnt 計算for循環次數
//        int cnt = 0, level = 1;
//        int direction = 0, x = 0, y = 0;
//        for(int i = 0; i < matrix.length * matrix[0].length;) {
//            switch (direction) {
//                // 向右
//                case 0:
//                    for(int j = 0; j < matrix[0].length - cnt; j++, i++)
////                        result.add(matrix[level - 1][level - 1 + j]);
//                    direction = (direction + 1) % 4;
//                    cnt ++;
//                    break;
//                // 向下
//                case 1:
//                    for(int j = 0; j < matrix.length - cnt; j++, i++)
////                        result.add(matrix[level + j][matrix[0].length - level]);
//                    direction = (direction + 1) % 4;
//                    break;
//                // 向左
//                case 2:
//                    for(int j = 0; j < matrix[0].length - cnt; j++, i++)
////                        result.add(matrix[matrix.length - level][matrix[0].length - level - 1 - j]);
//                    direction = (direction + 1) % 4;
//                    cnt ++;
//                    break;
//                // 向上
//                case 3:
//                    for(int j = 0; j < matrix.length - cnt; j++, i++)
////                        result.add(matrix[matrix.length - level - 1 - j][level - 1]);
//                    direction = (direction + 1) % 4;
//                    level ++;
//                    break;
//            }
//        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Solution240315 solution240315 = new Solution240315();
        solution240315.rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}


