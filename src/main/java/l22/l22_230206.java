package l22;

import entity.ListNode2;

// 遞歸
public class l22_230206 {
    ListNode2 result = null;
    int c = 0;
    public ListNode2 getKthFromEnd(ListNode2 head, int k) {
        if (head == null) return null;
        getKthFromEnd(head.next, k);
        c ++;
        if(c == k) result = head;
        return result;
    }
}
