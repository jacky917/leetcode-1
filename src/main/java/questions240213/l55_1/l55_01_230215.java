package questions240213.l55_1;

import entity.TreeNode;

public class l55_01_230215 {

    public int maxDepth(TreeNode root) {
        return recur(root, 0);
    }

    private int recur(TreeNode root, int layer) {
        if (root == null) return layer;
        return Math.max(recur((root.left),layer + 1), recur((root.right),layer + 1));
    }
}
