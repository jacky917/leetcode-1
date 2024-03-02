package questions240213.l37;

import entity.TreeNode;

import java.util.HashMap;

// 剑指 Offer 07. 重建二叉树，重建不熟，照著完成這題
// 此題有重複節點，不適用此算法
public class l37_230220 {

    StringBuilder preOrderBuilder;
    StringBuilder inOrderBuilder;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        preOrderBuilder = new StringBuilder();
        inOrderBuilder = new StringBuilder();
        serializeRecur(root);
        return preOrderBuilder.toString() + "," + inOrderBuilder.toString();
    }

    private void serializeRecur(TreeNode root) {
        if(root == null) return;
        preOrderBuilder.append(root.val);
        serializeRecur(root.left);
        inOrderBuilder.append(root.val);
        serializeRecur(root.right);
    }

    int[] preOrder;
    int[] inOrder;
    HashMap<Integer, Integer> dic;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) return null;
        String[] split = data.split(",");
        dic = new HashMap<>();
        preOrder = new int[split[0].length()];
        inOrder = new int[split[1].length()];
        int pre = Integer.parseInt(split[0]);
        int in = Integer.parseInt(split[1]);
        for (int i = split[0].length() - 1; i >= 0; i --) {
            preOrder[i] = pre % 10;
            pre /= 10;
        }
        for (int i = split[1].length() - 1; i >= 0; i --) {
            inOrder[i] = in % 10;
            in /= 10;
            dic.put(inOrder[i], i);
        }

        return deserializeRecur(0, 0, inOrder.length - 1);
    }

    private TreeNode deserializeRecur(int root, int left, int right) {
        if(left > right) return null;
        // root
        TreeNode node = new TreeNode(preOrder[root]);
        int i = dic.get(preOrder[root]);
        node.left = deserializeRecur(root + 1, left, i - 1);
        node.right = deserializeRecur(root + i - left + 1, i + 1, right);
        return node;
    }
}
