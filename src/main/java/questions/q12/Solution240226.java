package questions.q12;

/**
 * 2024.02.26
 */
class Solution240226 {

    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000

    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        while(num > 0) {
            if(num >= 1000) {
                builder.append("M");
                num -= 1000;
            } else if(num >= 900) {
                builder.append("CM");
                num -= 900;
            } else if(num >= 500) {
                builder.append("D");
                num -= 500;
            } else if(num >= 400) {
                builder.append("CD");
                num -= 400;
            } else if(num >= 100) {
                builder.append("C");
                num -= 100;
            } else if(num >= 90) {
                builder.append("XC");
                num -= 90;
            } else if(num >= 50) {
                builder.append("L");
                num -= 50;
            } else if(num >= 40) {
                builder.append("XL");
                num -= 40;
            } else if(num >= 10) {
                builder.append("X");
                num -= 10;
            } else if(num >= 9) {
                builder.append("IX");
                num -= 9;
            } else if(num >= 5) {
                builder.append("V");
                num -= 5;
            } else if(num >= 4) {
                builder.append("IV");
                num -= 4;
            } else {
                builder.append("I");
                num -= 1;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution240226 solution240226 = new Solution240226();
        System.out.println(solution240226.intToRoman(1994));
    }
}


