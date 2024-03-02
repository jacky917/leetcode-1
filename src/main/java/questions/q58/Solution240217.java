package questions.q58;

/**
 * 2024.02.17
 */
class Solution240217 {
    public int lengthOfLastWord(String s) {
        int right = s.length() -1;
        while(s.charAt(right) == ' ') right--;
        int left = right;
        while(left > 0) {
            if(s.charAt(left) != ' ') left --;
            else break;
        }
        System.out.println(right);
        System.out.println(left);
        return (s.charAt(left) == ' ') ? right - left : right - left + 1;
    }

    public static void main(String[] args) {
        Solution240217 solution240217 = new Solution240217();
        System.out.println(solution240217.lengthOfLastWord("b"));
    }
}


