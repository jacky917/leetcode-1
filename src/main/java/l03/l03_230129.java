package l03;

/**
 * 有問題，具體看解答
 */
public class l03_230129 {
    public int findRepeatNumber(int[] nums) {
        int tmp, i = 0;
        while (i < nums.length) {
            // 發現重複數字
            if (nums[i] == nums[nums[i]]) return nums[i];
            // 值已經在目標位置上，跳過 <---錯了，這要先判斷
            if (nums[i] == i) {
                i++;
                continue;
            }
            // 不相等，則交換位置
            tmp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = tmp;
        }
        return -1;
    }
}

