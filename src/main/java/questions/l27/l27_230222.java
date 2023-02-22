package questions.l27;

import entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class l27_230222 {
    public TreeNode mirrorTreeRecur(TreeNode root) {
        if (root == null) return null;
        mirrorTreeRecur(root.left);
        mirrorTreeRecur(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }

    public TreeNode mirrorTreeAuxiliary(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return root;
    }
}
