package questions240213.l40;

import java.util.LinkedList;

public class l40_230212 {

    // 2224 ms	42 MB
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (arr.length < k || k == 0) return new int[0];
        int[] result = new int[k];
        LinkedList<Integer> list = new LinkedList<>();
        for (int target : arr) {
            if (list.size() == 0) list.add(target);
            else {
                int left = 0, right = list.size() - 1, mid;
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (list.get(mid) <= target) left = mid + 1;
                    else right = mid - 1;
                }
                list.add(left, target);
            }
            if (list.size() > k) list.removeLast();
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    // 266 ms	42.6 MB
    public int[] getLeastNumbers2(int[] arr, int k) {
        if (arr.length < k || k == 0) return new int[0];
        int min = Integer.MAX_VALUE, minIndex = 0;
        int[] result = new int[k];
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            result[j] = min;
            min = Integer.MAX_VALUE;
            arr[minIndex] = Integer.MAX_VALUE;
            minIndex = 0;
        }
        return result;
    }
    // 沒做出來
//    public int[] getLeastNumbers3(int[] arr, int k) {
//        if (arr.length < k || k == 0) return new int[0];
//        int base = arr[0], left = 0, right = arr.length - 1;
//        while (left < right) {
//            while (left < right && arr[left] < base) left++;
//            while (left < right && arr[right] > base) right--;
//            int tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//        }
//        if (k - 1 == left) return Arrays.copyOfRange(arr, 0, left);
//        if (k - 1 > left) {
//            ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList());
//            return Arrays.copyOfRange(arr, 0, left);
//        }
//        if (k - 1 < left) return getLeastNumbers3(Arrays.copyOfRange(arr, 0, left), k);
//    }
}


