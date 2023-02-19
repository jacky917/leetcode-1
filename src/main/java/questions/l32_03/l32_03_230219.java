package questions.l32_03;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l32_03_230219 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>(){{add(root);}};
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        boolean layer = true;
        // 可優化，使用 (result.size() % 2 == 0)
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size ; i++) {
                TreeNode poll = queue.poll();
                assert poll != null;
                if (layer) {
                    tmp.add(poll.val);
                }
                else
                    tmp.add(0, poll.val);
                if(poll.left != null) queue.add(poll.left);
                if(poll.right != null) queue.add(poll.right);
            }
            result.add(tmp);
            tmp = new ArrayList<>();
            layer = !layer;
        }
        return result;
    }
}
