package questions.q03;

import java.util.HashSet;

/**
 * 2024.03.08
 */
class Solution240308 {

    public int lengthOfLongestSubstring(String s) {
        int p = 0, result = 0;
        // boolean[] arr = new boolean[26];
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            // 不存在
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                //  存在
            } else {
                result = Math.max(result, i - p);
                while(set.contains(s.charAt(i))) {
                    set.remove(s.charAt(p));
                    p ++;
                }
                set.add(s.charAt(i));
            }
        }
        result = Math.max(result, s.length() - p);
        return result;
    }


    public static void main(String[] args) {
        Solution240308 solution240308 = new Solution240308();
        System.out.println(solution240308.lengthOfLongestSubstring("dvdf"));
    }
}


