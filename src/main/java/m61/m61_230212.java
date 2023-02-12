package m61;

import java.util.HashMap;
import java.util.HashSet;

public class m61_230212 {
    public boolean isStraight(int[] nums) {
        int min = 13, max = 1, zero = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            // 重複必定無法連續
            if(num != 0 && set.contains(num)) return false;
            set.add(num);
            if(num == 0) {
                zero++;
                continue;
            }
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // 四張以上0必定連續，max - min 距離超過4必定無法連續
        return zero > 3 || max - min < 5;
    }
}