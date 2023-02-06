package l52;

import entity.ListNode;

import java.util.HashSet;

public class l52_230206 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while(headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null) {
            if(set.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
