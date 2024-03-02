package questions240213.l32_01;
import entity.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 有提示思路
public class l32_01_230201 {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        queue.add(root);
        while (queue.size() > 0) {
            TreeNode poll = queue.poll();
            if (poll == null) continue;
            arr.add(poll.val);
            queue.add(poll.left);
            queue.add(poll.right);
        }
        int[] ints = new int[arr.size()];
        for (int i = 0; i < ints.length; i++)
            ints[i] = arr.get(i);
        return ints;
    }
}
