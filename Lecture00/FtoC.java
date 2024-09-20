import java.util.*;

public class FtoC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int minfValue = sc.nextInt();
        int maxfValue = sc.nextInt();
        int step = sc.nextInt();
        int conversion = 0;
        while (minfValue <= maxfValue) {
            conversion = (5 * (minfValue - 32)) / 9;
            System.out.println(minfValue + " " + conversion);
            minfValue = minfValue + step;
            conversion = 0;
        }
    }
}