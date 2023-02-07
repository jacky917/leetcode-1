package l58_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class l58_01_230206 {
    public String reverseWordsAPI(String s) {
        String[] list = s.trim().split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            if (!"".equals(list[list.length - i - 1]))
                builder.append(list[list.length - i - 1]).append(" ");
        }
        String result = builder.toString();
        if (result.length() == 0) return "";
        return result.substring(0, result.length() - 1);
    }

    public String reverseWords(String s) {
        StringBuilder tmp = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        // 從後面開始構建 builder
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && tmp.length() > 0) {
                builder.append(tmp).append(" ");
                tmp.setLength(0);
            } else if (s.charAt(i) != ' ') {
                tmp.insert(0, s.charAt(i));
            }
        }
        if (tmp.length() != 0) {
            builder.append(tmp);
            return builder.toString();
        } else if (builder.length() != 0)
            return builder.substring(0, builder.length() - 1);
        else return "";
    }
}
