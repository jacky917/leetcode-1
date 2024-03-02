package questions.q55;

/**
 * 2024.02.23
 */
class Solution240223 {

    public boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length && i <= max; i ++) {
            max = Math.max(max, i + nums[i]);
        }
        System.out.println("max = " + max);
        System.out.println("nums.length = " + nums.length);
        return max >= nums.length - 1;
    }


    public static void main(String[] args) {
        Solution240223 solution240222 = new Solution240223();
//        System.out.println(solution240222.canJump(new int[] {2,3,1,1,4}));
//        System.out.println(solution240222.canJump(new int[] {3,2,1,0,4}));
        System.out.println(solution240222.canJump(new int[] {1,2,3}));
//        System.out.println(solution240222.canJump(new int[] {0}));
//        System.out.println(solution240222.canJump(new int[] {1,0}));
    }
}


