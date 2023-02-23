package questions.l25;

import entity.ListNodeA;

public class l25_230223 {
    public ListNodeA mergeTwoLists(ListNodeA l1, ListNodeA l2) {
        ListNodeA head = new ListNodeA(0), cur = head;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                cur.next = l2;
                break;
            } else if (l2 == null) {
                cur.next = l1;
                break;
            } else if (l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        return head.next;
    }
}
