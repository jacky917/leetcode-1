package questions.m45;

public class m45_230209 {
    public String minNumber(int[] nums) {
        StringBuilder builder = new StringBuilder();
        for (int i : nums) {
            char[] chars = String.valueOf(i).toCharArray();
            quickSort(chars, 0, chars.length - 1);
            for (char c : chars) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public void quickSort(char[] chars, int left, int right) {
        if(right - left < 1) return;
        int mid = chars[left], curLeft = left, curRight = right;
        exchange(chars, left, left + (right - left)/2);
        while (curLeft < curRight) {
            while (curLeft < curRight && chars[curLeft] < mid) curLeft++;
            while (curLeft < curRight && chars[curRight] > mid) curRight--;
            exchange(chars, curLeft, curRight);
        }
        // 開啟左遞歸
        quickSort(chars, left, curLeft - 1);
        // 開啟右遞歸
        quickSort(chars, curLeft + 1, right);
    }

    private void exchange(char[] chars, int i1, int i2){
        char tmp = chars[i1];
        chars[i1] = chars[i2];
        chars[i2] = tmp;
    }

//    // 快速排序，遞迴
//    // 當 chars[newLeft] == middle 的時候還有優化空間
//    public void myShort(char[] chars, int left, int right) {
//        // ascii 0~9 = 48~57
//        if (chars.length == 0 || chars.length == 1) return;
//        char middle = chars[0], tmp;
//        // count: 紀錄正好跟 middle 值相等的數量
//        int newLeft = left, newRight = right;
//        // 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
//        while (newLeft < newRight) {
//            // 小於或是相當放左邊
//            while (newLeft < newRight && chars[newLeft] <= middle) newLeft++;
//            while (newLeft < newRight && chars[newRight] > middle) newRight--;
//            tmp = chars[newLeft];
//            chars[newLeft] = chars[newRight];
//            chars[newRight] = tmp;
//        }
//        System.out.println(newLeft);
//        System.out.println(newRight);
//    }
}
