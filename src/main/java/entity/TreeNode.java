package entity;

import java.util.LinkedList;
import java.util.Queue;


public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        queue.add(this);
        while (!queue.isEmpty()) {
            StringBuilder tmp = new StringBuilder();
            for (int i = queue.size(); i > 0 ; i--){
                TreeNode poll = queue.poll();
                assert poll != null;
                tmp.append(poll.val).append(",");
                if (poll.left != null)
                    queue.add(poll.left);
                if (poll.right != null)
                    queue.add(poll.right);
            }
            result.append(tmp).append("\n");
        }
        return result.toString();
    }
}