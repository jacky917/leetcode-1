package questions.q76;

/**
 * 2024.03.13
 */
class Solution240313 {
    public String minWindow(String s, String t) {

        // 長字符串
        int[] s_arr = new int[58];
        // 短字符串
        int[] t_arr = new int[58];

        int cnt = t.length();

        for(int i = 0; i < t.length(); i ++) {
            t_arr[t.charAt(i) - 'A'] ++;
        }

        int left = 0, r_left = 0, r_right = 0;

        for(int right = 0; right < s.length(); right ++) {
            s_arr[t.charAt(right) - 'A'] ++;
            if(t_arr[s.charAt(right)] >= s_arr[s.charAt(right)]) {
                // 匹配到一個字符
                cnt--;
            } else if (cnt == 0) {
                // left 位置的字符在 s_arr 中的數量是否大於 t_arr，如果大於則表示當前字符可以直接移除
                while(s_arr[s_arr[t.charAt(left) - 'A']] > t_arr[s_arr[t.charAt(left) - 'A']]){
                    s_arr[s_arr[t.charAt(left) - 'A']] --;
                    left ++;
                }
            }
        }


        return (cnt > 0) ? "" : s.substring(r_left, r_right);
    }

    public static void main(String[] args) {
        Solution240313 test = new Solution240313();
        System.out.println(test.minWindow("ADOBECODEBANC", "ABC"));
    }

}


