package questions.l22;

import entity.ListNode;
import entity.ListNodeA;

public class l22_230223 {

    ListNodeA result = null;
    int count = 0;
    public ListNodeA getKthFromEnd(ListNodeA head, int k) {
        if (head == null) return null;
        getKthFromEnd(head.next, k);
        count ++;
        if(count == k) result = head;
        return result;
    }
}
