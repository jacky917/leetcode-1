package questions240213.l30;

import java.util.Stack;

// 有提示思路
public class l30_230127 {

    Stack<Integer> mainStack,minStack;

    /** initialize your data structure here. */
    public l30_230127() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if(minStack.empty() || minStack.peek() >= x)
            minStack.add(x);
        mainStack.add(x);
    }

    public void pop() {
        if(mainStack.empty()) return;
        // 如使用 == 在超過[-128,127]緩存的情況下，比較的是對象是否相同，所以必須使用equals
        if(mainStack.pop().equals(minStack.peek())) minStack.pop();
    }

    public int top() {
        return mainStack.empty() ? -1 : mainStack.peek();
    }

    public int min() {
        return minStack.empty() ? -1 : minStack.peek();
    }

    public void print(){
        System.out.println("min : " + min());
        System.out.println("top : " + top());
        System.out.println("mainStack : " + mainStack);
        System.out.println("minStack : " + minStack);
        System.out.println("------------------------------");
    }

}
