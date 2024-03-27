package questions.q30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 2024.03.26
 */
class Solution240326 {

    public List<Integer> findSubstring(String s, String[] words) {

        int winSize = words[0].length();
        int numWords = words.length;


        ArrayList<Integer> result = new ArrayList<>();
        if(winSize * numWords > s.length()) return result;

        HashMap<String, Integer> mainMap = new HashMap<>();
        HashMap<String, Integer> wordsMap = new HashMap<>();

        for(String word : words) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }

        // e.g.
        // barfoothefoobarman
        // 1.barfoo
        // 2.arfoot
        // 3.rfooth
        // 後面的組合靠位移
        for(int i = 0; i < winSize; i++) {
            if(i + winSize * numWords > s.length()) return result;
            int distance = numWords;
            for(int j = 0; j < numWords; j++) {
                // 當前的窗口（長度等於winSize）
                String subString = s.substring(i + j * winSize, i + j * winSize + winSize);
                // 紀錄當前子字串的內容（由多個窗口組成）
                mainMap.put(subString, mainMap.getOrDefault(subString, 0) + 1);
                if(wordsMap.getOrDefault(subString, 0) != 0 && mainMap.getOrDefault(subString, 0) <= wordsMap.getOrDefault(subString, 0)) {
                    distance --;
                }
            }
            // e.g.
            // left = 0
            // winSize = 3
            // numWords = 2
            // s.length() = 6
            // -> 還需要進去一次
            int left = i, right = i + winSize * numWords;
            System.out.println(s.substring(left, right));
            while(left + winSize * numWords <= s.length()) {
                if(distance == 0) {
                    result.add(left);
                }
                // 可否繼續位移
                if(right + winSize <= s.length()) {
                    // 左邊要刪除的窗口
                    String leftWin = s.substring(left, left + winSize);
                    // 右邊要增加的窗口
                    String rightWin = s.substring(right, right + winSize);

                    // 刪除左窗口
                    mainMap.put(leftWin, mainMap.getOrDefault(leftWin, 0) - 1);

                    if(wordsMap.getOrDefault(leftWin, 0) != 0 && mainMap.getOrDefault(leftWin, 0) < wordsMap.getOrDefault(leftWin, 0)) {
                        distance ++;
                    }

                    // 新增右窗口
                    mainMap.put(rightWin, mainMap.getOrDefault(rightWin, 0) + 1);

                    if(wordsMap.getOrDefault(rightWin, 0) != 0 && mainMap.getOrDefault(rightWin, 0) <= wordsMap.getOrDefault(rightWin, 0)) {
                        distance --;
                    }
                    left += winSize;
                    right += winSize;
                } else {
                    // 退出 while
                    left = s.length() + 1;
                }
            }
            mainMap.clear();
        }
        return result;
    }


    public static void main(String[] args) {
        Solution240326 solution240326 = new Solution240326();
        // [0, 9]
        //System.out.println(solution240326.findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
        // []
        //System.out.println(solution240326.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
        // [6, 9, 12]
        //System.out.println(solution240326.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"}));
        // [0]
        //System.out.println(solution240326.findSubstring("ababababab", new String[]{"ababa","babab"}));
        // [0,1,2,3,4,5,6,7,8,9,10]
        System.out.println(solution240326.findSubstring("aaaaaaaaaaaaaa", new String[]{"aa","aa"}));
    }
}


