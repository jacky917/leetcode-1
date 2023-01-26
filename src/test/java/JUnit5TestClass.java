import l09.l09_0127;
import org.junit.Test;

public class JUnit5TestClass {

    /**
     * 剑指 Offer 09. 用两个栈实现队列
     * https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
     */
    @Test
    public void l09(){
        l09_0127 l09_0127 = new l09_0127();
        System.out.println("deleteHead : " + l09_0127.deleteHead());
        l09_0127.appendTail(1);
        l09_0127.appendTail(2);
        l09_0127.appendTail(3);
        l09_0127.appendTail(4);
        l09_0127.print();
        System.out.println("deleteHead : " + l09_0127.deleteHead());
        System.out.println("deleteHead : " + l09_0127.deleteHead());
        l09_0127.print();
    }
}
