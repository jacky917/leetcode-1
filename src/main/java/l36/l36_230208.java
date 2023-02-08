package l36;

import entity.TreeNode;

public class l36_230208 {

    TreeNode head, tail;
    public TreeNode treeToDoublyList(TreeNode root) {
        if(root == null) return null;
        recur(root);
        head.left = tail;
        tail.right = head;
        return head;
    }

    private void recur(TreeNode root){
        if(root == null) return;
        recur(root.left);
//        System.out.println(root.val);
        if (tail == null) {
            head = root;
        } else {
            tail.right = root;
            root.left = tail;
        }
        tail = root;
        recur(root.right);
    }
}
