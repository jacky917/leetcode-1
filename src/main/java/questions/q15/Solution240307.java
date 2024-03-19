package questions.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2024.03.07
 */
class Solution240307 {

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    /**
     * 對數組進行分割，選擇一個基準值（pivot），並重排數組。
     * @param arr 待排序的數組
     * @param low 開始位置
     * @param high 結束位置
     * @return 基準值的最終位置
     */
    private int partition(int[] arr, int low, int high) {
        // 選擇最後一個元素作爲基準值
        int pivot = arr[high];
        // i是小於基準值的元素的最右側索引
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // 如果當前元素小於或等於基準值
            if (arr[j] <= pivot) {
                i++;

                // 交換arr[i]和arr[j]
                swap(arr, i, j);
            }
        }

        // 將基準值（pivot）移動到它的正確位置
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * 快速排序方法。
     * @param arr 待排序的數組
     * @param low 開始位置
     * @param high 結束位置
     */
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // partitionIndex是分割點，partition函數的作用是選擇一個基準值（pivot），
            // 並將數組重排，比基準值小的放左邊，大的放右邊，返回基準值的最終位置。
            int partitionIndex = partition(arr, low, high);

            // 遞迴地對基準值左側的子數組進行快速排序
            quickSort(arr, low, partitionIndex - 1);
            // 遞迴地對基準值右側的子數組進行快速排序
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // 有問題
//    public int partition(int[] nums, int start, int end) {
//        if(end - start == 1) {
//            if(nums[start] > nums[end]) swap(nums, start, end);
//            return start;
//        }
//        int left = start, right = end - 1;
//        while(left < right) {
//            if(nums[left] <= nums[end]) left ++;
//            else if (nums[right] > nums[end]) right --;
//            else swap(nums, left, right);
//        }
//        swap(nums, left, end);
//        return left;
//    }
//
//    public void quickSort(int[] nums, int left, int right) {
//        System.out.println(Arrays.toString(nums));
//        System.out.println("left = " + left + ",right = " + right);
//        if(nums.length <= 1 || right - left < 1) return;
//        int mid = partition(nums, left, right);
//        quickSort(nums, left, mid - 1);
//        quickSort(nums, mid + 1, right);
//    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        int left, right;
        for(int i = 0; i < nums.length; i ++) {
            if(i != 0 && nums[i - 1] == nums[i]) continue;
            right = nums.length - 1;
            left = i + 1;
            while(left < right) {
                if(nums[i] + nums[left] + nums[right] > 0) right --;
                else if (nums[i] + nums[left] + nums[right] < 0) left ++;
                else {
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    result.add(arr);
                    while(left < right && nums[left] == nums[left + 1]) left ++;
                    while(left < right && nums[right] == nums[right - 1]) right --;
                    left ++;
                    right --;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Solution240307 solution240215 = new Solution240307();
//
//        int[] arr = new int[]{-1,0,1,2,-1,-4};
//        solution240215.quickShort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(solution240215.threeSum(new int[]{-1,0,1,2,-1,-4}));
//        System.out.println(solution240215.threeSum(new int[]{3,0,-2,-1,1,2}));
        System.out.println(solution240215.threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}));
//        System.out.println(solution240215.threeSum(new int[]{-1,0,1,0}));
//        System.out.println(solution240215.threeSum(new int[]{0,1,1}));
//        System.out.println(solution240215.threeSum(new int[]{0,0,0}));
    }
}


