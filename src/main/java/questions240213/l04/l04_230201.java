package questions240213.l04;

public class l04_230201 {

    // 有提示思路
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length ==0) return false;
        int i = 0, j = matrix[0].length -1;
        while (i < matrix.length && j >= 0){
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
}