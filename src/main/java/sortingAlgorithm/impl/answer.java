package sortingAlgorithm.impl;

import sortingAlgorithm.myShort;

public class answer implements myShort {

    @Override
    public int[] bubbleSort(int[] nums) {
        return new int[0];
    }

    @Override
    public int[] selectionSort(int[] nums) {
        return new int[0];
    }

    @Override
    public int[] insertionSort(int[] nums) {
        return new int[0];
    }

    @Override
    public int[] shellSort(int[] nums) {
        return new int[0];
    }

    private void quickRecur(int[] nums, int left, int right) {
        int i, j, index;
        if (left > right) {
            return;
        }
        i = left;
        j = right;
        index = nums[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && nums[j] >= index)
                j--;
            if (i < j)
                nums[i++] = nums[j];// 用比基准小的记录替换低位记录
            while (i < j && nums[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                nums[j--] = nums[i];
        }
        nums[i] = index;// 将基准数值替换回 a[i]
        quickRecur(nums, left, i - 1); // 对低子表进行递归排序
        quickRecur(nums, i + 1, right); // 对高子表进行递归排序
    }

    @Override
    public int[] quickSort(int[] nums) {
        quickRecur(nums, 0, nums.length - 1);
        return nums;
    }

    @Override
    public int[] mergeSort(int[] nums) {
        return new int[0];
    }

    @Override
    public int[] heapSort(int[] nums) {
        return new int[0];
    }

    @Override
    public int[] countingSort(int[] nums) {
        return new int[0];
    }

    @Override
    public int[] bucketSort(int[] nums) {
        return new int[0];
    }

    @Override
    public int[] radixSort(int[] nums) {
        return new int[0];
    }
}
