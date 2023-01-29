package l24;

import entity.ListNode;

// pre  cur  next
//  |    |    |
//  1--->2--->3--->4--->5--->NULL
//                                   cur
//                              pre  next
//                               |    |
//  NULL<---1<---2<---3<---4<---5<---NULL
// 有提示
public class l24_230128 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
