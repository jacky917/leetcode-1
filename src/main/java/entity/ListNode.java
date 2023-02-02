package entity;

import java.util.Objects;

public class ListNode {

    public ListNode(int x) { val = x; }
    public int val;
    public ListNode next;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;
        ListNode that = (ListNode) o;
        // 下一節點都為空，當前值相等 返回true
        if (this.next == null && that.next == null && this.val == that.val) return true;
        // 其中一個為空，另一個有值 返回false
        if (this.next == null || that.next == null) return false;
        // 都有值則遞歸繼續比較
        return this.next.equals(that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

}
