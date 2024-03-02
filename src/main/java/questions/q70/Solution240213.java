package questions.q70;

/**
 * 2024.02.13
 */
class Solution240213 {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int pre = 1,now = 2,next = 3, index = 3;
        while(index != n) {
            pre = now;
            now = next;
            next = pre + now;
            index ++;
        }
        return pre + now;
    }

    public static void main(String[] args) {
        Solution240213 test = new Solution240213();
        System.out.println(test.climbStairs(10));
    }

}


