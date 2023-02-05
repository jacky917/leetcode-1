package l18;

import entity.ListNode;

// 有提示思路
public class l18_230205 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) return head.next;
        ListNode pre = head, cur = head.next;
        while(cur != null && cur.val != val) {
            cur = cur.next;
            pre = pre.next;
        }
        if(cur != null) pre.next = cur.next;
        return head;
    }
}
