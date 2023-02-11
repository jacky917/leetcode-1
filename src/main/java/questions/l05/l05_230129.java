package questions.l05;

public class l05_230129 {
    public String replaceSpace(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()){
            if(c == ' ') result.append("%20");
            else result.append(c);
        }
        return result.toString();
    }
}
