package questions.q151;

/**
 * 2024.02.26
 */
class Solution240226 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean flag = false;
        int end = s.length();
        while(' ' == s.charAt(end - 1)) end -- ;
        for(int i = 0; i < end; i ++) {
            // 如果是字母
            if(' ' != s.charAt(i)) {
                word.append(s.charAt(i));
                flag = true;
            // 空格不重複
            } else if (flag) {
                word.insert(0,' ');
                result.insert(0,word);
                word = new StringBuilder();
                flag = false;
            }
        }
        result.insert(0,word);
        return result.toString();
    }
    public static void main(String[] args) {
        Solution240226 solution240226 = new Solution240226();
        System.out.println(solution240226.reverseWords("        the sky   is    blue           "));
    }
}


