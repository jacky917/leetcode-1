package l28;

import entity.TreeNode;

public class l28_230202 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return recur(root.left, root.right);
    }

    private boolean recur(TreeNode treeA, TreeNode treeB) {
        if (treeA == null && treeB == null) return true;
        if (treeA != null && treeB == null) return false;
        if (treeA == null && treeB != null) return false;
        return treeA.val == treeB.val && recur(treeA.left, treeB.right) && recur(treeA.right, treeB.left);
    }
}
