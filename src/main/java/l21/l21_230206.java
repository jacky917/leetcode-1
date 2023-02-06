package l21;

public class l21_230206 {
    public int[] exchange(int[] nums) {
        if(nums.length == 0) return nums;
        int left = 0, right = nums.length -1;
        while (left < right){
            while(left < nums.length && nums[left] % 2 == 1)
                left ++;
            while(right >= 0 && nums[right] % 2 == 0)
                right --;
            if(left < right) change(nums, left, right);
        }
        return nums;
    }

    private void change(int[] nums, int i1, int i2) {
        int tmp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = tmp;
    }
}
