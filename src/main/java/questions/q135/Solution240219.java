package questions.q135;

import java.util.ArrayList;

/**
 * 2024.02.19
 */
class Solution240219 {

    // 錯誤
//    public int candy(int[] ratings) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        if(ratings.length == 1) return 1;
//        int sum = 0, right = 1, cur = 1;
//        while(right < ratings.length && ratings[right] < ratings[right-1]){
//            System.out.print(cur + ",");
//            arr.add(cur);
//            sum += cur;
//            right ++;
//            cur ++;
//        }
//        arr.add(cur);
//        sum += cur;
//        cur = 1;
//        int left = right - 1;
//        while(right < ratings.length){
//            if(ratings[right-1] < ratings[right]) {
//                left = right - 1;
//                if(cur < 1 && ((right + 1) >= ratings.length||ratings[right] <= ratings[right + 1])) {
//                    System.out.println("\n補" + (right - left) * (1 - cur) + ",left=" + left + ",right=" + right + ",cur=" + cur);
//                    sum += (right - left) * (1 - cur);
//                    cur = 1;
//                    left = right;
//                }
//                cur ++;
//            } else if (ratings[right-1] > ratings[right]) {
//                cur --;
//                if(cur < 1 && ((right + 1) >= ratings.length||ratings[right] <= ratings[right + 1])) {
//                    System.out.println("\n補" + (right - left) * (1 - cur) + ",left=" + left + ",right=" + right + ",cur=" + cur);
//                    sum += (right - left) * (1 - cur);
//                    left = right;
//                }
//            } else {
//                left = right - 1;
//                if(cur < 1 && ((right + 1) >= ratings.length||ratings[right] <= ratings[right + 1])) {
//                    System.out.println("\n補" + (right - left) * (1 - cur) + ",left=" + left + ",right=" + right + ",cur=" + cur);
//                    sum += (right - left) * (1 - cur);
//                    left = right;
//                }
//                cur = 1;
//            }
//            arr.add(cur);
//            sum += cur;
//            System.out.print(cur + ",");
//            right ++;
//        }
//        System.out.println("\n=======");
//        System.out.println(arr);
//        return sum;
//    }

    // 解答
    public int candy(int[] ratings) {
        int n = ratings.length; // 孩子的總數
        ArrayList<Integer> arr = new ArrayList<>();
        int ret = 1; // 總糖果數，至少一個孩子，至少一顆糖
        arr.add(ret);
        int inc = 1, dec = 0, pre = 1; // 初始化遞增序列長度為1，遞減序列長度為0，上一個孩子分到的糖果數為1
        for (int i = 1; i < n; i++) { // 從第二個孩子開始遍歷
            if (ratings[i] >= ratings[i - 1]) { // 如果當前孩子的評分大於等於前一個孩子的評分
                dec = 0; // 重置遞減序列的長度為0
                pre = ratings[i] == ratings[i - 1] ? 1 : pre + 1; // 如果評分相同，pre重置為1；如果評分更高，pre遞增
                arr.add(pre);
                ret += pre; // 更新總糖果數
                inc = pre; // 更新遞增序列的長度為當前pre值
            } else { // 如果當前孩子的評分小於前一個孩子的評分
                dec++; // 遞減序列長度遞增
                if (dec == inc) { // 如果遞減序列的長度等於之前的遞增序列長度，需要額外增加一顆糖果以確保遞增序列起點的孩子糖果數足夠
                    dec++;
                }
                arr.add(dec);
                ret += dec; // 更新總糖果數
                pre = 1; // 由於是遞減序列，重置pre為1
            }
        }
        System.out.println(arr);
        return ret; // 返回總糖果數
    }


    public static void main(String[] args) {
        Solution240219 solution240219 = new Solution240219();
//        System.out.println(solution240219.candy(new int[]{1,3,2,2,1})); // 7
//        System.out.println(solution240219.candy(new int[]{5,4,1,2,3})); // 11
        System.out.println(solution240219.candy(new int[]{1,2,4,3,2,1})); // 13
//        System.out.println(solution240219.candy(new int[]{1,2,87,87,87,2,1})); // 13
//        System.out.println(solution240219.candy(new int[]{1,3,4,5,2})); // 11
    }
}


