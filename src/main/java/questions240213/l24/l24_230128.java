package questions240213.l24;

import entity.ListNodeA;

// pre  cur  next
//  |    |    |
//  1--->2--->3--->4--->5--->NULL
//                                   cur
//                              pre  next
//                               |    |
//  NULL<---1<---2<---3<---4<---5<---NULL
// 有提示
public class l24_230128 {
    public ListNodeA reverseList(ListNodeA head) {
        ListNodeA pre = null;
        ListNodeA cur = head;
        while (cur != null){
            ListNodeA next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
