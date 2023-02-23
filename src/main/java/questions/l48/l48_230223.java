package questions.l48;

import java.util.HashMap;
import java.util.HashSet;

public class l48_230223 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = 0, result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i]) && left <= map.get(chars[i])) {
                result = Math.max(result, right - left);
                left = map.get(chars[i]) + 1;
            }
            right ++;
            map.put(chars[i], i);
        }
        result = Math.max(result, right - left);
        return result;
    }
}
