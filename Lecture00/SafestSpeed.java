import java.util.*;

public class SafestSpeed {
    public static void main(String[] args) {
        int dist = 400;
        int time = 2;
        System.out.println(binarySearch(dist, time));
    }

    static boolean check(int speed, int dist, int time) {
        int dist2 = speed * time;
        return dist2 >= dist;
    }

    static int binarySearch(int dist, int time) {
        int start = 0;
        int end = 200;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (check(mid, dist, time)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}