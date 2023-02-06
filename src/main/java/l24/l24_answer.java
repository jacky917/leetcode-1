package l24;

import entity.ListNode2;

public class l24_answer {

    // 方法一：迭代（双指针）
    public ListNode2 reverseListPointer(ListNode2 head) {
        ListNode2 cur = head, pre = null;
        while (cur != null) {
            ListNode2 tmp = cur.next; // 暂存后继节点 cur.next
            cur.next = pre;             // 修改 next 引用指向
            pre = cur;                    // pre 暂存 cur
            cur = tmp;                    // cur 访问下一节点
        }
        return pre;
    }

//    作者：jyd
//    链接：https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/solution/jian-zhi-offer-24-fan-zhuan-lian-biao-die-dai-di-2/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


    public ListNode2 reverseListRecur(ListNode2 head) {
        return recur(head, null);         // 调用递归并返回
    }
    private ListNode2 recur(ListNode2 cur, ListNode2 pre) {
        if (cur == null) return pre;          // 终止条件
        ListNode2 res = recur(cur.next, cur);  // 递归后继节点
        cur.next = pre;                     // 修改节点引用指向
        return res;                           // 返回反转链表的头节点
    }

//    作者：jyd
//    链接：https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/solution/jian-zhi-offer-24-fan-zhuan-lian-biao-die-dai-di-2/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


}
