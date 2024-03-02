package questions.q88;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 2024.02.14
 */
class Solution240214 {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        ArrayList<Integer> temporary = new ArrayList<>();
//        int i1 = 0,i2 = 0;
//        for(i1 = 0; (i1 < nums1.length) && i2 < n; i1++) {
//            if(nums1[i1] == 0) nums1[i1] = Integer.MAX_VALUE;
//            if(temporary.size() == 0) {
//                // 剩餘情況不需要動作，直接讓 i++
//                if(nums1[i1] > nums2[i2]) {
//                    temporary.add(nums1[i1]);
//                    nums1[i1] = nums2[i2];
//                    i2 ++;
//                }
//            } else {
//                if(temporary.get(0) < nums2[i2]) {
//                    temporary.add(nums1[i1]);
//                    nums1[i1] = temporary.get(0);
//                    temporary.remove(0);
//                } else {
//                    temporary.add(nums1[i1]);
//                    nums1[i1] = nums2[i2];
//                    i2 ++;
//                }
//            }
//        }
//        while(temporary.size() != 0 && temporary.get(0) != Integer.MAX_VALUE) {
//            if(nums1[i1] == 0) nums1[i1] = Integer.MAX_VALUE;
//            if(nums1[i1] > temporary.get(0)) {
//                temporary.add(nums1[i1]);
//                nums1[i1] = temporary.get(0);
//                temporary.remove(0);
//            }
//            i1 ++;
//        }
//    }

    public void swap(int[] nums1, int i1, int[] nums2, int i2) {
        int t = nums1[i1];
        nums1[i1] = nums2[i2];
        nums2[i2] = t;
    }

    public void swap(ArrayList<Integer> arr, int[] nums1, int i,boolean flag) {
        if(flag) arr.add(nums1[i]);
        nums1[i] = arr.get(0);
        arr.remove(0);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0 && nums1.length != 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
        ArrayList<Integer> temporary = new ArrayList<>();
        int i1 = 0,i2 = 0;

        while(i1 < nums1.length) {
            if(temporary.size() != 0) {
                if(i2 < n && temporary.get(0) > nums2[i2]) {
                    if (i1 < m) temporary.add(nums1[i1]);
                    nums1[i1] = nums2[i2];
                    i2 ++;
                } else {
                    swap(temporary,nums1,i1,i1 < m);
                }
            } else {
                if(i2 < n && (i1 >= m || nums1[i1] > nums2[i2])) {
                    if(i1 < m) temporary.add(nums1[i1]);
                    nums1[i1] = nums2[i2];
                    i2 ++;
                }
            }
            i1 ++;
        }
    }

    public static void main(String[] args) {
        Solution240214 solution240214 = new Solution240214();
        int[] result = new int[]{4,0,0,0,0,0};
        solution240214.merge(result,1,new int[]{1,2,3,5,6},5);
        System.out.println(Arrays.toString(result));
    }
}


