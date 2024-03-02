package questions.q14;

/**
 * 2024.02.15
 */
class Solution240215 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int min = Integer.MAX_VALUE;
        for(String s : strs) {
            min = Math.min(min,s.length());
        }
        int i = 0;
        String tmp = strs[0];
        for(;i < min; i++) {
            for(String s : strs) {
                if(tmp.charAt(i) != s.charAt(i)) return strs[0].substring(0,i);
                tmp = s;
            }
        }
        return strs[0].substring(0,i);
    }

    public static void main(String[] args) {
        Solution240215 solution240215 = new Solution240215();
        System.out.println(solution240215.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}


