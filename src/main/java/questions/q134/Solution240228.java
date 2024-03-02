package questions.q134;

/**
 * 2024.02.28
 */
class Solution240228 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, now, result = -1, max = 0, cur = 0;
        // 尋找到了第一個正數
        while(start == 0 && gas[start] - cost[start] < 0) start++;
        now = start;

        for(int i = 0; i < gas.length; i++) {
            int index = (start + i) % gas.length;
            if(gas[index] - cost[index] > 0) {
                cur += gas[index] - cost[index];
                if(max < cur) {
                    result = now;
                    max = cur;
                }
            } else {
                cur = 0;
                now = (index + 1) % gas.length;
            }
        }

        if(result == -1) return result;

        int check = gas[result] - cost[result];

        for(int i = 0; i < gas.length; i++) {
            int index = (result + i + 1) % gas.length;
            check += gas[index] - cost[index];
            if(check < 0) return -1;
        }

        return result;
    }


    public static void main(String[] args) {
        Solution240228 solution240228 = new Solution240228();
//        int[] gas = new int[]{1,2,3,4,5};
//        int[] cost = new int[]{3,4,5,1,2};

//        int[] gas = new int[]{2,3,4};
//        int[] cost = new int[]{3,4,3};

//        int[] gas = new int[]{3,3,4};
//        int[] cost = new int[]{3,4,4};

        int[] gas = new int[]{5,8,2,8};
        int[] cost = new int[]{6,5,6,6};
        System.out.println(solution240228.canCompleteCircuit(gas,cost));
    }
}


