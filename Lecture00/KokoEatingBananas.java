public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        System.out.println(minEatingSpeed(piles, 8));
    }

    static boolean check(int eatingSpeed, int[] piles, int h) {

        int temp = 0;

        for (int i = 0; i < piles.length; i++) {

            temp += piles[i] / eatingSpeed;

            int rem = piles[i] % eatingSpeed;

            if (rem != 0)
                temp++;

        }

        return (temp <= h);

    }

    static int minEatingSpeed(int[] piles, int h) {

        int low = 1, high = (int) Math.pow(10, 9);

        int ans = -1;

        while (low <= high) {

            int mid = high - (high - low) / 2;

            if (check(mid, piles, h)) {

                ans = mid;

                high = mid - 1;

            } else

                low = mid + 1;

        }

        return ans;

    }

}