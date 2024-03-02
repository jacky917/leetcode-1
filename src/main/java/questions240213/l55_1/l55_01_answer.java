package questions240213.l55_1;

import entity.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class l55_01_answer {
    public int maxDepthDFS(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepthDFS(root.left), maxDepthDFS(root.right)) + 1;
    }
//    作者：jyd
//    链接：https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/solution/mian-shi-ti-55-i-er-cha-shu-de-shen-du-xian-xu-bia/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    public int maxDepthBFS(TreeNode root) {
        if(root == null) return 0;
        List<TreeNode> queue = new LinkedList<TreeNode>() {{ add(root); }}, tmp;
        int res = 0;
        while(!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for(TreeNode node : queue) {
                if(node.left != null) tmp.add(node.left);
                if(node.right != null) tmp.add(node.right);
            }
            queue = tmp;
            res++;
        }
        return res;
    }
//    作者：jyd
//    链接：https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/solution/mian-shi-ti-55-i-er-cha-shu-de-shen-du-xian-xu-bia/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
