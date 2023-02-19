package questions.l50;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class l50_230219 {
    public char firstUniqChar(String s) {
        LinkedHashMap<Character, Boolean> linkedHashMap = new LinkedHashMap<>();
        for (Character c : s.toCharArray()) {
            if (linkedHashMap.containsKey(c)) {
                linkedHashMap.put(c, false);
            }else {
                linkedHashMap.put(c, true);
            }
        }
        for (Character c : linkedHashMap.keySet()) {
            if (linkedHashMap.get(c)) return c;
        }
        return ' ';
    }
}
