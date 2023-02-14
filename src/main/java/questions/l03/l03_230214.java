package questions.l03;

public class l03_230214 {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) i++;
            else {
                if (nums[i] == nums[nums[i]]) return nums[i];
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        return -1;
    }
}

