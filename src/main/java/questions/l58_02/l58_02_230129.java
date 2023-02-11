package questions.l58_02;

public class l58_02_230129 {

    public String reverseLeftWords(String s, int n) {
        if (n <= 0 || n >= s.length()) return s;

        StringBuilder result = new StringBuilder();

        char[] chars = s.toCharArray();

        for (int i = n; i < chars.length; i++) {
            result.append(chars[i]);
        }
        for (int i = 0; i < n; i++) {
            result.append(chars[i]);
        }
        return result.toString();
    }
}
