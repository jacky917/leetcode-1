package sortingAlgorithm.impl;

import sortingAlgorithm.myShort;

import java.util.LinkedList;

public class short_230210 implements myShort {

    private void exchange(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    @Override
    public int[] bubbleSort(int[] nums) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    exchange(nums, i, i + 1);
                    flag = true;
                }
            }
        }
        return nums;
    }

    @Override
    public int[] selectionSort(int[] nums) {
        int cur = 0;
        int min, minIndex = 0;
        while (cur < nums.length) {
            min = Integer.MAX_VALUE;
            for (int i = cur; i < nums.length; i++) {
                if (min > nums[i]) {
                    minIndex = i;
                    min = nums[i];
                }
            }
            exchange(nums, cur, minIndex);
            cur++;
        }
        return nums;
    }

    @Override
    public int[] insertionSort(int[] nums) {
        int index;
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : nums) {
            index = 0;
            for (int i : list) {
                if (num > i) index ++;
            }
            list.add(index, num);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    @Override
    public int[] shellSort(int[] nums) {
        return new int[0];
    }

    // 有問題
    private void quickRecur(int[] nums, int left, int right) {
//        if(left >= right) return;
//        int mid = nums[left], curLeft = left, curRight = right;
////        exchange(nums, left, left + (right - left)/2);
//        while (curLeft < curRight) {
//            while (curLeft < curRight && nums[curLeft] < mid) curLeft++;
//            while (curLeft < curRight && nums[curRight] >= mid) curRight--;
//            exchange(nums, curLeft, curRight);
//        }
////        exchange(nums, left, curLeft);
//        // 開啟左遞歸
//        quickRecur(nums, left, curRight - 1);
//        // 開啟右遞歸
//        quickRecur(nums, curRight, right);
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
