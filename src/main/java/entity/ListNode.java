package entity;

import java.util.Objects;

public class ListNode {

    public ListNode(int x) { val = x; }
    public int val;
    public ListNode next;

    @Override
    public String toString() {
        String n = next == null ? "" : next.toString();
        return this.val + "," + n;
    }
}
