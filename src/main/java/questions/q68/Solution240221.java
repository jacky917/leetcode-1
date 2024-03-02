package questions.q68;

import java.util.ArrayList;
import java.util.List;

/**
 * 2024.02.21
 * (僅僅只是拿掉HashMap而已)
 * 時間複雜度 擊敗 100.00% 使用 Java 的用户
 * 空間複雜度 擊敗 39.83% 使用 Java 的用户
 */
class Solution240221 {

    private String[] words;
    private int maxWidth;

    /**
     * 分組
     * @param left 起始下標
     * @return 結束下標
     */
    public int group(int left) {
        // sum 總長度
        // adjust 空格數量
        int sum = 0, right = left;
        while (right < words.length) {
            // right - left 最少所需空格
            if (maxWidth >= sum + words[right].length() + right - left) {
                // 沒超出最大長度
                sum += words[right].length();
                right ++;
            } else {
                // 超出最大長度直接返回
                return right;
            }
        }
        // 成功將最後一個字串放入當前分組中
        return right;
    }

    /**
     * 填充空格直到和 maxWidth 等長
     * @param s 原字符串
     * @return 填充後的字符串
     */
    public String fillSpace(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        while(builder.length() < maxWidth) {
            builder.append(" ");
        }
        return builder.toString();
    }

    public String fillSpace(StringBuilder builder) {
        while(builder.length() < maxWidth) {
            builder.append(" ");
        }
        return builder.toString();
    }

    /**
     * 分散置中（左右無空格）
     * @param left  左下標
     * @param right 右下標
     * @return 填充後的字符串
     */
    public String spaceBetween(int left, int right) {

        // 字符串數量 -1
        int count = (right - left - 1);

        if(count == 0) {
            return fillSpace(words[left]);
        }

        StringBuilder builder = new StringBuilder();

        // 總字符數
        int s_len = 0;
        for(int i = left; i < right ; i ++) {
            s_len += words[i].length();
        }

        // 總空格數
        int space = maxWidth - s_len;
        // 平均分配空格
        int avg_space = space / count;
        // 剩餘空格
        int mod_space = space % count;

        for(int i = left; i < right; i++) {
            builder.append(words[i]);

            if((i - left) < mod_space)
                builder.append(' ');
            if (i < right - 1) {
                for (int j = 0; j < avg_space; j++) {
                    builder.append(' ');
                }
            }
        }
        return builder.toString();
    }

    /**
     * 靠左對齊
     * @param left  左下標
     * @param right 右下標
     * @return 填充後的字符串
     */
    public String start(int left, int right) {
        StringBuilder builder = new StringBuilder();
        for(int i = left; i < right; i++) {
            builder.append(words[i]);
            if(i < right - 1) builder.append(" ");
        }
        return fillSpace(builder);
    }

    public void print(int left, int right) {
        // 總字符數
        int s_len = 0;
        for(int i = left; i < right ; i ++) {
            s_len += words[i].length();
        }
        System.out.println("len = " + s_len);
        for (int i = left; i < right; i++) {
            System.out.print(words[i] + ",");
        }
        System.out.println();
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        this.words = words;
        this.maxWidth = maxWidth;
        ArrayList<String> result = new ArrayList<>();
        int left = 0;
        while (left < words.length) {
            int right = group(left);
            System.out.println(left + "," +right);
            print(left, right);
            System.out.println("---------");
            if (right == words.length) result.add(start(left, right));
            else result.add(spaceBetween(left, right));
            left = right;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution240221 solution240221 = new Solution240221();
        List<String> result = solution240221.fullJustify(new String[]{"Science", "is", "what",
                "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art"
                , "is", "everything", "else", "we", "do"}, 20);
//        List<String> result = solution240220.fullJustify(new String[]{"What",
//                "must","be","acknowledgment","shall","be"}, 16);
        for(String s : result) {
            System.out.println("|" + s + "|" + s.length());
        }
    }
}


