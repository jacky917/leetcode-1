package questions240213.l40;

import java.util.Arrays;

public class l40_answer {
//    public int[] getLeastNumbers(int[] arr, int k) {
//        if (k >= arr.length) return arr;
//        return quickSort(arr, k, 0, arr.length - 1);
//    }
//    private int[] quickSort(int[] arr, int k, int l, int r) {
//        int i = l, j = r;
//        while (i < j) {
//            while (i < j && arr[j] >= arr[l]) j--;
//            while (i < j && arr[i] <= arr[l]) i++;
//            swap(arr, i, j);
//        }
//        swap(arr, i, l);
//        if (i > k) return quickSort(arr, k, l, i - 1);
//        if (i < k) return quickSort(arr, k, i + 1, r);
//        return Arrays.copyOf(arr, k);
//    }
//    private void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }

//    作者：jyd
//    链接：https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/solution/jian-zhi-offer-40-zui-xiao-de-k-ge-shu-j-9yze/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    // 優化
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k >= arr.length) return arr;
        return quickSort(arr, k, 0, arr.length - 1);
    }
    private int[] quickSort(int[] arr, int k, int l, int r) {
        int i = l, j = r;
        while (i < j) {
            while (i < j && arr[j] >= arr[l]) j--;
            while (i < j && arr[i] <= arr[l]) i++;
            swap(arr, i, j);
        }
        swap(arr, i, l);
        if (i > k) return quickSort(arr, k, l, i - 1);
        if (i < k) return quickSort(arr, k, i + 1, r);
        return Arrays.copyOf(arr, k);
    }
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

//    作者：jyd
//    链接：https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/solution/jian-zhi-offer-40-zui-xiao-de-k-ge-shu-j-9yze/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
