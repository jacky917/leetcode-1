package questions.q202;

import java.util.HashSet;

/**
 * 2024.04.04
 */
class Solution240404 {

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true) {
            int sum = 0;
            while(n > 0) {
                int t = n % 10;
                sum += t * t;
                n /= 10;
            }
            if(sum == 1) return true;
            if(set.contains(sum)) return false;
            set.add(sum);
            n = sum;
        }
    }

    public static void main(String[] args) {
        Solution240404 solution24404 = new Solution240404();
        System.out.println(solution24404.isHappy(19));
    }
}


