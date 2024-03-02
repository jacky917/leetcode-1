package questions240213.l32_01;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class l32_01_230219 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            arr.add(poll.val);
            if (poll.left != null) queue.add(poll.left);
            if (poll.right != null) queue.add(poll.right);
        }
        int[] ints = new int[arr.size()];
        for (int i = 0; i < ints.length; i++)
            ints[i] = arr.get(i);
        return ints;
    }
}
