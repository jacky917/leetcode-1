package questions.l03;

public class l03_answer {
    public int findRepeatNumber(int[] nums) {
        int tmp, i = 0;
        while (i < nums.length) {
            // 值已經在目標位置上，跳過
            if (nums[i] == i) {
                i++;
                continue;
            }
            // 發現重複數字
            if (nums[i] == nums[nums[i]]) return nums[i];
            // 不相等，則交換位置
            tmp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = tmp;
        }
        return -1;
    }
}
