package l06;

import entity.ListNode;

public class l06_230127 {

    int[] result;

    public int[] reversePrint(ListNode head) {
        if (head == null) return new int[0];
        recur(head, 1);
        return result;
    }

    public void recur(ListNode head, int size){
        if(head.next == null) {
            System.out.println(size);
            result = new int[size];
            result[0] = head.val;
            return;
        }
        recur(head.next, size + 1);
        result[result.length-size] = head.val;
    }
}
