package questions.l35;

import entity.RandomNode;

import java.util.HashMap;

public class l35_230211 {

    // 哈希表
    public RandomNode copyRandomListHash(RandomNode head) {
        if(head == null) return null;
        HashMap<RandomNode, RandomNode> map = new HashMap<>();
        RandomNode cur = head;
        while(cur != null) {
            map.put(cur, new RandomNode(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null) {
            RandomNode node = map.get(cur);
            node.next = map.get(cur.next);
            node.random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    // 拼接 + 拆分
    public RandomNode copyRandomListSplit(RandomNode head) {
        if(head == null) return null;
        // 構建複製節點
        RandomNode cur = head, pre;
        while(cur != null) {
            RandomNode copy = new RandomNode(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }
        cur = head;
        // 構建 random
        RandomNode result = cur.next;
        while(cur != null) {
            if(cur.random != null)
                cur.next.random = cur.random.next;
            else cur.next.random = null;
            cur = cur.next.next;
        }
        cur = head;
        // 拆分
        while(cur.next != null) {
            pre = cur;
            cur = cur.next;
            pre.next = cur.next;
        }
        return result;
    }
}
