import java.util.*;

public class TwoDArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int n = sc.nextInt();
        System.out.println("Enter the column size:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(sum(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
       
    }
    static int sum(int [][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
    }
    return sum;
}
}
