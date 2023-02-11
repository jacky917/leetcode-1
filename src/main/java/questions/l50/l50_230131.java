package questions.l50;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class l50_230131 {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map = new HashMap<>();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,true);
                list.add(c);
            }else {
                map.put(c,false);
            }
        }
        for (char c : list){
            if (map.get(c)) return c;
        }
        return ' ';
    }
}
