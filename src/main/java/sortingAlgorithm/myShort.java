package sortingAlgorithm;

public interface myShort {
    // 冒泡排序
    int[] bubbleSort(int[] nums);

    // 選擇排序
    int[] selectionSort(int[] nums);

    // 插入排序
    int[] insertionSort(int[] nums);

    // 希爾排序
    int[] shellSort(int[] nums);

    // 快速排序
    int[] quickSort(int[] nums);

    // 歸併排序
    int[] mergeSort(int[] nums);

    // 堆排序
    int[] heapSort(int[] nums);

    // 計數排序
    int[] countingSort(int[] nums);

    // 桶排序
    int[] bucketSort(int[] nums);

    // 基數排序
    int[] radixSort(int[] nums);
}
