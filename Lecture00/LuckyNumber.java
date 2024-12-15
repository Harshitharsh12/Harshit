import java.util.*;

public class LuckyNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] temp = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][i] = arr[i][j];
            }
        }
        for (int[] e : arr) {
            Arrays.sort(e);
        }
        for (int[] e : temp) {
            Arrays.sort(e);

        }
        int val = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][0] == temp[j][n - 1]) {
                    val = arr[i][0];
                    break;
                }
                if (val != 0)
                    break;
            }
        }
        System.out.println(val);
    }
}
