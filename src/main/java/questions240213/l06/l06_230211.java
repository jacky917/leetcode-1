package questions240213.l06;

import entity.ListNode;

public class l06_230211 {

    private int[] result;
    public int[] reversePrint(ListNode head) {
        recur(head, 0);
        return result;
    }

    private void recur(ListNode head, int count) {
        if(head == null) {
            result = new int[count];
            return;
        }
        recur(head.next, count + 1);
        result[result.length - 1 - count] = head.val;
    }
}
