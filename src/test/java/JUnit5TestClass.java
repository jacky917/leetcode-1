import entity.ListNode;
import entity.ListNodeA;
import entity.RandomNode;
import entity.TreeNode;
import questions.l03.l03_230214;
import questions.l04.l04_230214;
import questions.l07.l07_answer;
import questions.l10_01.l10_01_230222;
import questions.l10_02.l10_02_230305;
import questions.l11.l11_230219;
import questions.l15.l15_230216;
import questions.l18.l18_230223;
import questions.l22.l22_230223;
import questions.l25.l25_230223;
import questions.l27.l27_230222;
import questions.l28.l28_230305;
import questions.l29.l29_230220;
import questions.l32_01.l32_01_230219;
import questions.l32_02.l32_02_230219;
import questions.l32_03.l32_03_230219;
import questions.l37.l37_230220;
import questions.l38.l38_answer;
import questions.l40.l40_230212;
import questions.l42.l42_230222;
import questions.l46.l46_230223;
import questions.l47.l47_230222;
import questions.l48.l48_230223;
import questions.l50.l50_230219;
import questions.l53_1.l53_230214;
import questions.l55_1.l55_01_230215;
import questions.l56_02.l56_02_answer;
import questions.l59_01.l59_01_230219;
import questions.l59_01.l59_01_answer;
import questions.l63.l63_230222;
import questions.m59_02.m59_02_230220;
import questions.m61.m61_230212;
import questions.l03.l03_answer;
import questions.l04.l04_230201;
import questions.l05.l05_230129;
import questions.l06.l06_230127;
import questions.l09.l09_230211;
import questions.l10_01.l10_01_230203;
import questions.l10_02.l10_02_230203;
import questions.l11.l11_230131;
import questions.l12.l12_230207;
import questions.l18.l18_230205;
import questions.l18.l18_answer;
import questions.l21.l21_230206;
import questions.l21.l21_answer;
import questions.l22.l22_230206;
import questions.l22.l22_answer;
import questions.l24.l24_230128;
import questions.l25.l25_230206;
import questions.l25.l25_answer;
import questions.l26.l26_230202;
import questions.l27.l27_230202;
import questions.l28.l28_230202;
import questions.l28.l28_answer;
import questions.l30.l30_230127;
import questions.l30.l30_answer;
import questions.l32_01.l32_01_230201;
import questions.l32_02.l32_02_230201;
import questions.l32_03.l32_03_230202;
import questions.l34.l34_230208;
import questions.l35.l35_230211;
import questions.l36.l36_230208;
import questions.l42.l42_answer;
import questions.l46.l46_230205;
import questions.l47.l47_230204;
import questions.l48.l48_230205;
import questions.l50.l50_230131;
import questions.l52.l52_230206;
import questions.l52.l52_answer;
import questions.l53_1.l53_01_answer;
import questions.l53_2.l53_02_230131;
import questions.l54.l54_230208;
import questions.l57.l57_230206;
import questions.l58_01.l58_01_230206;
import questions.l58_02.l58_02_230129;
import questions.l63.l63_230204;
import questions.m13.m13_230208;
import questions.m45.m45_230209;
import org.junit.Test;

import java.util.*;

public class JUnit5TestClass {

    /**
     * ?????? Offer 09. ????????????????????????
     * <a href="https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/">l09</a>
     */
    @Test
    public void l09() {
        l09_230211 test = new l09_230211();
        System.out.println("deleteHead : " + test.deleteHead());
        test.appendTail(1);
        test.appendTail(2);
        test.appendTail(3);
        test.appendTail(4);
        System.out.println("deleteHead : " + test.deleteHead());
        System.out.println("deleteHead : " + test.deleteHead());
    }

