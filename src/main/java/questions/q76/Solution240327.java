package questions.q76;

/**
 * 2024.03.27
 */
class Solution240327 {
    public String minWindow(String s, String t) {

        // 長字符串
        int[] sArr = new int[58];
        // 短字符串
        int[] tArr = new int[58];

        for(int i = 0; i < t.length(); i++) {
            tArr[t.charAt(i) - 'A'] ++;
        }

        int distance = t.length();

        int left = 0, right = 0;

        int min = Integer.MAX_VALUE, minLeft = 0, minRight = 0;

        while(right < s.length()) {
            while(distance != 0 && right < s.length()) {
                if(tArr[s.charAt(right) - 'A'] != 0 && sArr[s.charAt(right) - 'A'] < tArr[s.charAt(right) - 'A']) {
                    distance--;
                }
                sArr[s.charAt(right) - 'A']++;
                right ++;
                if(right > s.length()) return (min == Integer.MAX_VALUE) ? "" : s.substring(minLeft, minRight);
            }
            while(distance == 0) {
                if(tArr[s.charAt(left) - 'A'] != 0 && sArr[s.charAt(left) - 'A'] <= tArr[s.charAt(left) - 'A']) {
                    if(min > right - left) {
                        minLeft = left;
                        minRight = right;
                        min = right - left;
                    }
                    distance++;
                }
                sArr[s.charAt(left) - 'A']--;
                left ++;
            }
        }
        return (min == Integer.MAX_VALUE) ? "" : s.substring(minLeft, minRight);
    }

    public static void main(String[] args) {
        Solution240327 test = new Solution240327();
        System.out.println(test.minWindow("ADOBECODEBANC", "ABC")); // "BANC"
        System.out.println(test.minWindow("a", "a")); // "a"
        System.out.println(test.minWindow("a", "aa")); // ""
    }

}


