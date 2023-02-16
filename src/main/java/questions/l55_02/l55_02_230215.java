package questions.l55_02;

import entity.TreeNode;

// 錯誤
public class l55_02_230215 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(recur(root.left, 1) - recur(root.right, 1)) <= 1;
    }

    private int recur(TreeNode root, int layer) {
        if (root == null) return layer;
        return Math.max(recur(root.left, layer + 1), recur(root.right, layer + 1));
    }
}
