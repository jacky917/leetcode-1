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
        if(head.getNext() == null) {
            System.out.println(size);
            result = new int[size];
            result[0] = head.getVal();
            return;
        }
        recur(head.getNext(), size + 1);
        result[result.length-size] = head.getVal();
    }
}
