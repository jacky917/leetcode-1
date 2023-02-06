package l18;

import entity.ListNode2;

// 有提示思路
public class l18_230205 {
    public ListNode2 deleteNode(ListNode2 head, int val) {
        if(head == null) return null;
        if(head.val == val) return head.next;
        ListNode2 pre = head, cur = head.next;
        while(cur != null && cur.val != val) {
            cur = cur.next;
            pre = pre.next;
        }
        if(cur != null) pre.next = cur.next;
        return head;
    }
}
