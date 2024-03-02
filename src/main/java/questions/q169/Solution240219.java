package questions.q169;

/**
 * 2024.02.19
 */
class Solution240219 {

    public int majorityElement(int[] nums) {
        assert nums.length > 0;
        int result = nums[0], count = 1;
        for(int i = 1; i< nums.length; i++) {
            if(nums[i] == result) count ++;
            else {
                if(count == 1) {
                    result = nums[i];
                } else {
                    count --;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution240219 solution240219 = new Solution240219();
        System.out.println(solution240219.majorityElement(new int[]{2,2,1,1,1}));
    }
}


