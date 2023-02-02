package l27;

import entity.TreeNode;

import java.util.Stack;

public class l27_answer {

    /**
     * 方法1 遞迴
     * @param root 根結點
     * @return 根結點
     */
    // 和我的思路一樣，但省去了冗餘代碼
    public TreeNode mirrorTreeRecur(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTreeRecur(root.right);
        root.right = mirrorTreeRecur(tmp);
        return root;
    }

//    作者：jyd
//    链接：https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/solution/mian-shi-ti-27-er-cha-shu-de-jing-xiang-di-gui-fu-/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


    public TreeNode mirrorTreeAuxiliary(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>() {{ add(root); }};
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.left != null) stack.add(node.left);
            if(node.right != null) stack.add(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }

//    作者：jyd
//    链接：https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/solution/mian-shi-ti-27-er-cha-shu-de-jing-xiang-di-gui-fu-/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
