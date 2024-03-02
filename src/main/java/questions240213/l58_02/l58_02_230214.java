package questions240213.l58_02;

public class l58_02_230214 {

    // 速度稍快一點
    public String reverseLeftWords1(String s, int n) {
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = n; i < (chars.length + n); i++) {
            builder.append(chars[i % chars.length]);
        }
        return builder.toString();
    }

    public String reverseLeftWords2(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = n; i < (s.length() + n); i++) {
            builder.append(s.charAt(i % s.length()));
        }
        return builder.toString();
    }
}
