package questions240213.l52;

import entity.ListNode;

// 忽略了，就算沒交集，最後還是會相等（null）
public class l52_230305 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode l1 = headA, l2 = headB;
        int s1 = 0, s2 = 0;
        while (s1 < 2 && s2 < 2) {
            if (l1 == null) {
                l1 = headB;
                s1++;
            }
            if (l2 == null) {
                l2 = headA;
                s2++;
            }
            if (l1 == l2) return l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        return null;
    }
}
