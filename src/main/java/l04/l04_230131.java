package l04;

public class l04_230131 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int left = 0, right = matrix[0].length - 1;
        // 二分法尋找matrix[0]中小於等於且最接近target的數字
        while (left <= right) {
            int mid = (left + right)/2;
            if (matrix[0][mid] == target) return true;
            if (matrix[0][mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        int i = 1;
        while (i < matrix.length && right >=0 ){
            // 找到目標返回
            if (matrix[i][right] == target) return true;
            // i++ 後有可能導致 matrix[i][right] > target 則優先向左移
            if (matrix[i][right] > target) {
                right --;
                continue;
            }
            // right + 1 < matrix[0].length 防止越界
            // matrix[i][right + 1] < target 嘗試向右移動，大於target則不移動
            if (right + 1 < matrix[0].length && matrix[i][right + 1] < target) {
                right ++;
                continue;
            }
            i++;
        }
        return false;
    }
}
