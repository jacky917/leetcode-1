import entity.ListNode;
import entity.RandomNode;
import l03.l03_answer;
import l05.l05_230129;
import l06.l06_230127;
import l09.l09_230127;
import l24.l24_230128;
import l30.l30_230127;
import l30.l30_answer;
import l35.l35_230129;
import l53.l53_answer;
import l58.l58_230129;
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
     * 測試沒empty判斷是否可以(測試結果是不行的)
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

    /**
     * 剑指 Offer 06. 从尾到头打印链表
     * https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=c0ymvt3
     */
    @Test
    public void l06(){
        l06_230127 l06_230127 = new l06_230127();
        // 1 --> 3 --> 2
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

//        ListNode listNode1 = new ListNode(1);
        System.out.println(Arrays.toString(l06_230127.reversePrint(listNode1)));
    }

    /**
     * 剑指 Offer 24. 反转链表
     * https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=c0ymvt3
     */
    @Test
    public void l24(){
        l24_230128 l24_230128 = new l24_230128();
        // 1 --> 3 --> 2
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode = l24_230128.reverseList(listNode1);

        // test
        l06_230127 l06_230127 = new l06_230127();
        l06_230127.reversePrint(listNode);
    }

    /**
     * 230129測試ListNode Equals
     */
    @Test
    public void listNodeEqualsTest(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(2);
//        ListNode listNode7 = new ListNode(0);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
//        listNode6.next = listNode7;

        System.out.println(listNode1.equals(listNode4));
    }

    /**
     * 剑指 Offer 35. 复杂链表的复制
     * https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=c0ymvt3
     */
    @Test
    public void l35(){
        l35_230129 l35_230129 = new l35_230129();
        RandomNode randomNode1 = new RandomNode(7);
        RandomNode randomNode2 = new RandomNode(13);
        RandomNode randomNode3 = new RandomNode(11);
        RandomNode randomNode4 = new RandomNode(10);
        RandomNode randomNode5 = new RandomNode(1);

        randomNode1.next = randomNode2;
        randomNode2.next = randomNode3;
        randomNode3.next = randomNode4;
        randomNode4.next = randomNode5;
        randomNode5.next = null;

        // 為了定義更加清晰 null 也全寫上
        randomNode1.random = null;
        randomNode2.random = randomNode1;
        randomNode3.random = randomNode5;
        randomNode4.random = randomNode3;
        randomNode5.random = randomNode1;

        RandomNode copy = l35_230129.copyRandomList(randomNode1);
    }

    /**
     * 剑指 Offer 05. 替换空格
     * https://leetcode.cn/problems/ti-huan-kong-ge-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=c0ymvt3
     */
    @Test
    public void l05(){
        l05_230129 l05_230129 = new l05_230129();
        System.out.println(l05_230129.replaceSpace("We are happy."));
    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     * https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=c0ymvt3
     */
    @Test
    public void l58(){
        l58_230129 l58_230129 = new l58_230129();
        System.out.println(l58_230129.reverseLeftWords("lrloseumgh", 6));
    }

    /**
     * 剑指 Offer 03. 数组中重复的数字
     * https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
     */
    @Test
    public void l03(){
//        l03_230129 l03_230129 = new l03_230129();
//        System.out.println(l03_230129.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));;
        l03_answer l03_answer = new l03_answer();
        System.out.println(l03_answer.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

    @Test
    public void l53(){
//        l53_230129 l53_230129 = new l53_230129();
//        System.out.println(l53_230129.search(new int[]{1,4},4));;

        l53_answer l53_answer = new l53_answer();
        System.out.println(l53_answer.search2(new int[]{5,7,7,8,8,10},8));

    }
}

















