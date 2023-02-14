package questions.l41;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l41_230213 {
    /** initialize your data structure here. */
    public l41_230213() {
        PriorityQueue<Object> objects = new PriorityQueue<>();

        PriorityQueue<Integer> A = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        A.add(1);
        PriorityQueue<Integer> B = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {

    }

    public double findMedian() {
        return 0.0;
    }
}
