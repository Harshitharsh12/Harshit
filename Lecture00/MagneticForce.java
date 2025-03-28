import java.util.*;

class MagneticForce {
    public static void main(String[] args) {
        int[] position = { 1, 2, 3, 4, 7 };
        System.out.println(maxDistance(position, 3));
    }

    static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1, high = position[position.length - 1] - position[0];

        int ans = 1;

        while (low <= high) {

            int mid = high - (high - low) / 2;

            if (check(mid, position, m)) {

                ans = mid;
                low = mid + 1;

            } else
                high = mid - 1;

        }
        return ans;

    }

    static boolean check(int distance, int[] arr, int balls) {

        int count = 1;

        int lastpos = arr[0];

        for (int i = 1; i < arr.length && count < balls; i++)

            if (arr[i] - lastpos >= distance) {

                lastpos = arr[i];
                count++;

            }

        return count == balls;

    }
}