package questions.q54;

import java.util.ArrayList;
import java.util.List;

/**
 * 2024.03.13
 */
class Solution240313 {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(matrix[0][0]);
        matrix[0][0] = Integer.MAX_VALUE;
        int direction = 0, x = 0, y = 0;
        for(int i = 0; i < matrix.length * matrix[0].length - 1;) {
            switch (direction) {
                // 向右
                case 0:
                    if((x + 1) < matrix[0].length && matrix[y][x + 1] != Integer.MAX_VALUE) {
                        result.add(matrix[y][x + 1]);
                        matrix[y][x + 1] = Integer.MAX_VALUE;
                        x++;
                        i++;
                        break;
                    } else direction = 1;
                // 向下
                case 1:
                    if((y + 1) < matrix.length && matrix[y + 1][x] != Integer.MAX_VALUE) {
                        result.add(matrix[y + 1][x]);
                        matrix[y + 1][x] = Integer.MAX_VALUE;
                        y++;
                        i++;
                        break;
                    } else direction = 2;
                // 向左
                case 2:
                    if((x - 1) >= 0 && matrix[y][x - 1] != Integer.MAX_VALUE) {
                        result.add(matrix[y][x - 1]);
                        matrix[y][x - 1] = Integer.MAX_VALUE;
                        x--;
                        i++;
                        break;
                    } else direction = 3;
                // 向上
                case 3:
                    if((y - 1) >= 0 && matrix[y - 1][x] != Integer.MAX_VALUE) {
                        result.add(matrix[y - 1][x]);
                        matrix[y - 1][x] = Integer.MAX_VALUE;
                        y--;
                        i++;
                        break;
                    } else direction = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution240313 solution240313 = new Solution240313();
        // {1,2,3}
        // {4,5,6}
        // {7,8,9}
        // [1, 2, 3, 6, 9, 8, 7, 4, 5]
        System.out.println(solution240313.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        // { 1, 2, 3, 4}
        // { 5, 6, 7, 8}
        // { 9,10,11,12}
        // [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
        System.out.println(solution240313.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}


