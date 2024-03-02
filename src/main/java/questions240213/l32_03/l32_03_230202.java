package questions240213.l32_03;
import entity.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l32_03_230202 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> arr = new ArrayList<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode poll = queue.poll();
                assert poll != null;
                if (flag)
                    tmp.add(poll.val);
                else
                    tmp.add(0, poll.val);

                if (poll.left != null) queue.add(poll.left);
                if (poll.right != null) queue.add(poll.right);
            }
            flag = !flag;
            arr.add(tmp);
        }
        return arr;
    }
}
