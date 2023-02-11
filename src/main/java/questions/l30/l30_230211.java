package questions.l30;

import java.util.Objects;
import java.util.Stack;

public class l30_230211 {

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public l30_230211() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || minStack.peek() >= x) minStack.push(x);
    }

    public void pop() {
        if(stack.isEmpty()) return;
        if(!minStack.isEmpty() && (Objects.equals(minStack.peek(), stack.peek()))) minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
