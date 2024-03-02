package questions.q28;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 2024.02.15
 */
class Solution240215 {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i ++) {
            int cur = i;
            for(int j = 0; cur < haystack.length() && j < needle.length() && haystack.charAt(cur) == needle.charAt(j); j ++,cur ++) {
                if (j == needle.length() -1) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution240215 solution240215 = new Solution240215();
        System.out.println(solution240215.strStr("sadbutsad","sad"));
    }
}


