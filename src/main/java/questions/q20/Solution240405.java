package questions.q20;

import java.util.Stack;

/**
 * 2024.03.07
 */
class Solution240405 {

    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.add(s.charAt(i));
            } else {
                if(stack.isEmpty()) return false;
                char p = stack.pop();
                if(c != p + 1 && c != p + 2) return false;
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {

        Solution240405 solution240405 = new Solution240405();

        System.out.println(solution240405.isValid("()[]{}"));

    }
}


