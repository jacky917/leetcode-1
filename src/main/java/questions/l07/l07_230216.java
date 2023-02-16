package questions.l07;

import entity.TreeNode;
import java.util.Arrays;

// 錯誤
public class l07_230216 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recur(preorder, inorder);
    }

    private TreeNode recur(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        if (preorder.length == 1) return new TreeNode(preorder[0]);
        TreeNode root = new TreeNode(preorder[0]);
        int i = 0;
        while (i < inorder.length) {
            if (inorder[i] == preorder[0]) break;
            i++;
        }
        // inorder[i] = root
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, i);
        int[] rightInorder = Arrays.copyOfRange(inorder, i + 1, inorder.length);

        // i = 0 沒有左樹
        int j = 0;
        int[] leftPreorder = null;
        if (i != 0) {
            while (j < preorder.length) {
                if (preorder[j] == inorder[i - 1]) break;
                j++;
            }
            leftPreorder = Arrays.copyOfRange(preorder, 1, j + 1);
        }
        int[] rightPreorder = Arrays.copyOfRange(preorder, j + 1, preorder.length);
        if (i != 0)
            root.left = recur(leftPreorder, leftInorder);
        root.right = recur(rightPreorder, rightInorder);
        return root;
    }
}
