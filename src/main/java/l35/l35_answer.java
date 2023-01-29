package l35;


import entity.RandomNode;

import java.util.HashMap;
import java.util.Map;


public class l35_answer {

    // 方法一：哈希表
    public RandomNode copyRandomListHash(RandomNode head) {
        if (head == null) return null;
        RandomNode cur = head;
        Map<RandomNode, RandomNode> map = new HashMap<>();
        // 3. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
        while (cur != null) {
            map.put(cur, new RandomNode(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 4. 构建新链表的 next 和 random 指向
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        // 5. 返回新链表的头节点
        return map.get(head);
    }

//    作者：jyd
//    链接：https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/solution/jian-zhi-offer-35-fu-za-lian-biao-de-fu-zhi-ha-xi-/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


//    方法二：拼接 + 拆分
    public RandomNode copyRandomListSplit(RandomNode head) {
        return null;
    }

}
