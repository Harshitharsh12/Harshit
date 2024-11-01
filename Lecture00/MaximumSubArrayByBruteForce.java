public class MaximumSubArrayByBruteForce {
    public static void main(String[] args) {
        int[] arr = { 1, 4, -7, 4500, -90, -6, -440, -67, 400 };
        // int[] arr = { 1 };
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        if (arr.length == 1) {
            maxSum = arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
