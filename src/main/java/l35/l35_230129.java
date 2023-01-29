package l35;

import entity.RandomNode;

import java.util.HashMap;
import java.util.Map;

// 有提示思路
public class l35_230129 {

    public RandomNode copyRandomList(RandomNode head) {

        if (head == null) return null;

        RandomNode cur = head;

        Map<RandomNode, RandomNode> map = new HashMap<>();

        while (cur != null) {
            RandomNode tmp = new RandomNode(cur.val);
            map.put(cur, tmp);
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }
}
