package l22;

import entity.ListNodeA;

// 遞歸
public class l22_230206 {
    ListNodeA result = null;
    int c = 0;
    public ListNodeA getKthFromEnd(ListNodeA head, int k) {
        if (head == null) return null;
        getKthFromEnd(head.next, k);
        c ++;
        if(c == k) result = head;
        return result;
    }
}
