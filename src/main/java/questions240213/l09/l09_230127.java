package questions240213.l09;

import java.util.ArrayDeque;
import java.util.Queue;

public class l09_230127 {

    Queue<Integer> append = new ArrayDeque<>();
    Queue<Integer> delete = new ArrayDeque<>();

    public l09_230127() {

    }

    public void appendTail(int value) {
        append.add(value);
    }

    public int deleteHead() {
        // 待刪除棧有值，直接取出頂層元素返回
        if (delete.size() > 0) return delete.poll();
        // 待刪除棧無值，但新加入棧有值
        if (append.size() > 0) {
            int size = append.size();
            for (int i = 0; i < size; i++) {
                delete.add(append.poll());
            }
            return delete.poll();
        }
        // 都無值，刪除失敗
        return -1;
    }

    public void print() {
        System.out.println("----------------");
        System.out.println("append : " + append);
        System.out.println("delete : " + delete);
        System.out.println("----------------");
    }
}
