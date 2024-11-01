class Solution {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = { 2, 2, 2, 3, 3, 3, 3, 3 };
        System.out.println(majorityElement(arr, n));
    }

    static int majorityElement(int[] nums, int n) {
        int c = 0;
        int N = n / 2;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int element : nums) {
                if (nums[i] == element) {
                    c++;
                }
            }
            if (c >= N + 1) {
                temp = nums[i];
                break;

            } else {
                c = 0;
            }
        }
        return temp;
    }
}