package questions.q380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * 2024.03.01
 */
class Solution240301 {

    HashMap<Integer,Integer> map;
    ArrayList<Integer> arr;
    Random random;

    public Solution240301() {
        random = new Random();
        map = new HashMap<>();
        arr = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val,arr.size());
        arr.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        // 要刪除的內容
        Integer integer1 = map.get(val);
        map.remove(val);
        // 要更換位置的內容
        Integer integer2 = arr.get(arr.size() - 1);

        arr.remove(arr.size() - 1);
        // 在 integer1 位置插入 integer2

        // 移除的元素剛好是最後一個
        if(arr.size() == integer1) return true;

        if(arr.size() == 0) return true;

        arr.set(integer1,integer2);

        // 更新 integer2 的位置
        map.put(integer2,integer1);
        return true;
    }

    public int getRandom() {
        return arr.get(random.nextInt(arr.size()));
    }

    public void print() {
        System.out.println(arr);
    }

    public static void main(String[] args) {
        Solution240301 solution240301 = new Solution240301();
//        System.out.println(solution240301.insert(1));
//        System.out.println(solution240301.remove(2));
//        System.out.println(solution240301.insert(2));
//        System.out.println(solution240301.getRandom());
//        System.out.println(solution240301.remove(1));
//        System.out.println(solution240301.insert(2));
//        System.out.println(solution240301.getRandom());
        System.out.println(solution240301.insert(3));
        solution240301.print();
        System.out.println(solution240301.insert(3));
        solution240301.print();
        System.out.println(solution240301.getRandom());
        solution240301.print();
        System.out.println(solution240301.getRandom());
        solution240301.print();
        System.out.println(solution240301.insert(1));
        solution240301.print();
        System.out.println(solution240301.remove(3));
        solution240301.print();
        System.out.println(solution240301.getRandom());
        System.out.println(solution240301.getRandom());
        System.out.println(solution240301.insert(0));
        solution240301.print();
        System.out.println(solution240301.remove(0));
    }
}


