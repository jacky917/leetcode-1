package questions.l33;

// 超過思考時間
public class l33_230216 {

    int [] postorder;
    public boolean verifyPostorder(int[] postorder) {
        this.postorder = postorder;
        return recur(0, postorder.length - 2);
    }

    /**
     * @param left 左邊界
     * @param right 右邊界
     * @return boolean 是否為二叉搜尋樹
     */
    private boolean recur(int left, int right) {
        if (left >= right) return true;
        int root = postorder[right + 1];
        // 右樹起始下標
        int mid = getLeftCount(right - left + 1);

        // postorder[mid - 1] 左樹 root
        // postorder[right] 右樹 root

        // 左樹遞歸
        recur(left, mid);
        // 右樹遞歸
        recur(mid, right);
        // 符合條件
        return postorder[mid - 1] < root && root < postorder[right];
    }

    /**
     * 切分左右樹
     * @param total 總右合計子節點數
     * @return 左樹節點數量
     */
    private int getLeftCount(int total) {
        int pow = 2, count = total;
        while (count > pow) {
            count -= pow;
            pow *= 2;
        }
        // 左樹比右樹多出 count 個節點
        return (total - count) / 2 + count;
    }
}
