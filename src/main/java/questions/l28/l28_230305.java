package questions.l28;

import entity.TreeNode;

// 比較的節點錯誤
public class l28_230305 {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return recur(root.left, root.right);
    }

    private boolean recur(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return t1.val == t2.val && recur(t1.left, t1.right) && recur(t2.left, t2.right);
    }
}
