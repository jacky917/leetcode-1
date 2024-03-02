package questions240213.l18;

import entity.ListNodeA;

// 有提示思路
public class l18_230205 {
    public ListNodeA deleteNode(ListNodeA head, int val) {
        if(head == null) return null;
        if(head.val == val) return head.next;
        ListNodeA pre = head, cur = head.next;
        while(cur != null && cur.val != val) {
            cur = cur.next;
            pre = pre.next;
        }
        if(cur != null) pre.next = cur.next;
        return head;
    }
}
