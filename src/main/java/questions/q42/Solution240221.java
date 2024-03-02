package questions.q42;

/**
 * 2024.02.21
 */
class Solution240221 {

//    public int trap(int[] height) {
//        int pillar = height[0], whole = 0, left = 0, right = height.length -1, level = 0;
//        while(left <= right) {
//            while(left <= right && height[left] < level) {
//                left++;
//                pillar += height[left];
//            }
//            while(left <= right && height[right] < level) right--;
//            if(left == right) {
//                whole += height[left];
//                whole -= level;
//                System.out.println("+" + height[left]);
//                System.out.println("-" + level);
//                break;
//            // 左右兩邊高度相等
//            } else if(height[left] == height[right]) {
//                int tmp = (height[left] - level) * (right - left + 1);
//                whole += (tmp > 0 && height[left] > level) ? tmp : 0;
//                if(tmp > 0  && height[left] > level) System.out.println("+" + tmp);
//                level = height[left];
//                left ++;
//                right --;
//                pillar += height[left];
//            // 左邊小於右邊
//            } else if (height[left] < height[right]) {
//                whole += height[left];
//                System.out.println("+" + height[left]);
//                whole -= level;
//                System.out.println("-" + level);
//                left ++;
//                pillar += height[left];
//            // 右邊小於左邊
//            } else {
//                whole += height[right];
//                System.out.println("+" + height[right]);
//                whole -= level;
//                System.out.println("-" + level);
//                right --;
//            }
//        }
//        left ++;
//        while(left < height.length) {
//            pillar += height[left];
//            left ++;
//        }
//        System.out.println("whole = " + whole);
//        System.out.println("pillar = " + pillar);
//        return whole - pillar;
//    }

    public int trap(int[] height) {
        int pillar = height[0], whole = 0, left = 0, right = height.length -1, level = 0;
        while(left <= right) {
            while(left <= right && height[left] < level) {
                left++;
                pillar += height[left];
            }
            while(left <= right && height[right] < level) right--;
            if(left == right) {
                whole += height[left];
                whole -= level;
                System.out.println("+" + height[left]);
                System.out.println("-" + level);
                break;
                // 左右兩邊高度相等
            } else if(height[left] == height[right]) {
                int tmp = (height[left] - level) * (right - left + 1);
                whole += (tmp > 0 && height[left] > level) ? tmp : 0;
                if(tmp > 0  && height[left] > level) System.out.println("+" + tmp);
                level = height[left];
                left ++;
                right --;
                pillar += height[left];
                // 左邊小於右邊
            } else if (height[left] < height[right]) {
                int tmp = (height[left] - level) * (right - left + 1);
                whole += (tmp > 0 && height[left] > level) ? tmp : 0;
                if(tmp > 0  && height[left] > level) System.out.println("+" + tmp);
                level = height[left];
                left ++;
                pillar += height[left];
                // 右邊小於左邊
            } else {
                int tmp = (height[right] - level) * (right - left + 1);
                whole += (tmp > 0 && height[left] > level) ? tmp : 0;
                if(tmp > 0  && height[left] > level) System.out.println("+" + tmp);
                level = height[right];
                right --;
            }
        }
        left ++;
        while(left < height.length) {
            pillar += height[left];
            left ++;
        }
        System.out.println("whole = " + whole);
        System.out.println("pillar = " + pillar);
        return whole - pillar;
    }
    public static void main(String[] args) {
        Solution240221 solution240221 = new Solution240221();
//        System.out.println(solution240221.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(solution240221.trap(new int[]{4,2,0,3,2,5}));
    }
}


