public class MaxSubArrayByKadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 1, 4, -7, 45, -90, -6, -440, -67, 400 };
        // int[] arr = { 1 };
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] nums) {
        int currsum = 0, maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currsum = currsum + nums[i];
            maxsum = Math.max(maxsum, currsum);
            if (currsum <= 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }
}
