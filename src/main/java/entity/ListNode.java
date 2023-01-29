package entity;

import lombok.Data;

/**
 * for l06
 */
@Data
public class ListNode {

    public ListNode(int x) { val = x; }
    private int val;
    private ListNode next;
}