    /**
     * ?????? Offer 30. ??????min????????????
     * <a href="https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/">l30</a>
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
     * ?????????empty??????????????????(????????????????????????)
     * java.util.EmptyStackException
     */
    @Test
    public void l30_answer() {
        l30_answer l30_answer = new l30_answer();
        l30_answer.push(1);
        System.out.println("min" + l30_answer.min());
        System.out.println("top" + l30_answer.top());
        l30_answer.pop();
        System.out.println("min" + l30_answer.min());
        System.out.println("top" + l30_answer.top());
        l30_answer.pop();
        System.out.println("min" + l30_answer.min());
        System.out.println("top" + l30_answer.top());
    }

    /**
     * ?????? Offer 06. ????????????????????????
     * <a href="https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">l06</a>
     */
    @Test
    public void l06() {
        l06_230127 l06_230127 = new l06_230127();
        // 1 --> 3 --> 2
        ListNodeA listNode1 = new ListNodeA(1);
        ListNodeA listNode2 = new ListNodeA(3);
        ListNodeA listNode3 = new ListNodeA(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

//        ListNode listNode1 = new ListNode(1);
        System.out.println(Arrays.toString(l06_230127.reversePrint(listNode1)));
    }

    /**
     * ?????? Offer 24. ????????????
     * <a href="https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/">l24</a>
     */
    @Test
    public void l24() {
        l24_230128 l24_230128 = new l24_230128();
        // 1 --> 3 --> 2
        ListNodeA listNode1 = new ListNodeA(1);
        ListNodeA listNode2 = new ListNodeA(3);
        ListNodeA listNode3 = new ListNodeA(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNodeA listNode = l24_230128.reverseList(listNode1);

        // test
        l06_230127 l06_230127 = new l06_230127();
        l06_230127.reversePrint(listNode);
    }

    /**
     * 230129??????ListNode Equals
     */
    @Test
    public void listNodeEqualsTest() {
        ListNodeA listNode1 = new ListNodeA(1);
        ListNodeA listNode2 = new ListNodeA(3);
        ListNodeA listNode3 = new ListNodeA(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNodeA listNode4 = new ListNodeA(1);
        ListNodeA listNode5 = new ListNodeA(3);
        ListNodeA listNode6 = new ListNodeA(2);
//        ListNode listNode7 = new ListNode(0);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
//        listNode6.next = listNode7;

        System.out.println(listNode1.equals(listNode4));
    }

    /**
     * ?????? Offer 35. ?????????????????????
     * <a href="https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/">l35</a>
     */
    @Test
    public void l35() {
        l35_230211 test = new l35_230211();
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

        // ???????????????????????? null ????????????
        randomNode1.random = null;
        randomNode2.random = randomNode1;
        randomNode3.random = randomNode5;
        randomNode4.random = randomNode3;
        randomNode5.random = randomNode1;

        RandomNode copy = test.copyRandomListSplit(randomNode1);
        System.out.println(copy + ", " + randomNode1);
    }

    /**
     * ?????? Offer 05. ????????????
     * <a href="https://leetcode.cn/problems/ti-huan-kong-ge-lcof/">l05</a>
     */
    @Test
    public void l05() {
        l05_230129 l05_230129 = new l05_230129();
        System.out.println(l05_230129.replaceSpace("We are happy."));
    }

    /**
     * ?????? Offer 58 - II. ??????????????????
     * <a href="https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/">l58-II</a>
     */
    @Test
    public void l58_02() {
        l58_02_230129 l58_01_230129 = new l58_02_230129();
        System.out.println(l58_01_230129.reverseLeftWords("lrloseumgh", 6));
    }

    /**
     * ?????? Offer 03. ????????????????????????
     * <a href="https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/">l03</a>
     */
    @Test
    public void l03() {
//        l03_230129 l03_230129 = new l03_230129();
//        System.out.println(l03_230129.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));;
        l03_answer l03_answer = new l03_answer();
        System.out.println(l03_answer.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
        l03_230214 l03230214 = new l03_230214();
        System.out.println(l03230214.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

    /**
     * ?????? Offer 53 - I. ?????????????????????????????? I
     * <a href="https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/">l53-I</a>
     */
    @Test
    public void l53_1() {
//        l53_01_230129 l53_01_230129 = new l53_01_230129();
//        System.out.println(l53_01_230129.search(new int[]{1,4},4));;
        l53_01_answer l53_01_answer = new l53_01_answer();
        System.out.println(l53_01_answer.search2(new int[]{5, 7, 7, 8, 8, 10}, 8));
        l53_230214 l53230214 = new l53_230214();
        System.out.println(l53230214.search(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    /**
     * ?????? Offer 53 - II. 0???n-1??????????????????
     * <a href="https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/">l53-II</a>
     */
    @Test
    public void l53_2() {
        l53_02_230131 l53_02_230131 = new l53_02_230131();
        System.out.println(l53_02_230131.missingNumber(new int[]{0, 1, 2}));
    }

    /**
     * ?????? Offer 11. ???????????????????????????
     * <a href="https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/">l11</a>
     */
    @Test
    public void l11() {
        l11_230131 l11_230131 = new l11_230131();
        System.out.println(l11_230131.minArray(new int[]{3, 1, 1, 1, 1}));
        l11_230219 l11230219 = new l11_230219();
        System.out.println(l11230219.minArray(new int[]{3, 1, 1, 1, 1}));
    }

    /**
     * ?????? Offer 50. ?????????????????????????????????
     * <a href="https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/">l50</a>
     */
    @Test
    public void l50() {
        l50_230131 l50_230131 = new l50_230131();
        System.out.println(l50_230131.firstUniqChar("aba"));
        l50_230219 l50230219 = new l50_230219();
        System.out.println(l50230219.firstUniqChar("abaccdeff"));
    }

    /**
     * ?????? Offer 04. ????????????????????????
     * <a href="https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/">l04</a>
     */
    @Test
    public void l04() {
//        l04_230131 l04_230131 = new l04_230131();
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int[][] arr2 = {
                {-5},
        };
//        System.out.println(l04_230131.findNumberIn2DArray(arr, 6));
        l04_230201 l04_230214 = new l04_230201();
        System.out.println(l04_230214.findNumberIn2DArray(arr, 20));

        questions.l04.l04_230214 test = new l04_230214();
        System.out.println(test.findNumberIn2DArray(arr, 23));
    }

    /**
     * ?????? Offer 32. ??????????????????????????? 1~3
     * <a href="https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/">l32-I</a>
     * <a href="https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/">l32-II</a>
     * <a href="https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/">l32-III</a>
     */
    @Test
    public void l32() {

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

        System.out.println("======================================");
        // l32 i
        l32_01_230219 l3201230219 = new l32_01_230219();
        System.out.println(Arrays.toString(l3201230219.levelOrder(treeNode1)));
        System.out.println("------------------------------");
        // l32 ii
        l32_02_230219 l3202230219 = new l32_02_230219();
        System.out.println(l3202230219.levelOrder(treeNode1));
        System.out.println("------------------------------");
        // l32 iii
        l32_03_230219 l3203230219 = new l32_03_230219();
        System.out.println(l3203230219.levelOrder(treeNode1));
    }

    /**
     * ?????? Offer 26. ???????????????
     * <a href="https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/">l26</a>
     */
    @Test
    public void l26() {
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

        System.out.println(l26_230202.isSubStructure(treeANode1, treeBNode1));
    }

    /**
     * ?????? Offer 27. ??????????????????
     * <a href="https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/">l27</a>
     */
    @Test
    public void l27() {
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

        l27_230222 l27230222 = new l27_230222();
        System.out.println("230222 mirrorTreeAuxiliary");
        System.out.println(l27230222.mirrorTreeAuxiliary((treeANode1)));
        System.out.println("230222 mirrorTreeRecur");
        System.out.println(l27230222.mirrorTreeRecur((treeANode1)));
    }


    /**
     * ?????? Offer 28. ??????????????????
     * <a href="https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/">l28</a>
     */
    @Test
    public void l28() {

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
        System.out.println(l28_answer.isSymmetric(treeANode1));

        System.out.println("-------------------------");

        l28_230305 l28230305 = new l28_230305();
        System.out.println(l28230305.isSymmetric(treeANode1));
    }

    /**
     * ?????? Offer 10- I. ??????????????????
     * ?????? Offer 10- II. ?????????????????????
     * <a href="https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/">l10-I</a>
     * <a href="https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/">l10-II</a>
     */
    @Test
    public void l10() {
        l10_01_230203 l10_01_230203 = new l10_01_230203();
        System.out.println(l10_01_230203.fibRecur(50));
        System.out.println(l10_01_230203.fibDynamic(50));
        System.out.println("-----------------------------");
        l10_02_230203 l10_02_230203 = new l10_02_230203();
        System.out.println(l10_02_230203.numWays(44));

        l10_01_230222 l1001230222 = new l10_01_230222();
        System.out.println(l1001230222.fib(50));

        l10_02_230305 l1002230305 = new l10_02_230305();
        System.out.println(l1002230305.numWays(44));
    }

    /**
     * ?????? Offer 63. ?????????????????????
     * <a href="https://leetcode.cn/problems/gu-piao-de-zui-da-li-run-lcof/">l63</a>
     */
    @Test
    public void l63() {
        l63_230204 l63_230204 = new l63_230204();
        System.out.println(l63_230204.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        l63_230222 l63230222 = new l63_230222();
        System.out.println(l63230222.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    /**
     * ?????? Offer 42. ???????????????????????????
     * <a href="https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/">l42</a>
     */
    @Test
    public void l42() {
        l42_answer l42_answer = new l42_answer();
        System.out.println(l42_answer.maxSubArray1(new int[]{999, -9999, 50}));
        System.out.println(l42_answer.maxSubArray2(new int[]{999, -9999, 50}));

        l42_230222 l42230222 = new l42_230222();
        System.out.println(l42230222.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
    }

    /**
     * ?????? Offer 47. ?????????????????????
     * <a href="https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/">l47</a>
     */
    @Test
    public void l47() {
//        ?????? + Math.max(???????????????)
        l47_230204 l47_230204 = new l47_230204();
        System.out.println(l47_230204.maxValue(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        l47_230222 l47230222 = new l47_230222();
        System.out.println(l47230222.maxValue(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    /**
     * ?????? Offer 46. ???????????????????????????
     * <a href="https://leetcode.cn/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/">l46</a>
     */
    @Test
    public void l46() {
        l46_230205 l46_230205 = new l46_230205();
        System.out.println(l46_230205.translateNum(25));
        l46_230223 l46230223 = new l46_230223();
        System.out.println(l46230223.translateNum(506));
    }

    /**
     * ?????? Offer 48. ???????????????????????????????????????
     * <a href="https://leetcode.cn/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/">l48</a>
     */
    @Test
    public void l48() {
        l48_230205 l48230205 = new l48_230205();
        System.out.println(l48230205.lengthOfLongestSubstring("dvdf")); // 3
        l48_230223 l48230223 = new l48_230223();
        System.out.println(l48230223.lengthOfLongestSubstring("dvdf")); // 3
        System.out.println(l48230223.lengthOfLongestSubstring("abc")); // 1
    }

    /**
     * ?????? Offer 18. ?????????????????????
     * <a href="https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/">l18</a>
     */
    @Test
    public void l18() {
        ListNodeA listNode1 = new ListNodeA(4);
        ListNodeA listNode2 = new ListNodeA(5);
        ListNodeA listNode3 = new ListNodeA(1);
        ListNodeA listNode4 = new ListNodeA(9);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNodeA listNode5 = new ListNodeA(-3);
        ListNodeA listNode6 = new ListNodeA(5);
        ListNodeA listNode7 = new ListNodeA(-99);
        listNode5.next = listNode6;
        listNode6.next = listNode7;

        l18_230205 l18230205 = new l18_230205();
        System.out.println(l18230205.deleteNode(listNode1, 5));

        l18_answer l18_answer = new l18_answer();
        System.out.println(l18_answer.deleteNode(listNode1, 5));

        l18_230223 l18230223 = new l18_230223();
        System.out.println(l18230223.deleteNode(listNode5, -3));
    }

    /**
     * ?????? Offer 22. ??????????????????k?????????
     * <a href="https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/">l22</a>
     */
    @Test
    public void l22() {

        ListNodeA listNode1 = new ListNodeA(1);
        ListNodeA listNode2 = new ListNodeA(2);
        ListNodeA listNode3 = new ListNodeA(3);
        ListNodeA listNode4 = new ListNodeA(4);
        ListNodeA listNode5 = new ListNodeA(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        l22_230206 l22230206 = new l22_230206();
        System.out.println(l22230206.getKthFromEnd(listNode1, 3));

        l22_answer l22Answer = new l22_answer();
        System.out.println(l22Answer.getKthFromEnd(listNode1, 3));

        l22_230223 l22230223 = new l22_230223();
        System.out.println(l22230223.getKthFromEnd(listNode1, 3));
    }

    /**
     * ?????? Offer 25. ???????????????????????????
     * <a href="https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/">l25</a>
     */
    @Test
    public void l25() {

        ListNodeA listNode1 = new ListNodeA(1);
        ListNodeA listNode2 = new ListNodeA(2);
        ListNodeA listNode3 = new ListNodeA(4);
        ListNodeA listNode4 = new ListNodeA(1);
        ListNodeA listNode5 = new ListNodeA(3);
        ListNodeA listNode6 = new ListNodeA(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        System.out.println(listNode1);
        System.out.println(listNode4);
        System.out.println("-----------");
        l25_230206 l25230206 = new l25_230206();
        // ???????????????????????????????????????????????????null?????????????????????cur.next??????????????????
//        System.out.println(l25230206.mergeTwoLists(listNode1, listNode4));
        System.out.println("-----------");
        l25_answer l25Answer = new l25_answer();
//        System.out.println(l25Answer.mergeTwoLists(listNode1, listNode4));

        l25_230223 l25230223 = new l25_230223();
        System.out.println(l25230223.mergeTwoLists(listNode1, listNode4));
    }

    /**
     * ?????? Offer 52. ????????????????????????????????????
     * <a href="https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/">l52</a>
     */
    @Test
    public void l52() {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(0);
        ListNode listNode5 = new ListNode(1);
        ListNode listNode6 = new ListNode(8);
        ListNode listNode7 = new ListNode(4);
        ListNode listNode8 = new ListNode(5);

        listNode1.next = listNode2;

        listNode3.next = listNode4;
        listNode4.next = listNode5;

        listNode6.next = listNode7;
        listNode7.next = listNode8;

        listNode2.next = listNode6;
        listNode5.next = listNode6;

        l52_230206 l52230206 = new l52_230206();
        System.out.println(l52230206.getIntersectionNode(listNode1, listNode3));

        l52_answer l52_answer = new l52_answer();
        System.out.println(l52_answer.getIntersectionNode(listNode1, listNode3));
    }

    /**
     * ?????? Offer 21. ?????????????????????????????????????????????
     * <a href="https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/">l21</a>
     */
    @Test
    public void l21() {
        l21_230206 l24230206 = new l21_230206();
        System.out.println(Arrays.toString(l24230206.exchange(new int[]{1, 3, 5})));

        l21_answer l21Answer = new l21_answer();
        System.out.println(Arrays.toString(l21Answer.exchange(new int[]{2, 5})));
    }

    /**
     * ?????? Offer 57. ??????s???????????????
     * <a href="https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/">l57</a>
     */
    @Test
    public void l57() {
        l57_230206 l57230206 = new l57_230206();
        System.out.println(Arrays.toString(l57230206.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    /**
     * ?????? Offer 58 - I. ??????????????????
     * <a href="https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/">l58-I</a>
     */
    @Test
    public void l58_01() {
        l58_01_230206 l5801230206 = new l58_01_230206();
        System.out.println(l5801230206.reverseWordsAPI("   the sky is blue"));
        System.out.println(l5801230206.reverseWords("   the sky is blue"));
    }

    /**
     * ?????? Offer 12. ??????????????????
     * <a href="https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/">l12</a>
     */
    @Test
    public void l12() {
        l12_230207 l12230207 = new l12_230207();
        char[][] arr = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        System.out.println(l12230207.exist(arr, "ABCCED"));
    }

    /**
     * ?????????13. ????????????????????????
     * <a href="https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/">m13</a>
     */
    @Test
    public void m13() {
        m13_230208 m13230208 = new m13_230208();
        System.out.println(m13230208.movingCount(2, 3, 1));
    }

    /**
     * ?????? Offer 34. ????????????????????????????????????
     * <a href="https://leetcode.cn/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/">l34</a>
     */
    @Test
    public void l34() {
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(11);
        TreeNode treeNode5 = new TreeNode(13);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(5);
        TreeNode treeNode10 = new TreeNode(1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode4.right = treeNode8;
        treeNode6.left = treeNode9;
        treeNode6.right = treeNode10;

//        TreeNode treeNode1 = new TreeNode(-2);
//        TreeNode treeNode2 = new TreeNode(-3);
//        treeNode1.right = treeNode2;

        l34_230208 l34230208 = new l34_230208();
        for (List<Integer> l : l34230208.pathSum(treeNode1, 22)) {
            System.out.println(l);
        }
    }

    /**
     * ?????? Offer 36. ??????????????????????????????
     * <a href="https://leetcode.cn/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/">l36</a>
     */
    @Test
    public void l36() {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode1.right = treeNode3;

        l36_230208 l36230208 = new l36_230208();
        l36230208.treeToDoublyList(treeNode1);
    }

    /**
     * ?????? Offer 54. ?????????????????????k?????????
     * <a href="https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/">l54</a>
     */
    @Test
    public void l54() {
//        TreeNode treeNode1 = new TreeNode(3);
//        TreeNode treeNode2 = new TreeNode(1);
//        TreeNode treeNode3 = new TreeNode(4);
//        TreeNode treeNode4 = new TreeNode(2);
//
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.right = treeNode4;

        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(6);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode4.left = treeNode6;

        l54_230208 l54230208 = new l54_230208();
        System.out.println(l54230208.kthLargest(treeNode1, 3));
        ;
    }

    /**
     * ?????????45. ???????????????????????????
     * <a href="https://leetcode.cn/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/">m45</a>
     */
    @Test
    public void m45() {
        m45_230209 m45230209 = new m45_230209();
        int[] ints = {10, 2};
        System.out.println(m45230209.minNumber(ints));
    }

    /**
     * ?????????61. ?????????????????????
     * <a href="https://leetcode.cn/problems/bu-ke-pai-zhong-de-shun-zi-lcof/">l61</a>
     */
    @Test
    public void m61() {
        m61_230212 m61230212 = new m61_230212();
        System.out.println(m61230212.isStraight(new int[]{1, 2, 3, 4, 5}));
    }

    /**
     * ?????? Offer 40. ?????????k??????
     * <a href="https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/">l40</a>
     */
    @Test
    public void l40() {
        l40_230212 l40230212 = new l40_230212();
        System.out.println(Arrays.toString(l40230212.getLeastNumbers1(new int[]{3, 2, 1}, 2)));
    }

    @Test
    public void priorityQueueTest() {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(Comparator.reverseOrder());
        queue1.add(1);
        queue1.add(9);
        queue1.add(5);
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());

        queue2.add(1);
        queue2.add(9);
        queue2.add(5);
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
    }

    /**
     * ?????? Offer 55 - I. ??????????????????
     * <a href="https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/">l55-I</a>
     */
    @Test
    public void l55_01() {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        l55_01_230215 l5501230215 = new l55_01_230215();
        System.out.println(l5501230215.maxDepth(treeNode1));
    }

    /**
     * ?????? Offer 07. ???????????????
     * <a href="https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/">l07</a>
     */
    @Test
    public void l07() {
//        l07_230216 l07230216 = new l07_230216();
//        TreeNode treeNode = l07230216.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
//        TreeNode treeNode = l07230216.buildTree(new int[]{1, 2}, new int[]{1, 2});
        l07_answer l07Answer = new l07_answer();
        l07Answer.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    }

    /**
     * ?????? Offer 15. ????????????1?????????
     * <a href="https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/">l15</a>
     */
    @Test
    public void l15() {
        l15_230216 l15230216 = new l15_230216();
        System.out.println(l15230216.hammingWeight1(429496729));
    }

    /**
     * ?????? Offer 56 - II. ?????????????????????????????? II
     * <a href="https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/">l56</a>
     */
    @Test
    public void l56_02() {
        l56_02_answer m56Answer = new l56_02_answer();
        System.out.println(m56Answer.singleNumber(new int[]{3, 3, 3, 2, 4, 4, 4, 5, 5, 5}));
    }

    /**
     * ?????? Offer 59 - I. ????????????????????????
     * <a href="https://leetcode.cn/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/">l59-I</a>
     */
    @Test
    public void l59_01() {
        l59_01_230219 l59230219 = new l59_01_230219();
        System.out.println(Arrays.toString(l59230219.maxSlidingWindow(new int[]{1, -1}, 1)));
        l59_01_answer l59Answer = new l59_01_answer();
        System.out.println(Arrays.toString(l59Answer.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    /**
     * ?????? Offer 29. ?????????????????????
     * <a href="https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/">l29</a>
     */
    @Test
    public void l29() {
        l29_230220 l29230220 = new l29_230220();
        System.out.println(Arrays.toString(l29230220.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.toString(l29230220.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})));
    }

    /**
     * ?????????59 - II. ??????????????????
     * <a href="https://leetcode.cn/problems/dui-lie-de-zui-da-zhi-lcof/">m59</a>
     */
    @Test
    public void m59_02() {
        m59_02_230220 m59230220 = new m59_02_230220();
        m59230220.push_back(1);
        m59230220.push_back(2);
        m59230220.push_back(99);
        m59230220.push_back(2);
        m59230220.push_back(56);
        m59230220.push_back(2);
        m59230220.push_back(100);
        System.out.println(m59230220.max_value());
        System.out.println(m59230220.pop_front());
        System.out.println(m59230220.max_value());
    }

    /**
     * ?????? Offer 37. ??????????????????
     * <a href="https://leetcode.cn/problems/xu-lie-hua-er-cha-shu-lcof/">l37</a>
     */
    @Test
    public void l37() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        l37_230220 l37230220 = new l37_230220();
        System.out.println(l37230220.serialize(treeNode1));
        String serialize = l37230220.serialize(treeNode1);
        l37230220.deserialize(serialize);
        System.out.println("");
    }

    /**
     * ?????? Offer 38. ??????????????????
     * <a href="https://leetcode.cn/problems/zi-fu-chuan-de-pai-lie-lcof/">l38</a>
     */
    @Test
    public void l38() {
        l38_answer l38Answer = new l38_answer();
        System.out.println(Arrays.toString(l38Answer.permutation("aba")));
    }
}

















