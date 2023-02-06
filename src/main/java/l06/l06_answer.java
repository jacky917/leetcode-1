package l06;

import entity.ListNode2;

import java.util.ArrayList;

public class l06_answer {

    // 遞歸法
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode2 head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode2 head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }

//    作者：jyd
//    链接：https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/solution/mian-shi-ti-06-cong-wei-dao-tou-da-yin-lian-biao-d/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
