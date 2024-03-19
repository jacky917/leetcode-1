package questions.q135;

/**
 * 2024.03.02
 */
class Solution240302 {

    public int candy(int[] ratings) {
        int[] tmp = new int[ratings.length];
        tmp[0] = 1;
        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i - 1] < ratings[i]) {
                tmp[i] = tmp[i - 1] + 1;
            } else {
                tmp[i] = 1;
            }
        }
        int result = tmp[ratings.length - 1];
        for(int i = ratings.length -2 ; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                tmp[i] = Math.max(tmp[i],tmp[i + 1] + 1);
            }
            result += tmp[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Solution240302 solution240302 = new Solution240302();
//        System.out.println(solution240302.candy(new int[]{1,3,2,2,1})); // 7
//        System.out.println(solution240302.candy(new int[]{5,4,1,2,3})); // 11
//        System.out.println(solution240302.candy(new int[]{1,2,4,3,2,1})); // 13
        System.out.println(solution240302.candy(new int[]{1,2,87,87,87,2,1})); // 13
//        System.out.println(solution240302.candy(new int[]{1,2,87,87,87,2,1})); // 13
//        System.out.println(solution240302.candy(new int[]{1,3,4,5,2})); // 11
    }
}


