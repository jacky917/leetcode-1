package questions.l34;
import entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class l34_230208 {

    // 答案
    List<List<Integer>> result = new ArrayList<>();
    // 紀錄當前路徑
    List<Integer> tmp = new ArrayList<>();
    int target;

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        this.target = target;
        dfs(root, 0);
        return result;
    }

    /**
     * @param root 根節點
     * @param cur  當前和
     */
    private void dfs(TreeNode root, int cur) {
        // 已到葉子節點，或是超過目標和
        if (root == null) return;
        cur += root.val;
        tmp.add(root.val);
        // 匹配目標
        if (cur == target && root.right == null && root.left == null) result.add(new ArrayList<>(tmp));
        if (root.left == null && root.right == null) {
            // 移除最後一個元素
            tmp.remove(tmp.size() - 1);
            return;
        }
        // 開啟左遞迴
        dfs(root.left, cur);
        // 開啟右遞迴
        dfs(root.right, cur);
        tmp.remove(tmp.size() - 1);
    }
}
