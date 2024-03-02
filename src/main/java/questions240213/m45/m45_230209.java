package questions240213.m45;

import java.util.LinkedList;
import java.util.Queue;

public class m45_230209 {

    public String minNumber(int[] nums) {
        if (nums.length == 0) return "";
        Queue<char[]> queue = new LinkedList<>();

        for (int num : nums) {
            char[] chars = String.valueOf(num).toCharArray();
            quickSort(chars, 0, chars.length - 1);
            queue.add(chars);
        }

        while (queue.size() > 1) {
            queue.add(mergeSort(queue.poll(), queue.poll()));
        }
        StringBuilder builder = new StringBuilder();

        char[] poll = queue.peek();
        if (poll[0] == '0') {
            for (int i = 1; i < poll.length; i++) {
                if(poll[i] != '0') {
                    poll[0] = poll[i];
                    poll[i] = '0';
                    break;
                }
            }
        }

        for (char c : queue.poll())
            builder.append(c);
        return builder.toString();
    }


    private char[] mergeSort(char[] l1, char[] l2) {
        int i1 = 0, i2 = 0;
        char[] merge = new char[l1.length + l2.length];
        for (int i = 0; i < merge.length; i++) {
            if (i2 >= l2.length) {
                merge[i] = l1[i1];
                i1++;
            } else if (i1 >= l1.length) {
                merge[i] = l2[i2];
                i2++;
            } else if (l1[i1] <= l2[i2]) {
                merge[i] = l1[i1];
                i1++;
            } else {
                merge[i] = l2[i2];
                i2++;
            }
        }
        return merge;
    }

    private void quickSort(char[] nums, int left, int right) {
        int i, j;
        char index;
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
        quickSort(nums, left, i - 1); // 对低子表进行递归排序
        quickSort(nums, i + 1, right); // 对高子表进行递归排序
    }
}
