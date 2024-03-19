package questions.q125;

/**
 * 2024.03.06
 */
class Solution240306 {

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() -1;
        while(left < right) {
            if(!Character.isLetter(s.charAt(left))) {
                left ++;
                continue;
            }
            if(!Character.isLetter(s.charAt(right))){
                right --;
                continue;
            }
            if(Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right)))
                return false;
            left ++;
            right --;
        }
        return true;
    }


    public static void main(String[] args) {
        Solution240306 solution240306 = new Solution240306();
        System.out.println(solution240306.isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(solution240306.isPalindrome("     "));
    }
}


