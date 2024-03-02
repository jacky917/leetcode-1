package questions240213.l48;

import java.util.HashSet;

public class l48_230205 {
    // left 當前字符串的左邊界
    // right 當前字符串的右邊界
    // result 解答
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int left = 0, right = 0, result = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            // 右邊遇到重複字符
            // 移動左指針，直到找到左邊界重複的字符
            if (set.contains(c)) {
                while (s.charAt(left) != c) {
                    set.remove(s.charAt(left));
                    left++;
                };
                left++;
            } else {
                set.add(c);
            }
            right++;
            result = Math.max(result, right - left);
        }
        return result;
    }
}
