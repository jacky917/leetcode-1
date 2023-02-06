package l25;

import entity.ListNode;

public class l25_230206 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 頭節點
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (!(l1 == null && l2 == null)) {
            if (l1 == null) {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            } else if (l2 == null) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            } else {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
        }
        return head.next;
    }
}
