import entity.ListNode;
import l06.l06_230127;
import l09.l09_230127;
import l24.l24_230128;
import l30.l30_230127;
import l30.l30_answer;
import org.junit.Test;

import java.util.Arrays;

public class JUnit5TestClass {

    /**
     * 剑指 Offer 09. 用两个栈实现队列
     * https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
     */
    @Test
    public void l09(){
        l09_230127 l09_230127 = new l09_230127();
        System.out.println("deleteHead : " + l09_230127.deleteHead());
        l09_230127.appendTail(1);
        l09_230127.appendTail(2);
        l09_230127.appendTail(3);
        l09_230127.appendTail(4);
        l09_230127.print();
        System.out.println("deleteHead : " + l09_230127.deleteHead());
        System.out.println("deleteHead : " + l09_230127.deleteHead());
        l09_230127.print();
    }

    /**
     * 剑指 Offer 30. 包含min函数的栈
     * https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=c0ymvt3
     */
    @Test
    public void l30(){
        l30_230127 l30_230127 = new l30_230127();
        l30_230127.push(1);
        l30_230127.push(2);
        l30_230127.push(-3);
        l30_230127.push(4);
        l30_230127.push(-10);
        l30_230127.push(2);
        l30_230127.push(-3);
        l30_230127.push(4);
        l30_230127.print();
        l30_230127.pop();
        l30_230127.pop();
        l30_230127.pop();
        l30_230127.pop();
        l30_230127.print();
    }

    /**
     * 測試沒empty判斷是否可以
     * java.util.EmptyStackException
     */
    @Test
    public void l30_answer(){
        l30_answer l30_answer = new l30_answer();
        l30_answer.push(1);
        System.out.println("min" + l30_answer.min());;
        System.out.println("top" + l30_answer.top());;
        l30_answer.pop();
        System.out.println("min" + l30_answer.min());;
        System.out.println("top" + l30_answer.top());;
        l30_answer.pop();
        System.out.println("min" + l30_answer.min());;
        System.out.println("top" + l30_answer.top());;
    }

    @Test
    public void l06(){
        l06_230127 l06_230127 = new l06_230127();
        // 1 --> 3 --> 2
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

//        ListNode listNode1 = new ListNode(1);
        System.out.println(Arrays.toString(l06_230127.reversePrint(listNode1)));
    }

    @Test
    public void l24(){
        l24_230128 l24_230128 = new l24_230128();
        // 1 --> 3 --> 2
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

        ListNode listNode = l24_230128.reverseList(listNode1);

        // test
        l06_230127 l06_230127 = new l06_230127();
        l06_230127.reversePrint(listNode);
    }

}
