package questions.q56;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 2024.04.01
 */
class Solution240401 {

    public int[][] merge(int[][] intervals) {

        if(intervals.length < 2) return intervals;

        ArrayList<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

        int start = intervals[0][0], end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            // 不連續
            if(intervals[i][0] > end) {
                result.add(new int[]{start, end});
                start = intervals[i][0];
            }
            end = Math.max(end, intervals[i][1]);
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[0][0]);
    }


    public static void main(String[] args) {
        Solution240401 solution240401 = new Solution240401();

        // [[1,6],[8,10],[15,18]]
        //int[][] arrs = new int[][] {{1,3},{2,6},{8,10},{15,18}};

        // [[1,5]]
        //int[][] arrs = new int[][] {{1,4},{4,5}};

        // [[1,4]]
        int[][] arrs = new int[][] {{1,4},{2,3}};

        arrs = solution240401.merge(arrs);

        for(int[] arr : arrs) {
            System.out.println(Arrays.toString(arr));
        }
    }
}


