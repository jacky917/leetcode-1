package questions240213.l27;

import entity.TreeNode;

public class l27_230202 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        mirrorTree(root.left);
        mirrorTree(root.right);
        // 交換左右子樹
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }
}
