package l24;

import entity.ListNode2;

// pre  cur  next
//  |    |    |
//  1--->2--->3--->4--->5--->NULL
//                                   cur
//                              pre  next
//                               |    |
//  NULL<---1<---2<---3<---4<---5<---NULL
// 有提示
public class l24_230128 {
    public ListNode2 reverseList(ListNode2 head) {
        ListNode2 pre = null;
        ListNode2 cur = head;
        while (cur != null){
            ListNode2 next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
