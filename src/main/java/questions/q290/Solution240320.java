package questions.q290;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 2024.03.20
 */
class Solution240320 {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < words.length; i ++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(words[i])) return false;
            } else {
                if(set.contains(words[i])) return false;
                set.add(words[i]);
                map.put(pattern.charAt(i),words[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution240320 solution240320 = new Solution240320();
        System.out.println(solution240320.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(solution240320.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(solution240320.wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(solution240320.wordPattern("abba", "dog dog dog dog")); // false
    }
}


