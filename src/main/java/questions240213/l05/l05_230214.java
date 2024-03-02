package questions240213.l05;

public class l05_230214 {
    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ')
                builder.append("%20");
            else builder.append(c);
        }
        return builder.toString();
    }
}
