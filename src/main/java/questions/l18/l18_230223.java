package questions.l18;

import entity.ListNodeA;

public class l18_230223 {
    public ListNodeA deleteNode(ListNodeA head, int val) {
        if(head.val == val) return head.next;
        ListNodeA cur = head, pre;
        while(cur != null) {
            pre = cur;
            cur = cur.next;
            if(cur != null && cur.val == val) {
                pre.next = cur.next;
                break;
            }
        }
        return head;
    }
}
