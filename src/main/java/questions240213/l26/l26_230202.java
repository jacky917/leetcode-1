package questions240213.l26;

import entity.TreeNode;

public class l26_230202 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) return false;
        if (A != null){
            if (compare(A, B)) {
                return true;
            }
            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }
        return false;
    }

    public boolean compare(TreeNode A, TreeNode B){
        // B沒有節點的話不需比較
        if (B == null) return true;
        // B不等於null，但A已經無節點可比
        if (A == null) return false;
        // 值不同
        if (A.val != B.val) return false;
        return compare(A.left, B.left) && compare(A.right, B.right);
    }
}
