package questions240213.l53_2;

public class l53_02_230131 {

    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = (left + right)/2;
            // 缺的數字在左側
            if(nums[mid]>mid) right = mid;
            // 缺的數字在右側
            else left = mid + 1;
        }
        if (left == nums.length - 1 && nums[nums.length - 1] == left) return nums.length;
        return nums[left]-1;
    }
}


