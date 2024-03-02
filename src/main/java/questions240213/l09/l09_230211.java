package questions240213.l09;

import java.util.Stack;

public class l09_230211 {

    private final Stack<Integer> s1;
    private final Stack<Integer> s2;

    public l09_230211() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if(s1.isEmpty() && s2.isEmpty()) return -1;
        if(s2.isEmpty()) {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
