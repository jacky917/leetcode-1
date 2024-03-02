package questions240213.l18;

import entity.ListNodeA;

public class l18_answer {
    public ListNodeA deleteNode(ListNodeA head, int val) {
        if (head == null) return null;
        // 頭節點就是目標,返回next
        if (head.val == val) return head.next;
        ListNodeA pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) pre.next = cur.next;
        return head;
    }
//    作者：jyd
//    链接：https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/solution/mian-shi-ti-18-shan-chu-lian-biao-de-jie-dian-sh-2/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
