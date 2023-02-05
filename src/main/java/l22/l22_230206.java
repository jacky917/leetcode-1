package l22;

import entity.ListNode;

// 遞歸
public class l22_230206 {
    ListNode result = null;
    int c = 0;
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        getKthFromEnd(head.next, k);
        c ++;
        if(c == k) result = head;
        return result;
    }
}
