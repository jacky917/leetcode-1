import entity.ListNode;
import entity.RandomNode;
import entity.TreeNode;
import l03.l03_answer;
import l04.l04_230201;
import l05.l05_230129;
import l06.l06_230127;
import l09.l09_230127;
import l10_01.l10_01_230203;
import l10_02.l10_02_230203;
import l11.l11_230131;
import l24.l24_230128;
import l26.l26_230202;
import l27.l27_230202;
import l28.l28_230202;
import l28.l28_answer;
import l30.l30_230127;
import l30.l30_answer;
import l32_01.l32_01_230201;
import l32_02.l32_02_230201;
import l32_03.l32_03_230202;
import l35.l35_230129;
import l50.l50_230131;
import l53_1.l53_01_answer;
import l53_2.l53_02_230131;
import l58.l58_230129;
import org.junit.Test;

import java.util.Arrays;

public class JUnit5TestClass {

    /**
     * 剑指 Offer 09. 用两个栈实现队列
     * https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
     */
    @Test
    public void l09() {
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
     * https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/
     */
    @Test
    public void l30() {
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
    public void l30_answer() {
        l30_answer l30_answer = new l30_answer();
        l30_answer.push(1);
        System.out.println("min" + l30_answer.min());
        ;
        System.out.println("top" + l30_answer.top());
        ;
        l30_answer.pop();
        System.out.println("min" + l30_answer.min());
        ;
        System.out.println("top" + l30_answer.top());
        ;
        l30_answer.pop();
        System.out.println("min" + l30_answer.min());
        ;
        System.out.println("top" + l30_answer.top());
        ;
    }

    /**
     * 剑指 Offer 06. 从尾到头打印链表
     * https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
     */
    @Test
    public void l06() {
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
     * https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/
     */
    @Test
    public void l24() {
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
    public void listNodeEqualsTest() {
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
     * https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/
     */
    @Test
    public void l35() {
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
     * https://leetcode.cn/problems/ti-huan-kong-ge-lcof/
     */
    @Test
    public void l05() {
        l05_230129 l05_230129 = new l05_230129();
        System.out.println(l05_230129.replaceSpace("We are happy."));
    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     * https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
     */
    @Test
    public void l58() {
        l58_230129 l58_230129 = new l58_230129();
        System.out.println(l58_230129.reverseLeftWords("lrloseumgh", 6));
    }

    /**
     * 剑指 Offer 03. 数组中重复的数字
     * https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
     */
    @Test
    public void l03() {
//        l03_230129 l03_230129 = new l03_230129();
//        System.out.println(l03_230129.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));;
        l03_answer l03_answer = new l03_answer();
        System.out.println(l03_answer.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

    /**
     * 剑指 Offer 53 - I. 在排序数组中查找数字 I
     * https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
     */
    @Test
    public void l53_1() {
//        l53_01_230129 l53_01_230129 = new l53_01_230129();
//        System.out.println(l53_01_230129.search(new int[]{1,4},4));;
        l53_01_answer l53_01_answer = new l53_01_answer();
        System.out.println(l53_01_answer.search2(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    /**
     * 剑指 Offer 53 - II. 0～n-1中缺失的数字
     * https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/
     */
    @Test
    public void l53_2() {
        l53_02_230131 l53_02_230131 = new l53_02_230131();
        System.out.println(l53_02_230131.missingNumber(new int[]{0, 1, 2}));
    }

    /**
     * 剑指 Offer 11. 旋转数组的最小数字
     * https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
     */
    @Test
    public void l11() {
        l11_230131 l11_230131 = new l11_230131();
        System.out.println(l11_230131.minArray(new int[]{3, 1, 1, 1, 1}));
    }

    /**
     * 剑指 Offer 50. 第一个只出现一次的字符
     * https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
     */
    @Test
    public void l50() {
        l50_230131 l50_230131 = new l50_230131();
        System.out.println(l50_230131.firstUniqChar("aba"));
    }

    /**
     * 剑指 Offer 04. 二维数组中的查找
     * https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
     */
    @Test
    public void l04() {
//        l04_230131 l04_230131 = new l04_230131();
        int[][] arr = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
//        int[][] arr = {
//                {5,6},
//        };
//        int[][] arr = {
//                {5},
//                {6}
//        };
//        System.out.println(l04_230131.findNumberIn2DArray(arr, 6));
        l04_230201 l04_230201 = new l04_230201();
        System.out.println(l04_230201.findNumberIn2DArray(arr,20));
    }

    /**
     * 剑指 Offer 32. 从上到下打印二叉树 1~3
     * https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
     * https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
     * https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
     */
    @Test
    public void l32(){

        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        // l32 i
        l32_01_230201 l32_01_230201 = new l32_01_230201();
        System.out.println(Arrays.toString(l32_01_230201.levelOrder(treeNode1)));
        System.out.println("------------------------------");
        // l32 ii
        l32_02_230201 l32_02_230201 = new l32_02_230201();
        System.out.println(l32_02_230201.levelOrder(treeNode1));
        System.out.println("------------------------------");
        // l32 iii
        l32_03_230202 l32_03_230202 = new l32_03_230202();
        System.out.println(l32_03_230202.levelOrder(treeNode1));
    }

    /**
     * 剑指 Offer 26. 树的子结构
     * https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/
     */
    @Test
    public void l26(){
        l26_230202 l26_230202 = new l26_230202();

        TreeNode treeANode1 = new TreeNode(3);
        TreeNode treeANode2 = new TreeNode(4);
        TreeNode treeANode3 = new TreeNode(5);
        TreeNode treeANode4 = new TreeNode(1);
        TreeNode treeANode5 = new TreeNode(2);

        treeANode1.left = treeANode2;
        treeANode1.right = treeANode3;
        treeANode2.left = treeANode4;
        treeANode2.right = treeANode5;

        TreeNode treeBNode1 = new TreeNode(4);
        TreeNode treeBNode2 = new TreeNode(1);

        treeBNode1.left = treeBNode2;

        System.out.println(l26_230202.isSubStructure(treeANode1,treeBNode1));
    }

    /**
     * 剑指 Offer 27. 二叉树的镜像
     * https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/
     */
    @Test
    public void l27(){
        TreeNode treeANode1 = new TreeNode(4);
        TreeNode treeANode2 = new TreeNode(2);
        TreeNode treeANode3 = new TreeNode(7);
        TreeNode treeANode4 = new TreeNode(1);
        TreeNode treeANode5 = new TreeNode(3);
        TreeNode treeANode6 = new TreeNode(6);
        TreeNode treeANode7 = new TreeNode(9);
        treeANode1.left = treeANode2;
        treeANode1.right = treeANode3;
        treeANode2.left = treeANode4;
        treeANode2.right = treeANode5;
        treeANode3.left = treeANode6;
        treeANode3.right = treeANode7;
        l27_230202 l27_230202 = new l27_230202();
        System.out.println(treeANode1);
        System.out.println("-------------------------");
        System.out.println(l27_230202.mirrorTree(treeANode1));
    }

    /**
     * 剑指 Offer 28. 对称的二叉树
     * https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/
     */
    @Test
    public void l28(){

        TreeNode treeANode1 = new TreeNode(1);
        TreeNode treeANode2 = new TreeNode(2);
        TreeNode treeANode3 = new TreeNode(2);
        TreeNode treeANode4 = new TreeNode(3);
        TreeNode treeANode5 = new TreeNode(4);
        TreeNode treeANode6 = new TreeNode(4);
        TreeNode treeANode7 = new TreeNode(3);
        treeANode1.left = treeANode2;
        treeANode1.right = treeANode3;
        treeANode2.left = treeANode4;
        treeANode2.right = treeANode5;
        treeANode3.left = treeANode6;
        treeANode3.right = treeANode7;

        l28_230202 l28_230202 = new l28_230202();
        System.out.println(l28_230202.isSymmetric(treeANode1));

        System.out.println("-------------------------");

        l28_answer l28_answer = new l28_answer();
        System.out.println(l28_answer.isSymmetric(null));
    }

    /**
     * 剑指 Offer 10- I. 斐波那契数列
     * 剑指 Offer 10- II. 青蛙跳台阶问题
     * https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/
     * https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
     */
    @Test
    public void l10(){
        l10_01_230203 l10_01_230203 = new l10_01_230203();
        System.out.println(l10_01_230203.fibRecur(50));
        System.out.println(l10_01_230203.fibDynamic(50));
        System.out.println("-----------------------------");
        l10_02_230203 l10_02_230203 = new l10_02_230203();
        System.out.println(l10_02_230203.numWays(2));
    }
}

















