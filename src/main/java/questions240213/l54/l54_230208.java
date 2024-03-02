package questions240213.l54;

import entity.TreeNode;

import java.util.LinkedList;

/**
 * 應該從後往前遍歷，二叉樹是有排序的
 */
public class l54_230208 {

    // 由小排到大
    LinkedList<Integer> result = new LinkedList<>();
    int k = 0;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        recur(root);
        return result.size() >= k ? result.getFirst() : 0;
    }
    private void recur(TreeNode root) {
        if (root == null) return;
        insert(root.val);
        recur(root.left);
        recur(root.right);
    }
    private void insert(int n) {
        int index = 0;
        for (Integer integer : result) {
            if (integer < n) index++;
        }
        result.add(index, n);
        if (result.size() > k) result.remove(0);
    }
}
