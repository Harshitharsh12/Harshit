import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 78, 2, 6, 7, 75678 };
        System.out.println(findKthLargest(nums, 2));
    }

    static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}