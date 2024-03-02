package questions240213.m59_02;

import java.util.LinkedList;
import java.util.Queue;

// 思路錯誤
public class m59_02_230220 {
    Queue<Integer> queue;
    LinkedList<Integer> max;
    public m59_02_230220() {
        this.queue = new LinkedList<>();
        this.max = new LinkedList<>();
    }

    public int max_value() {
        return max.size() == 0 ? -1 : max.peekLast();
    }

    public void push_back(int value) {
        if (max.size() == 0 || max.peekLast() <= value) max.add(value);
        this.queue.add(value);
    }

    public int pop_front() {
        if (max.size() == 0) return -1;
        if (max.peek().equals(this.queue.peek())) max.pollFirst();
        // max 有值，queue必定有值
        return this.queue.poll();
    }
}
