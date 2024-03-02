package questions.q06;

import java.util.*;

/**
 * 2024.02.22
 */
class Solution240222 {

    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        HashMap<Integer, StringBuilder> hashMap = new HashMap<>();
        for(int i = 0; i < numRows; i ++) {
            System.out.println("index = " + i);
            hashMap.put(i, new StringBuilder());
        }
        System.out.println("========");
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            // 2 * numRows - 2 一組
            int index = i % (2 * numRows - 2);
            System.out.println("index = " + index);
            if(index >= numRows) {
                index = (2 * numRows - 2) - index;
            }
            System.out.println("index = " + index);
            System.out.println("---");
            hashMap.get(index).append(s.charAt(i));
        }
        hashMap.forEach((x,y) -> builder.append(y));
        return builder.toString();
    }


    public static void main(String[] args) {
        Solution240222 solution240222 = new Solution240222();
        System.out.println(solution240222.convert("PAYPALISHIRING", 3));
    }
}


