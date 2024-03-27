package questions.q30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2024.03.20
 */
class Solution240320 {

    // 超出时间限制
//    public HashMap<String, Integer> countWords(String[] words) {
//        HashMap<String, Integer> map = new HashMap<>();
//        for(String s : words) {
//            if(map.containsKey(s))
//                map.put(s, map.get(s) + 1);
//            else map.put(s, 1);
//        }
//        return map;
//    }
//    public List<Integer> findSubstring(String s, String[] words) {
//        HashMap<String, Integer> map = countWords(words);
//        ArrayList<Integer> result = new ArrayList<>();
//
//        int winSize = words[0].length();
//
//        for(int i = 0; i <= s.length() - words.length * winSize; i ++) {
//            for(int j = 0; j < words.length; j ++) {
//                String subString = s.substring(i + j * winSize, i + j * winSize + winSize);
//                if(map.containsKey(subString) && map.get(subString) > 0) {
//                    map.put(subString, map.get(subString) - 1);
//                    if(j == words.length - 1) result.add(i);
//                } else {
//                    break;
//                }
//            }
//            map = countWords(words);
//        }
//        return result;
//    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        int m = words.length, n = words[0].length(), ls = s.length();
        for (int i = 0; i < n; i++) {
            if (i + m * n > ls) {
                break;
            }
            Map<String, Integer> differ = new HashMap<String, Integer>();
            for (int j = 0; j < m; j++) {
                String word = s.substring(i + j * n, i + (j + 1) * n);
                differ.put(word, differ.getOrDefault(word, 0) + 1);
            }
            for (String word : words) {
                differ.put(word, differ.getOrDefault(word, 0) - 1);
                if (differ.get(word) == 0) {
                    differ.remove(word);
                }
            }
            for (int start = i; start < ls - m * n + 1; start += n) {
                if (start != i) {
                    String word = s.substring(start + (m - 1) * n, start + m * n);
                    differ.put(word, differ.getOrDefault(word, 0) + 1);
                    if (differ.get(word) == 0) {
                        differ.remove(word);
                    }
                    word = s.substring(start - n, start);
                    differ.put(word, differ.getOrDefault(word, 0) - 1);
                    if (differ.get(word) == 0) {
                        differ.remove(word);
                    }
                }
                if (differ.isEmpty()) {
                    res.add(start);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution240320 solution240320 = new Solution240320();
        // [0, 9]
        System.out.println(solution240320.findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
        // []
        System.out.println(solution240320.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
        // [6, 9, 12]
        System.out.println(solution240320.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"}));
    }
}


