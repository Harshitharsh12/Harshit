import java.util.*;

class Leetcode {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };
        int target = 16;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        boolean result = false;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = true;
                    break;
                }
            }
            if (result)
                break;

        }
        return new int[] { i, j };
    }
}