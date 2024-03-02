package questions240213.l26;

import entity.TreeNode;

// 有看解題思路
public class l26_230219 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean recur(TreeNode mainTree, TreeNode subTree) {
        if (subTree == null) return true;
        if (mainTree == null || mainTree.val != subTree.val) return false;
        return (recur(mainTree.left, subTree.left) && recur(mainTree.right, subTree.right));
    }
}
