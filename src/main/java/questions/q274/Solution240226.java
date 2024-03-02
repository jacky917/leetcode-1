package questions.q274;

/**
 * 2024.02.26
 */
class Solution240226 {

    // 解答
    public int hIndex(int[] cs) {
        int n = cs.length; // 論文的總數
        int l = 0, r = n; // 使用二分查找，初始化左右指針
        while (l < r) {
            int mid = l + r + 1 >> 1; // 計算中間值，這裡的右移操作是為了實現除以2
            if (check(cs, mid)) l = mid; // 如果滿足條件，移動左指針
            else r = mid - 1; // 不滿足條件，移動右指針
        }
        return r; // 返回結果
    }
    boolean check(int[] cs, int mid) {
        System.out.println("check " + mid);
        int ans = 0; // 滿足H指數條件的論文數
        for (int i : cs) {
            System.out.println(i);
            if (i >= mid) ans++; // 統計引用次數大於等於mid的論文數
        }
        return ans >= mid; // 判斷是否滿足H指數的條件
    }


    public static void main(String[] args) {
        Solution240226 solution240226 = new Solution240226();
        System.out.println(solution240226.hIndex(new int[]{3,0,6,1,5,4,4}));
    }
}


