import sortingAlgorithm.impl.short_230210;
import org.junit.Test;
import proxy.proxyFactory;
import sortingAlgorithm.myShort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class PerformanceTest {

    /**
     * 產生亂數數組
     * @param size 數組大小
     * @param range 取值範圍
     * @return 數組
     */
    private int[] randomList(int size, int range) {
        Random r = new Random();
        int[] ints = new int[size];
        for(int i = 0; i < size; i++) {
            ints[i] = r.nextInt(range);
        }
        return ints;
    }

    /**
     * StringBuilder和LinkedList插入效率測試
     * LinkedList（需要轉回String）
     */
    @Test
    public void StringBuilderVsLinkedList() {
        long start = System.currentTimeMillis();
        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder1.append('0');
        }
        System.out.printf("StringBuilder append cost %d ms\n", System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder2.insert(i / 2, '0');
        }
        System.out.printf("StringBuilder insert cost %d ms\n", System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i / 2, '0');
        }
        System.out.printf("LinkedList cost %d ms\n", System.currentTimeMillis() - start);
    }

    /**
     * 排序算法測試
     */
    @Test
    public void shortTest() {
//        int[] ints1 = randomList(10000, 10000);
//        int[] ints2 = randomList(10000, 10000);
//        int[] ints3 = randomList(10000, 10000);
//        int[] ints4 = randomList(10000, 10000);
//        int[] ints5 = randomList(10000, 10000);
//        int[] ints6 = randomList(10000, 10000);
//        int[] ints7 = randomList(10000, 10000);
//        int[] ints8 = randomList(10000, 10000);
//        int[] ints9 = randomList(10000, 10000);
        int[] ints10 = randomList(10, 10);
        myShort short_230210 = (myShort)proxyFactory.takesTimeProxy(new short_230210());
//        short_230210.bubbleSort(ints1);
//        short_230210.bubbleSort(ints2);
//        short_230210.bubbleSort(ints3);
//
//        short_230210.selectionSort(ints4);
//        short_230210.selectionSort(ints5);
//        short_230210.selectionSort(ints6);
//
//        short_230210.insertionSort(ints7);
//        short_230210.insertionSort(ints8);
//        short_230210.insertionSort(ints9);
        System.out.println(Arrays.toString(ints10));
        int[] ints = short_230210.quickSort(ints10);
        System.out.println(Arrays.toString(ints));
//        short230210.bubbleSort(ints);
//        int[] ints = randomList(100, 100);
//        short_230210 short230210 = new short_230210();
//        int[] result = short230210.bubbleSort(ints);
////        int[] result = short230210.selectionSort(ints);
//        System.out.println(Arrays.toString(result));
//
////        printTakesTime(new short_230210());
////        printTakesTime printTakesTime = new printTakesTime();
    }
}
