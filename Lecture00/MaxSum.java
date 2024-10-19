public class MaxSum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 4, 5 }, { 2, 6, 500 }, { 7, 90, 89 } };
        System.out.println(maxsum(arr));
    }

    static int maxsum(int[][] arr) {
                int sum2 = 0;
        for (int[] row : arr) {
            int sum = 0;
            for (int element : row) {
                sum = sum + element;
            }
            if (sum > sum2) {
                sum2 = sum;
            }
        }
        return sum2;
    }
}